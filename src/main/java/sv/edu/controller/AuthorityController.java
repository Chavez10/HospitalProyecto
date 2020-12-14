package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.loginSecurity.entity.Authority;
import sv.edu.services.api.AuthorityServiceAPI;

@Controller
public class AuthorityController {
	
	@Autowired
	private AuthorityServiceAPI authAPI;
	
	@RequestMapping("/roles")
	public String roles(Model m) {
		m.addAttribute("list", authAPI.getAll());
		return "roles";
	}
	
	@GetMapping("/saveRoles/{id}")
	public String showSave(@PathVariable("id") Long id, Model m) {
		if(id != null && id != 0) {
			m.addAttribute("auth", authAPI.get(id));
		}else {
			m.addAttribute("auth", new Authority());
		}
		return "saveRoles";
	}
	
	@PostMapping("/savaeRoles")
	public String sava(Authority au) {
		authAPI.save(au);
		return "redirect:/roles";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		authAPI.delete(id);
		return "redirect:/roles";
	}
}
