package curdwork.contoroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import curdwork.entity.Tentity;
import curdwork.service.Tservice;
@Controller
public class Tcontoroller {
	
	@Autowired
	Tservice tservice;
	
	//トップ画面
	@GetMapping(value = "/user/product_list")
	  public String list(Model model) {
		//service経由でseachAllした（引き出した）ものをuserlistに詰めてる
		List<Tentity> userList =  tservice.searchAll();
		//userlistをaddAttributeでcrudworkに詰めてる
		model.addAttribute("crud_work", userList);
		//topページに返してる
	    return "user/product_list";
	}
	//登録画面に遷移する
	@GetMapping(value = "/user/form")
	  public String form(Model model) {
		model.addAttribute("tentity", new Tentity());
	    return "user/form";  
	} 
	//登録画面の登録を受け取る
	 @PostMapping("/user/form")
	    public String insert(@ModelAttribute Tentity tentity) {
		 tservice.insert(tentity);
	        return "user/form";
	 }

}
