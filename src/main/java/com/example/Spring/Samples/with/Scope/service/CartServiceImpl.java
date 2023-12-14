package com.example.Spring.Samples.with.Scope.service;
import com.example.Spring.Samples.with.Scope.model.Cart;

import java.util.ArrayList;
import java.util.List;


public class CartServiceImpl implements CartService {
    private static final List<Cart> cartList = new ArrayList<>();


    @Override
    public void addItem(int id) {
        cartList.add(new Cart());
    }

    @Override
    public Cart getItem( int id) {
        for(Cart cart: cartList){
            if (cart.getID().equals(id))
                return cart;
        }
        return null;
    }

    @Override
    public List<Cart> showAllItems() {
        return cartList;
    }

    @Override
    public void removeItem(int id) {
        cartList.removeIf(product -> {
            return Integer.valueOf(product.getID().toString()).equals(id);
        });
    }

}


