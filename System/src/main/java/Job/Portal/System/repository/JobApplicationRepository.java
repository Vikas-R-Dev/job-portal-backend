package Job.Portal.System.repository;

import Job.Portal.System.model.Job;
import Job.Portal.System.model.JobApplication;
import Job.Portal.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    List<JobApplication> findByJobSeeker(User jobSeeker);
    List<JobApplication> findByJob(Job job);
}
