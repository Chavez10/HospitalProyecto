package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Registros;
import sv.edu.services.api.RegistrosServiceAPI;


@Controller
public class RegistrosController {
	
	@Autowired
	private RegistrosServiceAPI regAPI;
	
	@RequestMapping("/registros")
	public String registros(Model m) {
		m.addAttribute("list", regAPI.getAll());
		return "registros";
	}
	
	@GetMapping("/saveRegistro/{id}")
	public String showSave(@PathVariable("id") String id, Model m) {
		if(id != null && id.equals("0")) {
			m.addAttribute("registro", regAPI.get(id));
		}else {
			m.addAttribute("registro", new Registros());
		}
		return "saveRegistro";
	}
	
	@PostMapping("/saveRegistro")
	public String save(Registros reg) {
		regAPI.save(reg);
		return "redirect:/registros";
	}
	
	@GetMapping("/deleteRegistro/{id}")
	public String delete(@PathVariable String id) {
		regAPI.delete(id);
		return "redirect:/registros";
	}

}
