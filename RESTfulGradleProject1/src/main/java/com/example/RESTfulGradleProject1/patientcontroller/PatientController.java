package com.example.RESTfulGradleProject1.patientcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/patients")
public class PatientController {	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> getPatients() {
		 List<Patient> result = new ArrayList<Patient>();
		 
		 Patient p1 = new Patient(); 
		 p1.setName("John"); 
		 p1.setId(10);
		 p1.setDiseaseDescription("Eye Infection"); 
		 result.add(p1);
		 
		 Patient p2 = new Patient(); 
		 p2.setName("Ravi"); 
		 p2.setId(20);
		 p2.setDiseaseDescription("Throat Infection"); 
		 result.add(p2);
		 
		 Patient p3 = new Patient(); 
		 p3.setName("Jay"); p3.setId(30);
		 p3.setDiseaseDescription("Ear Infection"); 
		 result.add(p3);
		 
		 return new ResponseEntity<>(result, HttpStatus.OK);
	 }
}
