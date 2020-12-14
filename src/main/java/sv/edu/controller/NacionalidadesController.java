package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Nacionalidades;
import sv.edu.services.api.NacionalidadesServiceAPI;

@Controller
public class NacionalidadesController {
	@Autowired
	private NacionalidadesServiceAPI nacionAPI;
	
	@RequestMapping("/naciones")
	public String naciones(Model model) {
		model.addAttribute("list", nacionAPI.getAll());
		return "naciones";
	}
	
	@GetMapping("/saveNacion/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("nacion", nacionAPI.get(id));
		}else {
			model.addAttribute("nacion", new Nacionalidades());
		}
		
		return "saveNacion";
	}
	
	@PostMapping("/saveNacion")
	public String save(Nacionalidades nacion, Model model) {
		nacionAPI.save(nacion);
		return "redirect:/naciones";
	}
	
	@GetMapping("/deleteNacion/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		nacionAPI.delete(id);
		return "redirect:/naciones";
	}
}
