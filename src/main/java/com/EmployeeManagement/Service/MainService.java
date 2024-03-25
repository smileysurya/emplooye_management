package com.EmployeeManagement.Service;

import java.util.List;

import com.EmployeeManagement.Model.MainDTO;


;

public interface MainService {
	
	public void addNewInfo(MainDTO mainDTO) throws Exception;

	public MainDTO getSingleInfoById(Integer id) throws Exception;
	public void updateInfo(Integer id, MainDTO  mainDTO) throws Exception;
	public void deleteInfo(Integer id) throws Exception;
	public List<MainDTO> getAllInfo() throws Exception;

}
