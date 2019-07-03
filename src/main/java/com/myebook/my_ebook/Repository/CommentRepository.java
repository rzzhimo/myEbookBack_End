package com.myebook.my_ebook.Repository;

import com.myebook.my_ebook.Entity.Carts;
import com.myebook.my_ebook.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, Long> {
    public List<Comment> findBybid(int bid);
}
