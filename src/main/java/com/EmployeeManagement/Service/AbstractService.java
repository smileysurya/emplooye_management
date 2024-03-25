package com.EmployeeManagement.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.EmployeeManagement.Model.AbstractDTO;






public interface AbstractService {
	
	public void addNewAbstract(String absDef,MultipartFile file) throws Exception;
	public List<AbstractDTO> getAbstract()throws Exception;
	public AbstractDTO getAbstractDef() throws Exception;
	public  byte[]getAbstractImg() throws Exception;
	public void updateAbstract(String absDef,MultipartFile file) throws Exception;
}
