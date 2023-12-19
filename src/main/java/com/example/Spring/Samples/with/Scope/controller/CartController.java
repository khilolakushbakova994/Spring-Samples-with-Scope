package com.example.Spring.Samples.with.Scope.controller;

import com.example.Spring.Samples.with.Scope.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/store/order/add")
    public void add(@RequestParam("ids") List<Integer> ids) {
        cartService.addItems(ids);
    }

    @GetMapping("/store/order/getAll")
    public List<Integer> getAll() {
        return cartService.getAll();
    }


}
