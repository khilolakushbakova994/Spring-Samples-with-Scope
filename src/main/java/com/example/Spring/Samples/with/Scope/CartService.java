package com.example.Spring.Samples.with.Scope;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    public List<Cart> addItem(int ID, String item);

    public Cart getItem(String item, int ID);

    List<Cart> showAllItems();

    void removeItem(String item, int ID);
}
