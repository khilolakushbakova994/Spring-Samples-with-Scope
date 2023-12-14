package com.example.Spring.Samples.with.Scope.controller;

import com.example.Spring.Samples.with.Scope.service.CartService;
import com.example.Spring.Samples.with.Scope.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart")

    @GetMapping("/store/order/add")
    public List<Cart> add(@RequestParam ("id") int id) {
        cartService.addItem(id);
        return null;
    }

    @GetMapping("/store/order/get")
    public List<Cart> get(@RequestParam ("id") int id) {
         cartService.getItem(id);
         return null;
    }


    @GetMapping("/store/order/showAllItems")
    public String showAllItems() {
        return ((List<Cart>) cartService.showAllItems()).toString();
    }


    @GetMapping("/store/order/remove")
    public List<Cart> remove (@RequestParam ("id") int id) {
        cartService.removeItem(id);
        return null;
    }
}
