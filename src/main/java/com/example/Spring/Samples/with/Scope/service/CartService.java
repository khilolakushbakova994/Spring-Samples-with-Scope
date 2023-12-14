package com.example.Spring.Samples.with.Scope.service;

import com.example.Spring.Samples.with.Scope.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    public void addItem(int id);

    public Cart getItem(int id);

    List<Cart> showAllItems();

    public void removeItem(int id);
}
