package com.example.Spring.Samples.with.Scope.service;

import com.example.Spring.Samples.with.Scope.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CartService {

    void addItems(List<Integer> ids);

    List <Integer> getAll();

}
