package com.jana.jpademo.repository;

import com.jana.jpademo.model.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QualificationRepository extends JpaRepository<Qualification, Integer> {

    List<Qualification> getByEmployeeId(Integer id);
}
