package com.example.Spring.Samples.with.Scope;
import lombok.Data;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Objects;
@Data
@SessionScope

public class Cart {

    private List<Cart> Id;

    public Cart() {
        this.Id = Id;
    }

    public List<Cart> getID() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(Id, cart.Id);
    }



    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "Id=" + Id +
                '}';
    }
}

