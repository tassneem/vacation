package org.example.dto;

import lombok.Data;
import org.example.Entity.Employee;

@Data
public class VacationDto {

    private Integer id;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private VacationTypeDto vacationType;
    private EmployeeDto employee;


}
