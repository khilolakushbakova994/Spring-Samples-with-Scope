package com.example.Spring.Samples.with.Scope.service;
import com.example.Spring.Samples.with.Scope.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart ;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public void addItems(List<Integer> ids) {
        cart.addAll(ids);
    }

    @Override
    public List<Integer> getAll() {
        return cart.getAll();
    }
}


