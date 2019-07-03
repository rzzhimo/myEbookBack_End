package com.myebook.my_ebook.Service;

import com.myebook.my_ebook.Entity.Books;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookService {
    Iterable<Books> getAllBooks();
    Books findBooks(int book_id);
    String add(int book_id,  String title
            ,String author,  double price, long stock);
    String deleteBooks(int book_id);
    String addNewBook (int book_id,String title
            , String author,String language,double price,long stock,byte[] cover);
}
