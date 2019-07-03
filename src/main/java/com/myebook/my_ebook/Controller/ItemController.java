package com.myebook.my_ebook.Controller;

import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Entity.Carts;
import com.myebook.my_ebook.Entity.Items;
import com.myebook.my_ebook.Entity.Orders;
import com.myebook.my_ebook.Repository.*;
import com.myebook.my_ebook.Service.BookService;
import com.myebook.my_ebook.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

@RequestMapping(path="/ebook")
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;


    //用于买一种书时
    @GetMapping(path="/addItem") // Map ONLY GET Requests
    public @ResponseBody
    String addItem (@RequestParam int user_id, @RequestParam int book_id
            , @RequestParam double price, @RequestParam int num) {



        return itemService.addItem(user_id,book_id,price,num);
    }
    @GetMapping(path="/addOrder") // Map ONLY GET Requests
    public @ResponseBody
    int addOrder (@RequestParam int user_id) {

        return itemService.addOrder(user_id);
    }
    //用于买多钟书时
    @GetMapping(path="/addItem2") // Map ONLY GET Requests
    public @ResponseBody
    String addItem2 (@RequestParam int user_id,@RequestParam int book_id
            , @RequestParam double price,@RequestParam int num,@RequestParam int oid) {

        return itemService.addItem2(user_id,book_id,price,num,oid);
    }
    @GetMapping(path="/allCarts")//购物车
    public @ResponseBody Iterable<Carts> allCart(@RequestParam int user_id) {
        return itemService.allCart(user_id);

    }
    @GetMapping(path="/addCart2")//往购物车中增加书
    public @ResponseBody String addCart2(@RequestParam int book_id,@RequestParam int num,@RequestParam int user_id,@RequestParam String title) {


        return itemService.addCart2(book_id,num,user_id,title);

    }
    @GetMapping(path="/addCart1")//往购物车中增加书
    public @ResponseBody String addCart1(@RequestParam int book_id,@RequestParam int num,@RequestParam int user_id,@RequestParam String title) {


        return itemService.addCart1(book_id, num, user_id,title);

    }
    @GetMapping(path="/deleteCart")
    public @ResponseBody void deleteCart(@RequestParam int book_id,@RequestParam int user_id) {
        // This returns a JSON or XML with the books
       itemService.deleteCart(book_id,user_id);

    }
    @GetMapping(path="/orderInfo") // Map ONLY GET Requests
    public @ResponseBody
    Iterable<Items> orderInfo (@RequestParam int oid) {



        return itemService.orderInfo(oid);
    }
    @GetMapping(path="/allOrders")
    public @ResponseBody Iterable<Orders> getAllOrders(@RequestParam int user_id) {
        // This returns a JSON or XML with the users

        return itemService.getAllOrders(user_id);
    }
    @GetMapping(path="/allUserOrders")
    public @ResponseBody Iterable<Orders> getAllUserOrders() {
        // This returns a JSON or XML with the users
        return itemService.getAllUserOrders();
    }
    @GetMapping(path="/searchOrders")
    public @ResponseBody
    List<Orders> searchOrders(@RequestParam Date start, @RequestParam Date end) {

        return itemService.searchOrders(start,end);
    }
}
