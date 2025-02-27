package ro.emanuel;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello.htm")
	public ModelAndView getIndex() {
		ModelMap modelMap = new ModelMap();
		modelMap.put("name", "Brian");
		modelMap.put("time", (new Date().toString()));
		
		return new ModelAndView("hello.jsp", modelMap);
	}

}
