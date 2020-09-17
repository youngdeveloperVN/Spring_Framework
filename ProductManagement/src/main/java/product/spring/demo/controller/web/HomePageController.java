package product.spring.demo.controller.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value = {
		 "",
	        "/",
	        "/index",
	        "/home"
	    })
	public String index() {
		return "homePage";
	}

}
