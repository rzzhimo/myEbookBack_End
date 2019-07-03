package com.myebook.my_ebook.Service;

import com.myebook.my_ebook.Entity.Carts;
import com.myebook.my_ebook.Entity.Items;
import com.myebook.my_ebook.Entity.Orders;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

public interface ItemService {

    String addItem (int user_id,int book_id
            , double price,int num);
    int addOrder (int user_id);
    String addItem2 (int user_id,int book_id
            ,double price,int num,int oid);
    Iterable<Carts> allCart(int user_id);
    String addCart2(int book_id,int num, int user_id,String title);
    String addCart1(int book_id,int num,int user_id,String title);
    void deleteCart(int book_id,int user_id);
    List<Items> orderInfo (int oid);
    Iterable<Orders> getAllOrders( int user_id);
    Iterable<Orders> getAllUserOrders();
    List<Orders> searchOrders(Date start, Date end);



}

