package banking;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerr {
	@RequestMapping("/demo")
	public String demo() {
		return "registration";
	}

	@RequestMapping("/demo2")
	public String demo2(@ModelAttribute("U") User U, BindingResult r) {
		if (r.hasErrors())
			return "registration";
		U.Insert();
		return "registration2";
	}

	@RequestMapping("/demo3")
	public String demo3() {
		return "login";
	}

	@RequestMapping("/demo4")
	public String demo4(@Valid @ModelAttribute("U") LoginUser U, BindingResult r) {
		boolean s = U.Select();
		if (r.hasErrors() || s)
			return "error";
		return "success";
	}
}
