package org.example.Controller;


import lombok.AllArgsConstructor;
import org.example.Handler.EmployeeHandler;
import org.example.dto.EmployeeDto;
import org.example.services.EmployeeService;
import org.example.utils.ReportFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor

public class EmployeeController {
    private EmployeeHandler employeeHandler;


    @GetMapping()
    public List<EmployeeDto> getAll(){
        return employeeHandler.getAll();
    }

    @GetMapping("/report")

    public void generateReport(HttpServletResponse response, @RequestParam(name = "employeeId", required = false) Integer employeeId,
                               @RequestParam(name = "language", required = false) String language,
                               @RequestParam(name = "format", required = false,defaultValue = "pdf") ReportFormat format)
    {
        employeeHandler.generateReport(response,employeeId,language,format);
    }
    @GetMapping("/{id}")
    public EmployeeDto getById(@PathVariable(value = "id") Integer id)
    {
        return employeeHandler.getById(id);

    }

    @PostMapping()
    public void save(@RequestBody EmployeeDto employeeDto){
        employeeHandler.save(employeeDto);
    }

    @PutMapping("/{id}")
    public void update (@RequestBody EmployeeDto employeeDto,
                        @PathVariable(value = "id") Integer id) {
        employeeHandler.update(employeeDto,id);
    }
    @DeleteMapping( "/{id}")
    public void delete (@PathVariable(value = "id") Integer id)
    {
        employeeHandler.delete(id);
    }



}
