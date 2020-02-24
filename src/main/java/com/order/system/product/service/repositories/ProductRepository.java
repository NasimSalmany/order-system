package com.order.system.product.service.repositories;

import com.order.system.product.service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nasim Salmany
 */

public interface ProductRepository extends JpaRepository<Product, Long> {



}
