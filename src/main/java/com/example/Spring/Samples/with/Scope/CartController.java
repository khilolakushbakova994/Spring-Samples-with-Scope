package com.example.Spring.Samples.with.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart")

    @GetMapping("/store/order/add")
    public List<Cart> add(int ID) {
        cartService.addItem(ID);
        return null;
    }

    @GetMapping("/store/order/get")
    public List<Cart> get( int ID) {
         cartService.getItem(ID);
         return null;
    }


    @GetMapping("/store/order/showAllItems")
    public String showAllItems() {
        return ((List<Cart>) cartService.showAllItems()).toString();
    }


    @GetMapping("/store/order/remove")
    public List<Cart> remove ( int ID) {
        cartService.removeItem(ID);
        return null;
    }
}
