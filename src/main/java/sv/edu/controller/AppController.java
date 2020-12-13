package sv.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({ "/", "/login" })
	public String index() {
		return "index";
	}

	@GetMapping({ "/menu" })
	public String menu() {
		return "menu";
	}
	@GetMapping({ "/menu1" })
	public String menu1() {
		return "menu1";
	}

	@GetMapping({ "/admin" })
	public String admin() {
		return "admin";
	}

	@GetMapping({ "/user" })
	public String user() {
		return "user";
	}
}
