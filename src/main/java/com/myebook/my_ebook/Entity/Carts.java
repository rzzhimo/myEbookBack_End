package com.myebook.my_ebook.Entity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Entity
@SequenceGenerator(name="cart_id_seq", initialValue=1, allocationSize=1)
public class Carts {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="cart_id_seq")
    private int cart_id;
    private int num;
    private int book_id;
    private int user_id;
    private String title;

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getNum() {
        return num;
    };

    public int getBook_id() {
        return book_id;
    };

    public int getUser_id() {
        return user_id;
    };

    public void setNum(int num) {
        this.num = num;
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    };

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
