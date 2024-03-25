package com.EmployeeManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement.Entity.Component_2;






@Repository
public interface Component_2Repository extends JpaRepository<Component_2, Integer> {
	Optional<Component_2> findFirstByOrderByIdDesc();
} 


