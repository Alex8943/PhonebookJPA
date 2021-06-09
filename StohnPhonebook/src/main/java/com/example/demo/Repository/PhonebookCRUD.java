package com.example.demo.Repository;

import java.util.List;

public interface PhonebookCRUD<T> {
    void create(T t); 
    List<T> readAll(); 
    T getProductById(long id); 
    void update(T t); 
    void delete(long id);
}
