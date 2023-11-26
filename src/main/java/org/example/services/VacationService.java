package org.example.services;

import org.example.Entity.Employee;
import org.example.Entity.Vacation;
import org.example.model.EmployeeRepository;
import org.example.model.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacationService {
    @Autowired
    private VacationRepository vacationRepository;

    public List<Vacation> getAll()
    {
        List<Vacation> vacationList=vacationRepository.findAll();
        return vacationList;
    }
    public Optional<Vacation> getById(Integer id)
    {
        return vacationRepository.findById(id);
    }
    public Vacation getReferenceById(Integer id)
    {
        return vacationRepository.getReferenceById(id);
    }
    public void save(Vacation vacation)
    {
        vacationRepository.save(vacation);
    }
    public void update(Vacation v,Integer id)
    {

        vacationRepository.save(v);
    }
    public void delete(Vacation vacation)
    {
        vacationRepository.delete(vacation);
    }

}
