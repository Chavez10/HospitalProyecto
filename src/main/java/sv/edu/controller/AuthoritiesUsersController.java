package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.AuthoritiesUsers;
import sv.edu.services.api.AuthoritiesUsersServiceAPI;


@Controller
public class AuthoritiesUsersController {
	
	@Autowired
	private AuthoritiesUsersServiceAPI authAPI;
	
	
	@RequestMapping("/autorizaciones")
	public String autorizaciones(Model m) {
		m.addAttribute("list", authAPI.getAll());
		return "autorizaciones";
	}
	
	@GetMapping("/saveAutorizacion/{id}")
	public String showSave(@PathVariable("id") Long id, Model m) {
		if(id != null && id != 0) {
			m.addAttribute("autoriza", authAPI.get(id));
		}else {
			m.addAttribute("autoriza", new AuthoritiesUsers());
		}
		return "saveAutorizacion";
		
	}
	
	@PostMapping("/saveAutorizacion")
	public String save(AuthoritiesUsers ath) {
		authAPI.save(ath);
		return "redirect:/autorizaciones";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		authAPI.delete(id);
		return "redirect:/autorizaciones";
	}
}
