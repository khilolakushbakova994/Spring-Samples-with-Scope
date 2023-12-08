package com.example.Spring.Samples.with.Scope;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;


public class CartServiceImpl implements CartService {
    private static final List<Cart> cartList = new ArrayList<>();

    @Override
    public List<Cart> addItem(int ID) {
        List<Cart> adduser = cartList;
        cartList.add(new Cart());

        return adduser;
    }

    @Override
    public Cart getItem( int ID) {
        for(Cart cart: cartList){
            if (cart.getID().equals(ID))
                return cart;
        }
        return null;
    }

    @Override
    public List<Cart> showAllItems() {
        return cartList;
    }

    @Override
    public void removeItem(int ID) {
        cartList.removeIf(product -> {
            return Integer.valueOf(product.getID().toString()).equals(ID);
        });
    }

}


