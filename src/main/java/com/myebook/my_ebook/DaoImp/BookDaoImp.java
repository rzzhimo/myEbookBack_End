package com.myebook.my_ebook.DaoImp;

import com.myebook.my_ebook.Dao.BookDao;
import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class BookDaoImp implements BookDao {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Iterable<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Books findBooks(int book_id) {
        return bookRepository.findBooksByBook_id(book_id);
    }

    @Override
    public String add(int book_id, String title, String author, double price, long stock) {
        Books b1=bookRepository.findBooksByBook_id(book_id);
        b1.setTitle(title);
        b1.setAuthor(author);
        b1.setPrice(price);
        b1.setStock(stock);
        bookRepository.save(b1);
        System.out.println(b1.getBook_id());
        return "修改成功";
    }

    @Override
    public String deleteBooks(int book_id) {
        Books b1 = bookRepository.findBooksByBook_id(book_id);
        bookRepository.delete(b1);
        return "删除成功";
    }

    @Override
    public String addNewBook(int book_id, String title, String author, String language, double price, long stock,byte[] cover) {
        Books book = new Books(book_id,title,author,language,price,stock,cover);
        bookRepository.save(book);
        return "Saved";
    }
}
