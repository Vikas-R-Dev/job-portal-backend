package Job.Portal.System.service;

import Job.Portal.System.model.JobCategory;
import java.util.List;

public interface JobCategoryService {
    JobCategory addJobCategory(JobCategory jobCategory);
    JobCategory updateJobCategory(JobCategory jobCategory);
    List<JobCategory> getAllJobCategories();
    void deleteJobCategory(Long id);
    JobCategory findById(Long id);
}