package org.example.services;

import org.example.Entity.Employee;
import org.example.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll()
    {
        List<Employee> employeeList=employeeRepository.findAll();
        return employeeList;
    }
    public Optional<Employee> getById(Integer id)
    {
        return employeeRepository.findById(id);
    }
    public Employee getReferenceById(Integer id)
    {
        return employeeRepository.getReferenceById(id);
    }
    public void save(Employee employee)
    {
        employeeRepository.save(employee);
    }
    public void update(Employee e,Integer id)
    {

        employeeRepository.save(e);
    }
    public void delete(Employee employee)
    {
        employeeRepository.delete(employee);
    }

}
