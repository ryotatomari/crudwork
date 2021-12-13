package curdwork.contoroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import curdwork.entity.Tentity;
import curdwork.service.Tservice;
@Controller
public class Tcontoroller {
	
	@Autowired
	Tservice tservice;
	
	@GetMapping(value = "/user/product_list")
	  public String list(Model model) {
		List<Tentity> userList =  tservice.searchAll();
		model.addAttribute("crud_work", userList);
	    return "user/product_list";
	}

}
