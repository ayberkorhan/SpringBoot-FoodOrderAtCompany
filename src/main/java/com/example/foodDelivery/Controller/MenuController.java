package com.example.foodDelivery.Controller;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodDelivery.Model.EmployeModel;
import com.example.foodDelivery.Repository.EmployeRepository;
import com.example.foodDelivery.Service.EmployeService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("helloWord")
public class MenuController {
	
	public MenuController(EmployeService employeService) {
		super();
		this.employeService = employeService;
	}


	private final EmployeService employeService;
	
	
	@Cacheable("menu")
	@GetMapping()
	public String hello() throws Exception {

		Thread.sleep(5 * 1000);
		System.out.print("controller worked");
		return "HELLO-WORLD";
	}

	@CacheEvict(value = "menu", allEntries = true)
	@GetMapping("sil")
	public String delete() {
		return "silindi";
	}
	
	
	@PostMapping("save")
	public ResponseEntity<EmployeModel> saveEmploye(@RequestBody EmployeModel employeModel){
		return ResponseEntity.ok(employeService.saveEmploye(employeModel));
		//return ResponseEntity.ok(employeModel);
		
		
	}
	
	
	@GetMapping("employeList")
	public ResponseEntity<List<EmployeModel>> getAllEmployes(){
		return ResponseEntity.ok(employeService.getallEmployes());
	}
	
	@GetMapping("cacheCheck")
	public ResponseEntity<String> cacheCheck(HttpServletRequest request ) {
		return ResponseEntity.ok(employeService.getById(request.getRemoteAddr()));
	}
	 

}
