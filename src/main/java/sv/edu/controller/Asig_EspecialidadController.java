package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Asig_Especialidad;
import sv.edu.services.api.Asig_EspecialidadesServiceAPI;
import sv.edu.services.api.EspecialidadesServiceAPI;
import sv.edu.services.api.RegistrosServiceAPI;

@Controller
public class Asig_EspecialidadController {
	@Autowired
	private Asig_EspecialidadesServiceAPI asig_EspecialidadedesServceAPI;
	@Autowired
	private RegistrosServiceAPI regAPI;

	@Autowired
	private EspecialidadesServiceAPI especialidadServiceAPI;
	
	@RequestMapping("/listaAsig_Especialidades")
	public String listaAsig_Especialidades(Model model) {
		model.addAttribute("list", asig_EspecialidadedesServceAPI.getAll());
		return "listaAsig_Especialidades";
	}

	@GetMapping("/saveAsig_Especialidades/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("asig_Especialidades", asig_EspecialidadedesServceAPI.get(id));
			model.addAttribute("reg", regAPI.getAll());
			model.addAttribute("espe", especialidadServiceAPI.getAll());
		} else {
			model.addAttribute("asig_Especialidades", new Asig_Especialidad());
			model.addAttribute("reg", regAPI.getAll());
			model.addAttribute("espe", especialidadServiceAPI.getAll());
		}
		return "saveAsig_Especialidades";

	}

	@PostMapping("/saveAsig_Especialidades")
	public String save(Asig_Especialidad asig_Especialidades, Model model) {
		asig_EspecialidadedesServceAPI.save(asig_Especialidades);

		return "redirect:/listaAsig_Especialidades";

	}

	@GetMapping("/deleteAsigEspecialidades/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		asig_EspecialidadedesServceAPI.delete(id);

		return "redirect:/listaAsig_Especialidades";
	}

}
