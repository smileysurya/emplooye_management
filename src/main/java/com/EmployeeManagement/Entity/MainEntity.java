package com.EmployeeManagement.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="EmployeeManagement")
public class MainEntity {
	
	@Id
	@SequenceGenerator(name="emp_gen",sequenceName = "emp_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "emp_gen",strategy = GenerationType.AUTO)
	private Integer Id;
	private String name;
    private String emailId;
	private String position ;
    private int salary;
    private  Date hiringDate;
    
}
