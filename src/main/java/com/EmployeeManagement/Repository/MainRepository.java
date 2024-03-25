package com.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.Entity.MainEntity;




public interface MainRepository extends JpaRepository<MainEntity, Integer> {

}
