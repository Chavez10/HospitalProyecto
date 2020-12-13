package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Perfiles;
import sv.edu.services.api.PerfilesServiceAPI;


@Controller
public class PerfilesController {

	@Autowired
	private PerfilesServiceAPI perfilAPI;
	
	@RequestMapping("/perfiles")
	public String perfiles(Model model) {
		model.addAttribute("list", perfilAPI.getAll());
		return "perfiles";
	}
	
	@GetMapping("/savePerfil/{id}")
	public String showSave(@PathVariable("id") Integer id, Model m) {
		if(id != null && id != 0) {
			m.addAttribute("perfil", perfilAPI.get(id));
		}else {
			m.addAttribute("perfil", new Perfiles());
		}
		return "savePerfil";
	}
	
	@PostMapping("/savaPerfil")
	public String save(Perfiles per, Model m) {
		perfilAPI.save(per);
		return "redirect:/perfiles";
	}
	
	@GetMapping("/deletePerfil/{id}")
	public String delete(@PathVariable Integer id, Model m) {
		perfilAPI.delete(id);
		return "redirect:/perfiles";
	}
}
