package com.example.Spring.Samples.with.Scope.model;
import lombok.Data;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Objects;
@Data
@SessionScope

public class Cart {

    private List<Cart> id;

    public Cart() {
        this.id = id;
    }

    public List<Cart> getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "Id=" + id +
                '}';
    }
}

