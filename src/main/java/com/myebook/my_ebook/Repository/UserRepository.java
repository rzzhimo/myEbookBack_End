package com.myebook.my_ebook.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import com.myebook.my_ebook.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface UserRepository extends CrudRepository<Users, Integer> {
//
//}
//        JpaRepository，它继承自PagingAndSortingRepository，而PagingAndSortingRepository又继承自CrudRepository。
//        每个都有自己的功能：
//
//        CrudRepository提供CRUD的功能。
//        PagingAndSortingRepository提供分页和排序功能
//        JpaRepository提供JPA相关的方法，如刷新持久化数据、批量删除。

public interface UserRepository extends JpaRepository<Users, Long> {


    Users getUsersByIdAndPassword( int id, String password);
    Users getUsersById(int id);
}
