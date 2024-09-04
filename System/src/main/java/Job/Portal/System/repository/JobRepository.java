package Job.Portal.System.repository;

import Job.Portal.System.model.Employee;
import Job.Portal.System.model.Job;
import Job.Portal.System.model.JobCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByCompany(Employee company);
    List<Job> findByCategory(JobCategory category);
}

