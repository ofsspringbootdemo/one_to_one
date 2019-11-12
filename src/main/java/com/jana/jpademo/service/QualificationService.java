package com.jana.jpademo.service;

import com.jana.jpademo.model.Qualification;
import com.jana.jpademo.repository.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualificationService {

    @Autowired
    private QualificationRepository repository;

    public void saveOrUpdate(List<Qualification> qualificationList) {
        repository.saveAll(qualificationList);
    }

    public List<Qualification> getByEmployee(int id) {
        return repository.getByEmployeeId(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
