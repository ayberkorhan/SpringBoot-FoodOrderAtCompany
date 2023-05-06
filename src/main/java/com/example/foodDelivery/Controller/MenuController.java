package com.example.foodDelivery.Controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWord")
public class MenuController {

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

}
