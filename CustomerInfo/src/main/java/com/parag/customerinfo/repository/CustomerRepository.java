package com.parag.customerinfo.repository;

import com.parag.customerinfo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByUsername(String username);

    Optional<Customer> findByPhoneNumber(String phoneNumber);

    Optional<List<Customer>> findByCity(String city);

    @Query("SELECT c.dateOfBirth FROM Customer c")
    List<LocalDate> findAllDateOfBirths();

}
