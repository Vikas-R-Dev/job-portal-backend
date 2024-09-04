package Job.Portal.System.service;

import Job.Portal.System.model.Job;
import Job.Portal.System.model.Employee;
import Job.Portal.System.model.JobCategory;

import java.util.List;
import java.util.Optional;

public interface JobService {
    Job addJob(Job job);
    List<Job> getJobsByCompany(Employee company);
    List<Job> getAllJobs();
    List<Job> searchJobs(String keyword);
    List<Job> getJobsByCategory(JobCategory category);
    Optional<Job> findById(Long id);  // Add this method
}