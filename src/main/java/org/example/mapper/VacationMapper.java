package org.example.mapper;

import org.example.Entity.Employee;
import org.example.Entity.Vacation;
import org.example.dto.EmployeeDto;
import org.example.dto.VacationDto;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface VacationMapper extends GeneralMapper<Vacation, VacationDto>{
}
