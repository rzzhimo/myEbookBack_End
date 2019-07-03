package com.myebook.my_ebook.Controller;

import com.myebook.my_ebook.Entity.Books;
import com.myebook.my_ebook.Entity.Items;
import com.myebook.my_ebook.Entity.Orders;
import com.myebook.my_ebook.Repository.BookRepository;
import com.myebook.my_ebook.Service.BookService;
import com.myebook.my_ebook.Service.ItemService;
import com.myebook.my_ebook.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RequestMapping(path="/ebook")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ItemService itemService;

    @GetMapping(path="/allBooks")
    public @ResponseBody Iterable<Books> getAllBooks() {
        // This returns a JSON or XML with the books
        return bookService.getAllBooks();
    }
    @GetMapping(path="/findBooks")//根据书的id来找书
    public @ResponseBody Books findBooks(@RequestParam int book_id) {
        // This returns a JSON or XML with the books
        return bookService.findBooks(book_id);
    }
    @RequestMapping(path = "/editBook")
    public @ResponseBody
    String add(@RequestParam int book_id, @RequestParam String title
            , @RequestParam String author, @RequestParam double price, long stock){

        return bookService.add(book_id,title,author,price,stock);
    }
    @GetMapping(path="/deleteBook")
    public @ResponseBody String deleteBooks(@RequestParam int book_id) {
        // This returns a JSON or XML with the books

        return bookService.deleteBooks(book_id);

    }
    @GetMapping(path="/searchBookSale")
    public @ResponseBody int serachBookSale(@RequestParam Date start, Date end, int book_id) {
        // This returns a JSON or XML with the books
        List<Orders> o1=itemService.searchOrders(start,end);


        int total=0;
        for (int i=0;i<o1.size();i++){
        List<Items> i1=itemService.orderInfo(o1.get(i).getId());
        for (int j=0;j<i1.size();j++) {
            if (i1.get(j).getItemsId()==book_id){

                total+=i1.get(j).getItemCount();
            }
        }
        }


        return total;


    }
    @PostMapping(path="/addBook")
    @ResponseBody
    public
    String addNewBook (@RequestParam int book_id, @RequestParam String title
            , @RequestParam String author, @RequestParam String language, @RequestParam double price, @RequestParam long stock, @RequestParam MultipartFile cover)throws IOException {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        //Books b1=bookRepository.findBooksByBook_id(book_id);
        return bookService.addNewBook(book_id,title
                ,author,language,price,stock,cover.getBytes());
    }
}
