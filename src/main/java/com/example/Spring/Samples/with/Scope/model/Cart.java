package com.example.Spring.Samples.with.Scope.model;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SessionScope
@Component
public class Cart {

    private List<Integer> ids = new ArrayList<>();


    public List<Integer> getAll() {
        return ids;
    }

    public void addAll (List<Integer>ids){
        this.ids.addAll(ids) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(ids, cart.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "ids=" + ids +
                '}';
    }
}

