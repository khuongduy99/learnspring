package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.ProductModel;
import com.spring.model.StudentModel;

@Controller
public class HelloWorldController {
	 @RequestMapping({"/", "/hello"})
	    public String hello(Model model) {
		 	StudentModel student = new StudentModel("Duy", 22);
	        model.addAttribute("Student", student);
	        return "admin/index";
	        
	    }
	 
	 
	 // This method get List Product
	 @RequestMapping("/products")
	    public String getListProduct(Model model) {
		 	List<ProductModel> list = new ArrayList<ProductModel>();
		 	for(int i = 1; i < 20; i ++) {
		 		ProductModel p = new ProductModel();
		 		p.setId(i);
		 		p.setName("Name " + i);
		 		p.setPrice(1000 + i);
		 		p.setStatus(1);
		 		list.add(p);
		 	}
		 	
	        model.addAttribute("ListProduct", list);
	        return "helloworld";
	        
	    }
	 
	// This method get List Product
		 @RequestMapping("/admin")
		    public String getAdminPage(Model model) {
			 	
		        return "admin/index";
		        
		    }
}
