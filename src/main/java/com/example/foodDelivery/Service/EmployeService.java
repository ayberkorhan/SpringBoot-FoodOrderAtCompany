package com.example.foodDelivery.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foodDelivery.Model.EmployeModel;
import com.example.foodDelivery.Repository.EmployeRepository;

@Service
public class EmployeService {
	
	private final EmployeRepository employeRepository;
	
	public EmployeService(EmployeRepository employeRepository) {
		this.employeRepository = employeRepository;
	}

//	
	public List<EmployeModel> getallEmployes(){
//		
		return new ArrayList<EmployeModel>((Collection<? extends EmployeModel>) employeRepository.findAll());
	}
//	
	public EmployeModel saveEmploye(EmployeModel employeModel) {
		return employeRepository.save(employeModel);
	}
//	
//	
	
}
