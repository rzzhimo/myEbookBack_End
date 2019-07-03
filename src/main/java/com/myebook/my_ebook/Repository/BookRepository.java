package com.myebook.my_ebook.Repository;

import com.myebook.my_ebook.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Books, Long> {
    @Query(value = "select * from books where book_id=?1", nativeQuery = true)
    Books findBooksByBook_id(int book_id);
    @Query(value = "select * from books where book_id=(select book_id from carts where user_id=?1)", nativeQuery = true)
    Books findBooksByUser(int user_id);

}
