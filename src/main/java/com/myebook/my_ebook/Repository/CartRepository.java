package com.myebook.my_ebook.Repository;

import com.myebook.my_ebook.Entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartRepository extends JpaRepository<Carts, Long> {
    @Query(value = "select * from Carts where book_id=?1 and user_id=?2", nativeQuery = true)
    Carts findByBook_idAndAndUser_id(int book_id,int user_id);
    @Query(value = "select * from Carts where user_id=?1", nativeQuery = true)
    Iterable<Carts> findAllByUser_id(int user_id);

}
