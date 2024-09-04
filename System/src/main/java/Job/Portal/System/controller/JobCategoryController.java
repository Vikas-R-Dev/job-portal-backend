package Job.Portal.System.controller;

import Job.Portal.System.model.JobCategory;
import Job.Portal.System.service.JobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-categories")
public class JobCategoryController {

    @Autowired
    private JobCategoryService jobCategoryService;

    @PostMapping
    public ResponseEntity<JobCategory> addJobCategory(@RequestBody JobCategory jobCategory) {
        JobCategory newJobCategory = jobCategoryService.addJobCategory(jobCategory);
        return ResponseEntity.ok(newJobCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobCategory> updateJobCategory(@PathVariable Long id, @RequestBody JobCategory jobCategory) {
        jobCategory.setId(id);
        JobCategory updatedJobCategory = jobCategoryService.updateJobCategory(jobCategory);
        return ResponseEntity.ok(updatedJobCategory);
    }

    @GetMapping
    public ResponseEntity<List<JobCategory>> getAllJobCategories() {
        List<JobCategory> jobCategories = jobCategoryService.getAllJobCategories();
        return ResponseEntity.ok(jobCategories);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobCategory(@PathVariable Long id) {
        jobCategoryService.deleteJobCategory(id);
        return ResponseEntity.noContent().build();
    }
}