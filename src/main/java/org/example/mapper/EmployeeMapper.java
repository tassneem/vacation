package org.example.mapper;

import org.example.Entity.Employee;
import org.example.dto.EmployeeDto;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface EmployeeMapper  extends GeneralMapper<Employee, EmployeeDto>{

}
