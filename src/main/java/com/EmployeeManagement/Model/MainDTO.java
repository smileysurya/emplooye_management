package com.EmployeeManagement.Model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MainDTO {
	
	private Integer Id;
	private String name;
    private String emailId;
	private String position ;
    private int salary;
    private  Date hiringDate;


}
