package com.myebook.my_ebook.Controller;

import com.myebook.my_ebook.Entity.Comment;
import com.myebook.my_ebook.Entity.Orders;
import com.myebook.my_ebook.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/ebook")
@RestController

public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping(path="/saveComment") // Map ONLY GET Requests
    public @ResponseBody
    String addItem (@RequestParam int user_id, @RequestParam int book_id
            , @RequestParam String comment) {

        Comment comment1=new Comment();
        //Comment comment1=new Comment(user_id,book_id,comment);
        comment1.setBid(book_id);
        comment1.setUid(user_id);
        comment1.setComment(comment);

        commentRepository.save(comment1);
        return "评价成功";
    }
    @GetMapping(path="/findAllBybid")
    public @ResponseBody
    List<Comment> getAllOrders(@RequestParam int book_id) {
        // This returns a JSON or XML with the users

        return commentRepository.findBybid(book_id);
    }
}
