package employe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@RequestMapping(value = "/in", method = RequestMethod.GET)
	public String demo() {
		return "employee";
	}

	@RequestMapping(value = "/in2", method = RequestMethod.POST)
	public String demo4(@ModelAttribute("M") managementmodel M) {
		M.Insert();
		return "employee2";
	}

	@RequestMapping(value = "/up", method = RequestMethod.GET)
	public String demo2() {
		return "update";
	}

	@RequestMapping(value = "/up2", method = RequestMethod.POST)
	public String demo5(@ModelAttribute("M") managementmodel M) {
		M.Update();
		return "update2";
	}

	@RequestMapping(value = "/de", method = RequestMethod.GET)
	public String demo3() {
		return "delete";
	}

	@RequestMapping(value = "/de2", method = RequestMethod.POST)
	public String demo6(@RequestParam("id") int n) {
		managementmodel m = new managementmodel();
		m.Delete(n);
		return "delete2";
	}
	
	
}
