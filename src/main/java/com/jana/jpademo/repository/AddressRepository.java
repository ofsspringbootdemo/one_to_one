package com.jana.jpademo.repository;

import com.jana.jpademo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    List<Address> getByEmployeeId(Integer id);
}
