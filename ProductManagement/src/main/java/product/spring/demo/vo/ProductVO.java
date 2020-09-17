package product.spring.demo.vo;

import java.io.Serializable;

public class ProductVO implements Serializable {
	private static final long serialVersionUID = 2029331617170608474L;
	private String name;
	private int id;
	private String price;
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
