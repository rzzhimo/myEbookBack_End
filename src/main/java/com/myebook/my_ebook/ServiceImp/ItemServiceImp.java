package com.myebook.my_ebook.ServiceImp;

import com.myebook.my_ebook.Dao.ItemDao;
import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Entity.Carts;
import com.myebook.my_ebook.Entity.Items;
import com.myebook.my_ebook.Entity.Orders;
import com.myebook.my_ebook.Repository.BookRepository;
import com.myebook.my_ebook.Repository.CartRepository;
import com.myebook.my_ebook.Repository.ItemReposity;
import com.myebook.my_ebook.Repository.OrderRepository;
import com.myebook.my_ebook.Service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public String addItem(int user_id, int book_id, double price, int num) {

        return itemDao.addItem(user_id,book_id,price,num);
    }
    @Override
    public int addOrder(int user_id) {

        return itemDao.addOrder(user_id);
    }
    @Override
    public String addItem2(int user_id, int book_id, double price, int num, int oid) {

        return itemDao.addItem2(user_id,book_id,price,num,oid);
    }
    @Override
    public Iterable<Carts> allCart(int user_id) {
        return itemDao.allCart(user_id);
    }
    @Override
    public String addCart2(int book_id, int num, int user_id, String title) {

        return itemDao.addCart2(book_id,num,user_id,title);
    }
    @Override
    public String addCart1(int book_id, int num, int user_id, String title) {

        return itemDao.addCart1(book_id,num,user_id,title);
    }
    @Override
    public void deleteCart(int book_id, int user_id) {
        itemDao.deleteCart(book_id,user_id);
    }
    @Override
    public List<Items> orderInfo(int oid) {
        return itemDao.orderInfo(oid);
    }

    @Override
    public Iterable<Orders> getAllOrders(int user_id) {
        return itemDao.getAllOrders(user_id);
    }

    @Override
    public Iterable<Orders> getAllUserOrders() {
        return itemDao.getAllUserOrders();
    }

    @Override
    public List<Orders> searchOrders(Date start, Date end) {


        return itemDao.searchOrders(start,end);
    }



}
