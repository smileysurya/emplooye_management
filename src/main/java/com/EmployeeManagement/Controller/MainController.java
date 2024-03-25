package com.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.Model.MainDTO;
import com.EmployeeManagement.Service.MainService;






@RestController()
@RequestMapping("/EmployeeManagement")
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	
	@PostMapping("/addInfo")
	  public ResponseEntity<String> addInfo(@RequestBody MainDTO mainDTO) throws Exception{
		  ResponseEntity<String> response=null;
		  try {
		 
			  mainService.addNewInfo(mainDTO);
		 
		  response=new   ResponseEntity<String>(HttpStatus.CREATED);
		  }catch (Exception e) {
			if(e.getMessage()!=null) {
			response=new   ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
			}
		}
		return response;
		  
		  
		  
	  }
	  
	
		@GetMapping("/getInfoById")
		  public ResponseEntity<MainDTO> getStudent(@RequestParam("id") Integer id)throws Exception{
				ResponseEntity<MainDTO> response=null;
			  
			  try {
				  MainDTO std=mainService.getSingleInfoById(id);
				   response= new  ResponseEntity<MainDTO>(std,HttpStatus.OK);
			  }catch (Exception e) {
				throw e;
			}

			return response;
			  
		  }
		
	  @DeleteMapping("/deleteInfo")
	  public ResponseEntity<String> deleteStudent(@RequestParam("id") Integer id) throws Exception{
		  ResponseEntity<String> response=null;
		  try {
			  mainService.deleteInfo(id);
		  response=new   ResponseEntity<String>(HttpStatus.OK);
		  }catch (Exception e) {
			if(e.getMessage()!=null) {
			
			response=new   ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
			}
		}
		return response;
	  }
	  
	  @PutMapping("/updateInfo")
	  public ResponseEntity<String> updateStudent(@RequestParam("id") Integer id,@RequestBody MainDTO mainDTO ) throws Exception{
		  ResponseEntity<String> response=null;
		  try {
		 
		 
			  mainService.updateInfo(id, mainDTO);
		  response=new   ResponseEntity<String>(HttpStatus.OK);
		  }catch (Exception e) {
			if(e.getMessage()!=null) {
			
			response=new   ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
			}
		}
		return response;
	  }
	  @GetMapping("/getAllInfo")
	  public ResponseEntity<List<MainDTO>>getStudentList()throws Exception{
			ResponseEntity<List<MainDTO>>response=null;
		  
		  try {
			  List<MainDTO> mainDtos=mainService.getAllInfo();
			   response= new ResponseEntity<List<MainDTO>> (mainDtos,HttpStatus.OK);
		  }catch (Exception e) {
		 throw e;
		}

		return response;
		  
	}

}
