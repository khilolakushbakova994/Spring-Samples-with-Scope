package com.example.Spring.Samples.with.Scope;

import lombok.Data;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Objects;
@Data
@SessionScope

public class Cart {

    private int ID;
    private String item;

    public Cart() {
        this.ID = ID;
        this.item = item;
    }

    public int getID() {
        return ID;
    }



    public void setID(int ID) {
        this.ID = ID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return ID == cart.ID && Objects.equals(item, cart.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, item);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "ID=" + ID +
                ", item='" + item + '\'' +
                '}';
    }
}
