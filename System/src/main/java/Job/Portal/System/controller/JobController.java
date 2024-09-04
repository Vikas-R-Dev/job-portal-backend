package Job.Portal.System.controller;

import Job.Portal.System.model.Job;
import Job.Portal.System.model.Employee;
import Job.Portal.System.model.JobCategory;
import Job.Portal.System.service.JobService;
import Job.Portal.System.service.EmployeeService;
import Job.Portal.System.service.JobCategoryService;
import Job.Portal.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JobCategoryService jobCategoryService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Job> addJob(@RequestBody Job job) {
        Job newJob = jobService.addJob(job);
        return ResponseEntity.ok(newJob);
    }

    @GetMapping("/company/{companyId}")
    public ResponseEntity<List<Job>> getJobsByCompany(@PathVariable Long companyId) {
        Employee company = employeeService.findByUser(userService.findByUsername(companyId.toString()));
        if (company != null) {
            List<Job> jobs = jobService.getJobsByCompany(company);
            return ResponseEntity.ok(jobs);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        List<Job> jobs = jobService.getAllJobs();
        return ResponseEntity.ok(jobs);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Job>> searchJobs(@RequestParam String keyword) {
        List<Job> jobs = jobService.searchJobs(keyword);
        return ResponseEntity.ok(jobs);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Job>> getJobsByCategory(@PathVariable Long categoryId) {
        JobCategory category = jobCategoryService.findById(categoryId);
        if (category != null) {
            List<Job> jobs = jobService.getJobsByCategory(category);
            return ResponseEntity.ok(jobs);
        }
        return ResponseEntity.notFound().build();
    }
}