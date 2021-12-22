package curdwork.contoroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	 //編集画面に遷移して、１件の情報を取り出す	 
	 @GetMapping(value = "/user/edit/{id}")
	//@PathVariableアノテーションを指定すると、URLに含まれる動的なパラメータを受け取ることができる
	 //動的なパラメータを受け取ったeditoneメソッドは、サービスクラスを呼び出す
	  public String editone(@PathVariable int id,Model model) {
		 
		 Tentity tentity = tservice.findById(id);
		model.addAttribute("tentity", tentity);
	    return "user/edit";  
	 }
	 //編集画面の更新処理
	 @PostMapping("/user/edit/{id}") 
	    public String update(Tentity tentity) {
	        tservice.update(tentity);
	        return "user/edit";
	    }
	 //削除
	 //delateメソッドで実行　サービスクラスを呼び出し削除後、一覧画面にリダイレクト
	 @PostMapping("/user/delete/{id}")
	    public String delete(Tentity tentity) {
	        tservice.delete(tentity);
	        return "redirect:/user/product_list";
	 }

}
