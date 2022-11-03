package pro.ivanov.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(ModelMap model) {		
		 model.addAttribute("msg", "Hello, Word!");
		
		return "index";
	}
}