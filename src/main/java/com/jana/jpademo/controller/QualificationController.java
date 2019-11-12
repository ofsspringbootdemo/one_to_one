package com.jana.jpademo.controller;

import com.jana.jpademo.model.Employee;
import com.jana.jpademo.model.Qualification;
import com.jana.jpademo.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/{employeeId}/qualification")
public class QualificationController {

    @Autowired
    private QualificationService service;

    @PostMapping
    public void saveQualification(@PathVariable("employeeId") int employeeId,
                                  @RequestBody List<Qualification> qualificationList) {

        Employee employee = new Employee();
        employee.setId(employeeId);

        for (Qualification qualification: qualificationList) {
            qualification.setEmployee(employee);
        }

        service.saveOrUpdate(qualificationList);
    }

    @GetMapping
    public List<Qualification> get(@PathVariable("employeeId") int employeeId) {
        return service.getByEmployee(employeeId);
    }
}
