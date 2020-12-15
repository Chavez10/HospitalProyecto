package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.AsigTurnos;
import sv.edu.services.api.AsigTurnosServiceAPI;
import sv.edu.services.api.DiasTurnosServiceAPI;
import sv.edu.services.api.HorariosServiceAPI;
import sv.edu.services.api.RegistrosServiceAPI;


@Controller
public class AsigTurnosController {
	
	@Autowired
	private AsigTurnosServiceAPI asigTurnos;
	@Autowired
	private HorariosServiceAPI horariosServiceAPI;
	@Autowired
	private DiasTurnosServiceAPI diasTurnosServiceAPI;
	@Autowired
	private RegistrosServiceAPI regAPI;
	
	
	@RequestMapping("/asignaTurnos")
	public String asignaTurnos(Model m) {
		m.addAttribute("list", asigTurnos.getAll());
		return "asignaTurnos";
	}
	
	@GetMapping("/misTurnos")
	public String misTurnos(Model m) {
		m.addAttribute("list", asigTurnos.getAll());
		return "misTurnos";
	}
	
	@GetMapping("/saveAsignaTurno/{id}")
	public String showSave(@PathVariable("id") Integer id, Model m) {
		if (id != null && id != 0) {
			m.addAttribute("asigTurno", asigTurnos.get(id));
			m.addAttribute("horario", horariosServiceAPI.getAll());
			m.addAttribute("dia", diasTurnosServiceAPI.getAll());
			m.addAttribute("usu", regAPI.getAll());
		} else {
			m.addAttribute("asigTurno", new AsigTurnos());
			m.addAttribute("horario", horariosServiceAPI.getAll());
			m.addAttribute("dia", diasTurnosServiceAPI.getAll());
			m.addAttribute("usu", regAPI.getAll());
		}
		return "saveAsignaTurno";
	}
	
	@PostMapping("/saveAsignaTurno")
	public String save(AsigTurnos turno) {
		asigTurnos.save(turno);
		return "redirect:/asignaTurnos";
	}
	
	@GetMapping("/deleteAsigTurno/{id}")
	public String delete(@PathVariable Integer id) {
		asigTurnos.delete(id);
		return "redirect:/asignaTurnos";
	}

}
