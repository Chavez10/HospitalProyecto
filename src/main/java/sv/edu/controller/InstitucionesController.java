package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Instituciones;
import sv.edu.services.api.InstitucionesServiceAPI;


@Controller
public class InstitucionesController {


	@Autowired
	private InstitucionesServiceAPI institucionesServiceAPI;

	@RequestMapping("/listaInstituciones")
	public String listaInstituciones(Model model) {
		model.addAttribute("list", institucionesServiceAPI.getAll());
		return "listaInstituciones";

	}

	@GetMapping("/saveInstituciones/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("instituciones", institucionesServiceAPI.get(id));
		}
		return "saveInstituciones";

	}

	@PostMapping("/saveInstituciones")
	public String save(Instituciones instituciones, Model model) {
		institucionesServiceAPI.save(instituciones);

		return "redirect:/listaInstituciones";

	}

	@GetMapping("/deleteInstituciones/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		institucionesServiceAPI.delete(id);

		return "redirect:/listainstituciones";
	}
}
