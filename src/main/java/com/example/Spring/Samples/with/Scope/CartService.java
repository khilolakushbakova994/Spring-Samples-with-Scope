package com.example.Spring.Samples.with.Scope;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    public List<Cart> addItem(int ID);

    public Cart getItem(int ID);

    List<Cart> showAllItems();

    void removeItem(int ID);
}
