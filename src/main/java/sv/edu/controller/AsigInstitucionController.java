package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Asig_Institucion;
import sv.edu.services.api.AsigInstitucionServiceAPI;
import sv.edu.services.api.InstitucionesServiceAPI;
import sv.edu.services.api.NivelEducativoServiceAPI;
import sv.edu.services.api.RegistrosServiceAPI;


@Controller
public class AsigInstitucionController {
	
	@Autowired
	private AsigInstitucionServiceAPI asigInstAPI;
	@Autowired
	private RegistrosServiceAPI regAPI;
	@Autowired
	private NivelEducativoServiceAPI nivelEducativoServiceAPI;
	@Autowired
	private InstitucionesServiceAPI institucionesServiceAPI;
	
	@RequestMapping("/asignacionInsticiones")
	public String asigInstitucion(Model m) {
		m.addAttribute("list", asigInstAPI.getAll());
		return "asignacionInsticiones";
	}
	
	@GetMapping("/saveAsignaInstitucion/{id}")
	public String showSave(@PathVariable("id") Integer id, Model m) {
		if (id != null && id != 0) {
			m.addAttribute("asigInstituto", asigInstAPI.get(id));
			m.addAttribute("reg", regAPI.getAll());
			m.addAttribute("insti", institucionesServiceAPI.getAll());
			m.addAttribute("nivel", nivelEducativoServiceAPI.getAll());
		} else {
			m.addAttribute("asigInstituto", new Asig_Institucion());
			m.addAttribute("reg", regAPI.getAll());
			m.addAttribute("insti", institucionesServiceAPI.getAll());
			m.addAttribute("nivel", nivelEducativoServiceAPI.getAll());
		}
		return "saveAsignaInstitucion";
	}
	
	@PostMapping("/saveAsignaInstitucion")
	public String save(Asig_Institucion inst) {
		asigInstAPI.save(inst);
		return "redirect:/asignacionInsticiones";
	}
	
	@GetMapping("/deleteAsigInstituto/{id}")
	public String delete(@PathVariable Integer id) {
		asigInstAPI.delete(id);
		return "redirect:/asignacionInsticiones";
	}

}
