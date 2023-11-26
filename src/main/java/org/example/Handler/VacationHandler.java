package org.example.Handler;

import lombok.AllArgsConstructor;
import org.example.Entity.Employee;
import org.example.Entity.Vacation;
import org.example.dto.EmployeeDto;
import org.example.dto.VacationDto;
import org.example.mapper.EmployeeMapper;
import org.example.mapper.VacationMapper;
import org.example.services.EmployeeService;
import org.example.services.VacationService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class VacationHandler {
    private VacationService vacationService;
    private VacationMapper vacationMapper;

    public List<VacationDto> getAll(){
        List<Vacation> vacationList = vacationService.getAll();
        List<VacationDto> dtoList=vacationMapper.toDto(vacationList);
        return dtoList;
    }
    public VacationDto getById(Integer id)
    {
        Optional<Vacation> vacation= vacationService.getById(id);

        if(vacation.isPresent()){

            VacationDto dto= vacationMapper.toDto(vacation.get());
            return dto;
        }
        else {
            return new VacationDto();
        }
    }
    public void save(VacationDto dto){

        Vacation vacation =vacationMapper.toEntity(dto);

        vacationService.save(vacation);
    }

    public void update(VacationDto dto , Integer id)
    {
        Optional<Vacation> vacation1= vacationService.getById(id);
        if(vacation1.isPresent() && id == dto.getId()) {
            Vacation vacation =vacationMapper.toEntity(dto);
            vacationService.save(vacation);
        }
        else
            System.out.println("not found in update");
    }

    public void delete( Integer id)
    {
        Optional<Vacation> vacation1= vacationService.getById(id);
        if(vacation1.isPresent()) {
            vacationService.delete(vacation1.get());
        }
        else
            System.out.println("not found in delete");
    }

}
