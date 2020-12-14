package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Horarios;
import sv.edu.services.api.HorariosServiceAPI;


@Controller
public class HorariosController {
	@Autowired
	private HorariosServiceAPI horariosServiceAPI;

	@RequestMapping("/listaHorarios")
	public String listaRoles(Model model) {
		model.addAttribute("list", horariosServiceAPI.getAll());
		return "listaHorarios";

	}

	@GetMapping("/saveHorarios/{id}")
	public String showSave(@PathVariable("id") String id, Model model) {
		if (id != null && !id.equals("0") ) {
			model.addAttribute("horarios", horariosServiceAPI.get(id));
		}else {
			model.addAttribute("horarios", new Horarios());
		}
		return "saveHorarios";

	}

	@PostMapping("/saveHorarios")
	public String save(Horarios horarios, Model model) {
		horariosServiceAPI.save(horarios);

		return "redirect:/listaHorarios";

	}

	@GetMapping("/deleteHorarios/{id}")
	public String delete(@PathVariable String id, Model model) {
		horariosServiceAPI.delete(id);

		return "redirect:/listaHorarios";
	}
}
