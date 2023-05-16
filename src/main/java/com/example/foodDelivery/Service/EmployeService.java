package com.example.foodDelivery.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.foodDelivery.Exceptions.EmpNotFoundException;
import com.example.foodDelivery.Model.EmployeModel;
import com.example.foodDelivery.Repository.EmployeRepository;

@Service
public class EmployeService {
	
	private final EmployeRepository employeRepository;
	
	public EmployeService(EmployeRepository employeRepository) {
		this.employeRepository = employeRepository;
	}

	
	public List<EmployeModel> getallEmployes(){
		
		return new ArrayList<EmployeModel>((Collection<? extends EmployeModel>) employeRepository.findAll());
	}
	
	public EmployeModel saveEmploye(EmployeModel employeModel) {
		return employeRepository.save(employeModel);
	}
	
	public String getById(String ip) {
		//Optional<EmployeModel> employe = employeRepository.findById(ip);

		//return employe.isPresent() ?  "cachde tanımlı  "+employe.get().getName() : "cache de yok  "+ip;
		
		Optional<EmployeModel> emp = Optional.ofNullable(new EmployeModel());
		
		//emp =	employeRepository.findById("abc");
		//System.out.print(employeRepository.findById("abc").get().getIp());
		//System.out.print(emp.get().getIp());
		
			//employeRepository.findById("abc").orElseThrow(() ->new EmpNotFoundException());
		
		
		employeRepository.findById(ip).ifPresentOrElse(
		        employe -> {throw new EmpNotFoundException();} ,
		        () -> System.out.println("ip yok")
		);
		
		
		return employeRepository.findById(ip).isPresent() ? "cachde tanımlı " :getOrder()+ip;
	}
	
	public String getOrder() {
		
		//logic will be add
		return "cache de yok ip: ";
	}


}
