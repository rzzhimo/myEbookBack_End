package com.myebook.my_ebook.Repository;

import com.myebook.my_ebook.Entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemReposity extends JpaRepository<Items, Long> {
    @Query(value = "select * from Items where oid=?1", nativeQuery = true)
    List<Items> findAllByOid(int oid);
}
