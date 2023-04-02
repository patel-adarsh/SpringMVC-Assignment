package SpringMVCAssignmentsQ6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
	@RequestMapping(value = "/r", method = RequestMethod.GET)
	public String demo() {
		return "registration";
	}

	@RequestMapping(value = "/r2", method = RequestMethod.POST)
	public String demo2(@Valid @ModelAttribute("R") Customer R, BindingResult r, Model m) {
		if (r.hasErrors())
			return "registration";
		m.addAttribute("msg", "Registered Successfully");
		return "registration2";
	}
}