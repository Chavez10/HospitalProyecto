package sv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.edu.model.Roles;
import sv.edu.services.api.RolesServiceAPI;

@Controller
public class RolesController {

	@Autowired
	private RolesServiceAPI rolesServiceAPI;

	@RequestMapping("/listaRoles")
	public String listaRoles(Model model) {
		model.addAttribute("list", rolesServiceAPI.getAll());
		return "listaRoles";

	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("rol", rolesServiceAPI.get(id));
		}
		return "saveRoles";

	}

	@PostMapping("/save")
	public String save(Roles rol, Model model) {
		rolesServiceAPI.save(rol);

		return "redirect:/listaRoles";

	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		rolesServiceAPI.delete(id);

		return "redirect:/listaRoles";
	}
}
