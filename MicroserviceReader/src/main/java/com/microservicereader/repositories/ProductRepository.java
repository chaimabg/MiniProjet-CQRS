package com.microservicereader.repositories;

import com.microservicereader.entities.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> getProductsByName(String name);
    Product getProductById(String id);
    void deleteById(String id);
}
