package com.myebook.my_ebook.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int Id;
    private int ItemsId;
    private int ItemCount;
    private int uid;
    private double price;
    private int oid;
    public Integer getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getItemsId() {
        return ItemsId;
    }

    public void setItemsId(int itemsId) {
        ItemsId = itemsId;
    }



    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
}
