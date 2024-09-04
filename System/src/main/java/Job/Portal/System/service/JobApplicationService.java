package Job.Portal.System.service;

import Job.Portal.System.model.JobApplication;
import Job.Portal.System.model.User;
import Job.Portal.System.model.Job;

import java.util.List;

public interface JobApplicationService {
    JobApplication applyForJob(JobApplication jobApplication);
    List<JobApplication> getJobApplicationsByJobSeeker(User jobSeeker);
    List<JobApplication> getJobApplicationsByJob(Job job);
    List<JobApplication> getAllJobApplications();
    JobApplication updateJobApplicationStatus(Long id, JobApplication.Status status);
}