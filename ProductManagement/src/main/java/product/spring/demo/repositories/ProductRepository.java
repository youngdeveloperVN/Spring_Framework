package product.spring.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import product.spring.demo.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	final String SELECT_ALL = "SELECT p FROM Product p";
	final String SELECT_BY_ID = "SELECT p FROM Product p WHERE p.id =:productId";

	@Query(SELECT_ALL)
	List<Product> findAllProduct();
	
	@Query(SELECT_BY_ID)
	Product findCategoryById(@Param("productId") Integer id);
}