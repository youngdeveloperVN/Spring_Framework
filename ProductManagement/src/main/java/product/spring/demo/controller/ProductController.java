package product.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import product.spring.demo.vo.ProductVO;

@Controller
public class ProductController {

	@RequestMapping(value = "/products", method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ProductVO getAllProducts() {
		List<ProductVO> products = new ArrayList<ProductVO>();
		ProductVO productVO = new ProductVO();
		productVO.setId(1);
		productVO.setName("Product 1");
		products.add(productVO);
		
		return productVO;
	}
}


