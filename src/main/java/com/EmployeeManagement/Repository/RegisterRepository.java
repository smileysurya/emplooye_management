package com.EmployeeManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement.Entity.Register;






@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {
	

	Optional<Register> findByEmailId(String emailId);
	Optional<Register> deleteByEmailId(String emailId);
	
	

}
