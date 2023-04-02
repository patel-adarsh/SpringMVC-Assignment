package SpringMVCAssignmentsQ1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "Hello World");
		return model;

}

}
