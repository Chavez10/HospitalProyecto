package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Asig_Documentos;
import sv.edu.model.Especialidades;
import sv.edu.services.api.Asig_DocumentosServiceAPI;
import sv.edu.services.api.RegistrosServiceAPI;
import sv.edu.services.api.TiposDocumentosServiceAPI;


@Controller
public class Asig_DocumentosController {


	@Autowired
	private Asig_DocumentosServiceAPI asig_DocumentosAPI;
	@Autowired
	private RegistrosServiceAPI regAPI;
	@Autowired
	private TiposDocumentosServiceAPI docuAPI;
	
	@RequestMapping("/Asig_Documentos")
	public String asig_Documentos(Model model) {
		model.addAttribute("list", asig_DocumentosAPI.getAll());
		return "Asig_Documentos";
	}
	

	@GetMapping("/saveAsig_Documentos/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("asig_Documentos", asig_DocumentosAPI.get(id));
			model.addAttribute("reg", regAPI.getAll());
			model.addAttribute("docu", docuAPI.getAll());
		}else {
			model.addAttribute("asig_Documentos", new Asig_Documentos());
			model.addAttribute("reg", regAPI.getAll());
			model.addAttribute("docu", docuAPI.getAll());
		}
		
		return "saveAsig_Documentos";
	}
	
	@PostMapping("/saveAsig_Documentos")
	public String save(Asig_Documentos asig_Documentos , Model model) {
		asig_DocumentosAPI.save(asig_Documentos);
		return "redirect:/Asig_Documentos";
	}
	
	@GetMapping("/deleteAsig_Documentos/{id}")
	public String delete(@PathVariable Integer id, Model m) {
		asig_DocumentosAPI.delete(id);
		return "redirect:/Asig_Documentos";
	}
}

