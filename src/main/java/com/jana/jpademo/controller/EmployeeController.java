package com.jana.jpademo.controller;

import com.jana.jpademo.model.Employee;
import com.jana.jpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public void saveEmployee(@RequestBody Employee e) {
        service.saveOrUpdate(e);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) {
        if (service.get(id).isPresent()) {
            return new ResponseEntity<Employee>(service.get(id).get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        service.delete(id);
    }
}
