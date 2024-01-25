package org.belyazid.inventoryservice.inventoryservice.repositories;

import org.belyazid.inventoryservice.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
