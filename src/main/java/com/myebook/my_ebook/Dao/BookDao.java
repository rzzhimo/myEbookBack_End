package com.myebook.my_ebook.Dao;

import com.myebook.my_ebook.Entity.Books;

public interface BookDao {
    Iterable<Books> getAllBooks();
    Books findBooks(int book_id);
    String add(int book_id,  String title
            ,String author,  double price, long stock);
    String deleteBooks(int book_id);
    String addNewBook (int book_id,String title
            , String author,String language,double price,long stock,byte[] cover);
}
