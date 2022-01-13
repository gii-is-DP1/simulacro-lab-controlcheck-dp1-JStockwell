package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();
    @Query("SELECT product_type FROM ProductType product_type")
    List<ProductType> findAllProductTypes() throws DataAccessException;
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);
    @Query("SELECT product_type FROM ProductType product_type WHERE product_type.name LIKE :name%")
    ProductType findProductTypeByName(@Param("name") String name) throws DataAccessException;
    @Query("SELECT product FROM Products product WHERE product.price <= :thresholdPrice")
    List<Product> findByPriceLessThan(@Param("thresholdPrice") Double thresholdPrice) throws DataAccessException;
}
