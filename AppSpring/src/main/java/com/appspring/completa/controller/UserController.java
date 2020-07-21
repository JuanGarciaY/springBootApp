	package com.appspring.completa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.appspring.completa.model.User;
import com.appspring.completa.repository.IRoleRepository;
import com.appspring.completa.service.IUserService;

@Controller
public class UserController {

	@Autowired
	IRoleRepository roleRepository; //Se utiliza directamente el repositorio ya que unicamente se va a listar los roles por eso no es necesario tener una capa extra.
	@Autowired 
	IUserService userService;
	
	
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		
		return "user-form/user-view";	
	}
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
}