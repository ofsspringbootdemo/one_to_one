package com.jana.jpademo.service;

import com.jana.jpademo.model.Address;
import com.jana.jpademo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public void saveOrUpdate(Address address) {
        repository.save(address);
    }

    public Optional<Address> get(int id) {
        return repository.findById(id);
    }

    public List<Address> getByEmployee(int id) {
        return repository.getByEmployeeId(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
