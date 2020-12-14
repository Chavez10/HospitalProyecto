package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Nivel_Educativo;
import sv.edu.services.api.NivelEducativoServiceAPI;


@Controller
public class NivelEducativoController {

	@Autowired
	private NivelEducativoServiceAPI nivelEducativoServiceAPI;

	@RequestMapping("/listaNivelEducativo")
	public String listaNivelEducativo(Model model) {
		model.addAttribute("list", nivelEducativoServiceAPI.getAll());
		return "listaNivelEducativo";

	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("nivelEducativo", nivelEducativoServiceAPI.get(id));
		}
		return "saveNivelEducativo";

	}

	@PostMapping("/save")
	public String save(Nivel_Educativo nivelEducativo, Model model) {
		nivelEducativoServiceAPI.save(nivelEducativo);

		return "redirect:/listaRoles";

	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		nivelEducativoServiceAPI.delete(id);

		return "redirect:/listaNivelEducativo";
	}
}


