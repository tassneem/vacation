package org.example.Handler;

import lombok.AllArgsConstructor;
import org.example.Entity.Employee;
import org.example.Exception.ResourceNotFoundException;
import org.example.dto.EmployeeDto;
import org.example.mapper.EmployeeMapper;
import org.example.services.EmployeeService;
import org.example.utils.JasperReportUtiles;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class EmployeeHandler {

    private EmployeeService employeeService;
    private EmployeeMapper employeeMapper;

    private JasperReportUtiles jasperReportUtiles;

    public List<EmployeeDto> getAll(){
        List<Employee> employeeList = employeeService.getAll();
        List<EmployeeDto> dtoList=employeeMapper.toDto(employeeList);
        return dtoList;
    }
    public EmployeeDto getById(Integer id)
    {
        Employee employee= employeeService.getById(id).
                orElseThrow(() -> new ResourceNotFoundException(Employee.class.getSimpleName(), id));

        EmployeeDto dto= employeeMapper.toDto(employee);
        return dto;
    }
    public void save(EmployeeDto dto){

        Employee employee =employeeMapper.toEntity(dto);

        employeeService.save(employee);
    }

    public void update(EmployeeDto dto , Integer id)
    {
        Optional<Employee> employee1= employeeService.getById(id);
        if(employee1.isPresent()&& id == dto.getId()) {
            Employee employee =employeeMapper.toEntity(dto);
            employeeService.save(employee);
        }
        else
            System.out.println("not found in update");
    }

    public void delete( Integer id)
    {
        Optional<Employee> employee1= employeeService.getById(id);
        if(employee1.isPresent()) {
            employeeService.delete(employee1.get());
        }
        else
            System.out.println("not found in delete");
    }
    public void generateReport()
    {
        jasperReportUtiles.gerarJasper();
    }

}
