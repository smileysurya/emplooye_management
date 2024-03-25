package com.EmployeeManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.Entity.MainEntity;
import com.EmployeeManagement.Model.MainDTO;
import com.EmployeeManagement.Repository.MainRepository;





@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	private MainRepository mainRepository;

	@Override
	public void addNewInfo(MainDTO mainDTO) throws Exception {
		
		MainEntity mainEntity=new MainEntity();
		mainEntity.setName(mainDTO.getName());
		mainEntity.setPosition(mainDTO.getPosition());
		mainEntity.setEmailId(mainDTO.getEmailId());
		mainEntity.setHiringDate(mainDTO.getHiringDate());
		mainEntity.setSalary(mainDTO.getSalary());
		mainRepository.save(mainEntity);
		
	}


	@Override
	public MainDTO getSingleInfoById(Integer id) throws Exception {
		Optional<MainEntity> optional=mainRepository.findById(id);
		MainEntity mainEntity=optional.orElseThrow(()-> new Exception("Service.Not_Found"));
		MainDTO mainDTO=new MainDTO();
		mainDTO.setId(mainEntity.getId());
		mainDTO.setName(mainEntity.getName());
		mainDTO.setPosition(mainEntity.getPosition());
		mainDTO.setEmailId(mainEntity.getEmailId());
		mainDTO.setHiringDate(mainEntity.getHiringDate());
		mainDTO.setSalary(mainEntity.getSalary());
		
		
		return mainDTO;
	}

	@Override
	public void updateInfo(Integer id, MainDTO mainDTO) throws Exception {
		Optional<MainEntity> optional=mainRepository.findById(id);
		MainEntity mainEntity=optional.orElseThrow(()-> new Exception("Service.Not_Found"));
		mainEntity.setName(mainDTO.getName());
		mainEntity.setPosition(mainDTO.getPosition());
		mainEntity.setEmailId(mainDTO.getEmailId());
		mainEntity.setHiringDate(mainDTO.getHiringDate());
		mainEntity.setSalary(mainDTO.getSalary());
		mainRepository.save(mainEntity);
	}

	@Override
	public void deleteInfo(Integer id) throws Exception {
		Optional<MainEntity> optional=mainRepository.findById(id);
		if(optional.isEmpty()) {
			throw new Exception("Service.Not_Found");
		}
		mainRepository.deleteById(id);
		
	}

	@Override
	public List<MainDTO> getAllInfo() throws Exception {
	List<MainDTO>mainDTOs=new ArrayList<>();
	Iterable<MainEntity> infoFromRepo=mainRepository.findAll();
	for(MainEntity mainEntity:infoFromRepo) {
		MainDTO mainDTO=new MainDTO();
		mainDTO.setId(mainEntity.getId());
		mainDTO.setId(mainEntity.getId());
		mainDTO.setName(mainEntity.getName());
		mainDTO.setPosition(mainEntity.getPosition());
		mainDTO.setEmailId(mainEntity.getEmailId());
		mainDTO.setHiringDate(mainEntity.getHiringDate());
		mainDTO.setSalary(mainEntity.getSalary());
		
		mainDTOs.add(mainDTO);
	}
		return mainDTOs;
	}

}
