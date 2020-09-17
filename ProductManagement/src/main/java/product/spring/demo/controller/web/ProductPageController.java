package product.spring.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import product.spring.demo.services.ProductService;

@Controller
public class ProductPageController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView productPage() {
		ModelAndView m = new ModelAndView("productListPage");

		m.addObject("productList", productService.getAllProducts());
		return m;
	}

}
