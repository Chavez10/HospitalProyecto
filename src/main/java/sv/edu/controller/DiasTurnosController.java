package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Dias_Turnos;
import sv.edu.services.api.DiasTurnosServiceAPI;


@Controller
public class DiasTurnosController {
	@Autowired
	private DiasTurnosServiceAPI diasTurnosServiceAPI;

	@RequestMapping("/listaDiasTurnos")
	public String listaDiasTurnos(Model model) {
		model.addAttribute("list", diasTurnosServiceAPI.getAll());
		return "listaDiasTurnos";

	}

	@GetMapping("/saveDiasTurnos/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("DiasTurnos", diasTurnosServiceAPI.get(id));
		}else {
			model.addAttribute("DiasTurnos", new Dias_Turnos());
		}
		return "saveDiasTurnos";

	}

	@PostMapping("/saveDiasTurnos")
	public String save(Dias_Turnos diasTurnos, Model model) {
		diasTurnosServiceAPI.save(diasTurnos);

		return "redirect:/listaDiasTurnos";

	}

	@GetMapping("/deleteDiasTurnos/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		diasTurnosServiceAPI.delete(id);

		return "redirect:/listaDiasTurnos";
	}
}
