package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {
	
	@GetMapping("/sum2")
	public ModelAndView sum2(@RequestParam int num1, @RequestParam(name = "number", required = false, defaultValue = "10") int num2) {
		
		int sumFromParameters = num1 + num2;
		
		ModelAndView modelAndView = new ModelAndView("sum.jsp");
		modelAndView.addObject("c", sumFromParameters);
		return modelAndView;
	}
	
	@GetMapping("/sum")
	public String sumPage(Model model) {
		model.addAttribute("s", 40);
		return "sum.jsp";
	}

	@RequestMapping(value = "/sumMapping")
	public String sumPage1() {
		return "sum.jsp";
	}

}
