package Job.Portal.System.service;

import Job.Portal.System.model.Employee;
import Job.Portal.System.model.User;
import Job.Portal.System.repository.EmployeeRepository;
import Job.Portal.System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeProfile(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findByUser(User user) {
        return employeeRepository.findByUser(user);
    }
}