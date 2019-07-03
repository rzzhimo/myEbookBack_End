package com.myebook.my_ebook.DaoImp;

import com.myebook.my_ebook.Dao.ItemDao;
import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Entity.Carts;
import com.myebook.my_ebook.Entity.Items;
import com.myebook.my_ebook.Entity.Orders;
import com.myebook.my_ebook.Repository.BookRepository;
import com.myebook.my_ebook.Repository.CartRepository;
import com.myebook.my_ebook.Repository.ItemReposity;
import com.myebook.my_ebook.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository

public class ItemDaoImp implements ItemDao {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ItemReposity itemReposity;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public String addItem(int user_id, int book_id, double price, int num) {
        int oid=addOrder(user_id);
        addItem2(user_id,book_id,price,num,oid);
        return "Saved";
    }
    @Override
    public int addOrder(int user_id) {
        Orders o1=new Orders();
        o1.setOrderTime(new Timestamp(System.currentTimeMillis()));

        o1.setUser_id(user_id);
        orderRepository.save(o1);
        return o1.getId();
    }
    @Override
    public String addItem2(int user_id, int book_id, double price, int num, int oid) {
        Carts c1= cartRepository.findByBook_idAndAndUser_id(book_id,user_id);
        Items i1=new Items();
        i1.setItemsId(c1.getBook_id());
        i1.setUid(c1.getUser_id());
        i1.setPrice(price);
        i1.setItemCount(num);
        i1.setOid(oid);
        itemReposity.save(i1);
        Books b1=bookRepository.findBooksByBook_id(book_id);
        long newnum=b1.getStock()-num;
        b1.setStock(newnum);
        bookRepository.save(b1);
        return "Saved";
    }
    @Override
    public Iterable<Carts> allCart(int user_id) {
        return cartRepository.findAllByUser_id(user_id);
    }
    @Override
    public String addCart2(int book_id, int num, int user_id, String title) {
        Carts c1=new Carts();
        c1.setBook_id(book_id);
        c1.setNum(num);
        c1.setUser_id(user_id);
        c1.setTitle(title);

        cartRepository.save(c1);
        return "加入成功";
    }
    @Override
    public String addCart1(int book_id, int num, int user_id, String title) {
        Carts c2 = new Carts();

        c2 = cartRepository.findByBook_idAndAndUser_id(book_id,user_id);

        if(cartRepository.findByBook_idAndAndUser_id(book_id,user_id).getUser_id()!=0){

            c2=cartRepository.findByBook_idAndAndUser_id(book_id,user_id);
            System.out.println(c2.getTitle());
            c2.setNum(num+c2.getNum());
            cartRepository.save(c2);
            return "加入ok";
        }
        return "加入ok";
    }
    @Override
    public void deleteCart(int book_id, int user_id) {
        Carts c1=cartRepository.findByBook_idAndAndUser_id(book_id,user_id);
        cartRepository.delete(c1);
    }
    @Override
    public List<Items> orderInfo(int oid) {
        return itemReposity.findAllByOid(oid);
    }

    @Override
    public Iterable<Orders> getAllOrders(int user_id) {
        return orderRepository.findAllByUser_id(user_id);
    }

    @Override
    public Iterable<Orders> getAllUserOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Orders> searchOrders(Date start, Date end) {
        //Date与Timestamp是父子关系，父类不能直接转为子类，可借助中间的String

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = sdf.format(start);//时间存储为字符串
        String str2 = sdf.format(end);//时间存储为字符串
        Timestamp ts1=Timestamp.valueOf(str1);//字符串转为时间戳
        Timestamp ts2=Timestamp.valueOf(str2);
        return orderRepository.findAllByStartAndEnd(ts1,ts2);
    }
}
