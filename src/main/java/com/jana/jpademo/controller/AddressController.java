package com.jana.jpademo.controller;

import com.jana.jpademo.model.Address;
import com.jana.jpademo.model.Employee;
import com.jana.jpademo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/{employeeId}/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping
    public void saveAddress(@PathVariable("employeeId") int employeeId, @RequestBody Address address) {

        Employee employee = new Employee();
        employee.setId(employeeId);
        address.setEmployee(employee);

        service.saveOrUpdate(address);
    }

    @GetMapping
    public List<Address> get(@PathVariable("employeeId") int employeeId) {
        return service.getByEmployee(employeeId);
    }
}
