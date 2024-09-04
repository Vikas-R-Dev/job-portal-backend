package Job.Portal.System.service;

import Job.Portal.System.model.Job;
import Job.Portal.System.model.Employee;
import Job.Portal.System.model.JobCategory;
import Job.Portal.System.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getJobsByCompany(Employee company) {
        return jobRepository.findByCompany(company);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> searchJobs(String keyword) {
        return jobRepository.findAll().stream()
                .filter(job -> job.getTitle().toLowerCase().contains(keyword.toLowerCase())
                        || job.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Job> getJobsByCategory(JobCategory category) {
        return jobRepository.findByCategory(category);
    }

    @Override
    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }
}