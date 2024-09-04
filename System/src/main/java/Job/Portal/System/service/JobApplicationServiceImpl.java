package Job.Portal.System.service;

import Job.Portal.System.model.JobApplication;
import Job.Portal.System.model.User;
import Job.Portal.System.model.Job;
import Job.Portal.System.repository.JobApplicationRepository;
import Job.Portal.System.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    @Override
    public JobApplication applyForJob(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    @Override
    public List<JobApplication> getJobApplicationsByJobSeeker(User jobSeeker) {
        return jobApplicationRepository.findByJobSeeker(jobSeeker);
    }

    @Override
    public List<JobApplication> getJobApplicationsByJob(Job job) {
        return jobApplicationRepository.findByJob(job);
    }

    @Override
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    @Override
    public JobApplication updateJobApplicationStatus(Long id, JobApplication.Status status) {
        JobApplication jobApplication = jobApplicationRepository.findById(id).orElse(null);
        if (jobApplication != null) {
            jobApplication.setStatus(status);
            return jobApplicationRepository.save(jobApplication);
        }
        return null;
    }
}
