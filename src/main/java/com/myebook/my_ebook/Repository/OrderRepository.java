package com.myebook.my_ebook.Repository;

import com.myebook.my_ebook.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    @Query(value = "select * from Orders where user_id=?1", nativeQuery = true)
    Iterable<Orders> findAllByUser_id(int user_id);
    @Query(value = "select * from Orders where order_time>?1&&order_Time<?2", nativeQuery = true)
    List<Orders> findAllByStartAndEnd(Timestamp start, Timestamp end);

}
