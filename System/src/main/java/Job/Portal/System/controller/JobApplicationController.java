package Job.Portal.System.controller;

import Job.Portal.System.model.JobApplication;
import Job.Portal.System.model.User;
import Job.Portal.System.model.Job;
import Job.Portal.System.service.JobApplicationService;
import Job.Portal.System.service.UserService;
import Job.Portal.System.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(JobApplicationController.class);
    @Autowired
    private JobApplicationService jobApplicationService;

    @Autowired
    private UserService userService;

    @Autowired
    private JobService jobService;

    @PostMapping
    public ResponseEntity<JobApplication> applyForJob(@RequestBody JobApplication jobApplication) {
        JobApplication newJobApplication = jobApplicationService.applyForJob(jobApplication);
        return ResponseEntity.ok(newJobApplication);
    }

    @GetMapping("/job-seeker/{jobSeekerId}")
    public ResponseEntity<List<JobApplication>> getJobApplicationsByJobSeeker(@PathVariable Long jobSeekerId) {
        logger.info("Fetching job applications for job seeker with ID: {}", jobSeekerId);
        Optional<User> jobSeeker = userService.findById(jobSeekerId);
        if (jobSeeker.isPresent()) {
            List<JobApplication> jobApplications = jobApplicationService.getJobApplicationsByJobSeeker(jobSeeker.get());
            logger.info("Found {} job applications for job seeker with ID: {}", jobApplications.size(), jobSeekerId);
            return ResponseEntity.ok(jobApplications);
        } else {
            logger.warn("Job seeker with ID {} not found", jobSeekerId);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/job/{jobId}")
    public ResponseEntity<List<JobApplication>> getJobApplicationsByJob(@PathVariable Long jobId) {
        Optional<Job> job = jobService.findById(jobId);
        if (job.isPresent()) {
            List<JobApplication> jobApplications = jobApplicationService.getJobApplicationsByJob(job.get());
            return ResponseEntity.ok(jobApplications);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<JobApplication>> getAllJobApplications() {
        logger.info("Fetching all job applications");
        List<JobApplication> jobApplications = jobApplicationService.getAllJobApplications();
        logger.info("Found {} job applications", jobApplications.size());
        return ResponseEntity.ok(jobApplications);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<JobApplication> updateJobApplicationStatus(@PathVariable Long id, @RequestBody JobApplication.Status status) {
        JobApplication updatedJobApplication = jobApplicationService.updateJobApplicationStatus(id, status);
        return updatedJobApplication != null ? ResponseEntity.ok(updatedJobApplication) : ResponseEntity.notFound().build();
    }
}