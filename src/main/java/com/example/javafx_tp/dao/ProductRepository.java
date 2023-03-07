package com.example.javafx_tp.dao;

import com.example.javafx_tp.entities.Category;
import com.example.javafx_tp.entities.Product;

import java.util.List;

public interface ProductRepository extends Dao<Product,Long> {
    List<Product> findByQuery(String query);
}
