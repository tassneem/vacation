package org.example.Controller;

import lombok.AllArgsConstructor;
import org.example.Entity.Vacation;
import org.example.Handler.EmployeeHandler;
import org.example.Handler.VacationHandler;
import org.example.dto.EmployeeDto;
import org.example.dto.VacationDto;
import org.example.services.EmployeeService;
import org.example.services.VacationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vacation")
@AllArgsConstructor
public class VacationController {

    private VacationService vacationService;
    private VacationHandler vacationHandler;

    @GetMapping()
    public List<VacationDto> getAll(){
        return vacationHandler.getAll();
    }
    @GetMapping("/{id}")
    public VacationDto getById(@PathVariable(value = "id") Integer id)
    {
        return vacationHandler.getById(id);

    }

    @PostMapping()
    public void save(@RequestBody VacationDto vacationDto){
        vacationHandler.save(vacationDto);
    }

    @PutMapping("/{id}")
    public void update (@RequestBody VacationDto vacationDto,
                        @PathVariable(value = "id") Integer id) {
        vacationHandler.update(vacationDto,id);
    }
    @DeleteMapping( "/{id}")
    public void delete (@PathVariable(value = "id") Integer id)
    {
        vacationHandler.delete(id);
    }



}
