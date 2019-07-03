package com.myebook.my_ebook.ServiceImp;


import com.myebook.my_ebook.Dao.BookDao;
import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Repository.BookRepository;
import com.myebook.my_ebook.Repository.UserRepository;
import com.myebook.my_ebook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Iterable<Books> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Books findBooks(int book_id) {
        return bookDao.findBooks(book_id);
    }

    @Override
    public String add(int book_id, String title, String author, double price, long stock) {

        return bookDao.add(book_id,title,author,price,stock);
    }

    @Override
    public String deleteBooks(int book_id) {

        return bookDao.deleteBooks(book_id);
    }

    @Override
    public String addNewBook(int book_id, String title, String author, String language, double price, long stock,byte[] cover) {

        return bookDao.addNewBook(book_id,title,author,language,price,stock, cover);
    }
}
