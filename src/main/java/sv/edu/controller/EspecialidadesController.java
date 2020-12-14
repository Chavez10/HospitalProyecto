package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Especialidades;
import sv.edu.services.api.EspecialidadesServiceAPI;

@Controller
public class EspecialidadesController {
 
	@Autowired
	private EspecialidadesServiceAPI especialidadServiceAPI;
	
	@RequestMapping("/listaEspecialidades")
	public String listaEspecialidades(Model model) {
		model.addAttribute("list", especialidadServiceAPI.getAll());
		return "listaEspecialidades";
	}
	

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("especialidades", especialidadServiceAPI.get(id));
		}
		return "saveEspecialidades";

	}


	@PostMapping("/save")
	public String save(Especialidades especialidades, Model model) {
		especialidadServiceAPI.save(especialidades);

		return "redirect:/listaEspecialidades";

	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		especialidadServiceAPI.delete(id);

		return "redirect:/listaEspecialidades";
	}
	
}
