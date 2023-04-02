package SpringMVCAssignmentsQ9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {
	@RequestMapping("/emp")
    public String demo()
    {
    	return "showAllEmployees";
    }
	@RequestMapping("/emp1")
    public String demo1()
    {
    	return "showAllEmployees2";
    }
	@RequestMapping("/emp2")
    public String demo2()
    {
    	return "showAllEmployees3";
    }
}
