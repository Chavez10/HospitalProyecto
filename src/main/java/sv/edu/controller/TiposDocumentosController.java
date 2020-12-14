package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.TiposDocumentos;
import sv.edu.services.api.TiposDocumentosServiceAPI;

@Controller
public class TiposDocumentosController {
	@Autowired
	private TiposDocumentosServiceAPI docuAPI;
	
	@RequestMapping("/documentos")
	public String documentos(Model model) {
		model.addAttribute("list", docuAPI.getAll());
		return "documentos";
	}
	
	@GetMapping("/saveDocumentos/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("documento", docuAPI.get(id));
		}else {
			model.addAttribute("documento", new TiposDocumentos());
		}
		return "saveDocumentos";
	}
	
	@PostMapping("/saveDocumentos")
	public String save(TiposDocumentos doc, Model model) {
		docuAPI.save(doc);
		return "redirect:/documentos";
	}
	
	@GetMapping("/deleteDocumento/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		docuAPI.delete(id);
		return "redirect:/documentos";
	}

}
