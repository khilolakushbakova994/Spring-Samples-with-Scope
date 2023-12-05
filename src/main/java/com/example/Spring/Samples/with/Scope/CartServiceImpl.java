package com.example.Spring.Samples.with.Scope;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;


public class CartServiceImpl implements CartService {
    private static final List<Cart> cartList = new ArrayList<>();

    @Override
    public List<Cart> addItem(int ID, String item) {
        List<Cart> adduser = cartList;
        cartList.add(new Cart());

        return adduser;
    }

    @Override
    public Cart getItem(String item, int ID) {
        for(Cart cart: cartList){
            if (cart.getID()==ID)
                return cart;
        }
        return null;
    }

    @Override
    public List<Cart> showAllItems() {
        return cartList;
    }

    @Override
    public void removeItem(String item, int ID) {
        cartList.removeIf(product -> product.getID() == ID);
    }

}


