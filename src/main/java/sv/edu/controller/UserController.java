package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.loginSecurity.entity.User;
import sv.edu.services.api.UserServiceAPI;

@Controller
public class UserController {

	@Autowired
	private UserServiceAPI userAPI;
	
	@RequestMapping("/usuarios")
	public String usuarios(Model m) {
		m.addAttribute("list", userAPI.getAll());
		return "usuarios";
	}
	
	@GetMapping("/saveUsuario/{id}")
	public String showSave(@PathVariable("id") Long id, Model m) {
		if(id != null && id != 0) {
			m.addAttribute("usuario", userAPI.get(id));
		}else {
			m.addAttribute("usuario", new User());
		}
		return "saveUsuario";
	}
	
	@PostMapping("/saveUsuario")
	public String save(User usu, Model m) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		User usuario = new User(usu.getId(), usu.getUsername(), bCryptPasswordEncoder.encode(usu.getPassword()), usu.isEnabled());
		
		userAPI.save(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/deleteUsuario/{id}")
	public String delete(@PathVariable Long id, Model m) {
		userAPI.delete(id);
		return "redirect:/usuarios";
	}
}
