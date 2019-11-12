package com.jana.jpademo.service;

import com.jana.jpademo.model.Employee;
import com.jana.jpademo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveOrUpdate(Employee employee) {
        repository.save(employee);
    }

    public Optional<Employee> get(Integer id) {
        return repository.findById(id);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
