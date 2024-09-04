package Job.Portal.System.service;

import Job.Portal.System.model.JobCategory;
import Job.Portal.System.repository.JobCategoryRepository;
import Job.Portal.System.service.JobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {

    @Autowired
    private JobCategoryRepository jobCategoryRepository;

    @Override
    public JobCategory addJobCategory(JobCategory jobCategory) {
        return jobCategoryRepository.save(jobCategory);
    }

    @Override
    public JobCategory updateJobCategory(JobCategory jobCategory) {
        return jobCategoryRepository.save(jobCategory);
    }

    @Override
    public List<JobCategory> getAllJobCategories() {
        return jobCategoryRepository.findAll();
    }

    @Override
    public void deleteJobCategory(Long id) {
        jobCategoryRepository.deleteById(id);
    }

    @Override
    public JobCategory findById(Long id) {
        return jobCategoryRepository.findById(id).orElse(null);
    }
}