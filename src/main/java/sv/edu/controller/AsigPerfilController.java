package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Asig_Perfil;
import sv.edu.services.api.AsigPerfilServiceAPI;
import sv.edu.services.api.PerfilesServiceAPI;
import sv.edu.services.api.RegistrosServiceAPI;


@Controller
public class AsigPerfilController {
	
	@Autowired
	private AsigPerfilServiceAPI asigPerAPI;
	@Autowired
	private RegistrosServiceAPI regAPI;
	@Autowired
	private PerfilesServiceAPI perfilAPI;
	
	@RequestMapping("/asignacionPerfiles")
	public String asignacionPerfiles(Model m) {
		m.addAttribute("list", asigPerAPI.getAll());
		return "asignacionPerfiles";
	}
	
	@GetMapping("/saveAsigPerfil/{id}")
	public String showSave(@PathVariable("id") Integer id, Model m) {
		if (id != null && id != 0) {
			m.addAttribute("asigPerfil", asigPerAPI.get(id));
			m.addAttribute("reg", regAPI.getAll());
			m.addAttribute("perf", perfilAPI.getAll());
			
		} else {
			m.addAttribute("asigPerfil", new Asig_Perfil());
			m.addAttribute("reg", regAPI.getAll());
			m.addAttribute("perf", perfilAPI.getAll());
		}
		return "saveAsigPerfil";
	}
	
	@PostMapping("/saveAsigPerfil")
	public String save(Asig_Perfil asg) {
		asigPerAPI.save(asg);
		return "redirect:/asignacionPerfiles";
	}
	
	@GetMapping("/deleteAsigPerfil/{id}")
	public String delete(@PathVariable Integer id) {
		asigPerAPI.delete(id);
		return "redirect:/asignacionPerfiles";
	}

}
