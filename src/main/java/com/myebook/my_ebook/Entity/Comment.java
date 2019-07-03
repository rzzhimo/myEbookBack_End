package com.myebook.my_ebook.Entity;

import javax.persistence.*;

@Entity

public class Comment {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="s_test_pg_wushan")
//    @SequenceGenerator(sequenceName="test_sequence", name="s_test_pg_wushan",allocationSize = 1)
//    public int cid;
    @Id
    public int bid;//书id
    public int uid;//用户id

    public String comment;

    public Comment() {super();}

    public Comment(int uid, int bid,String comment) {
        super();
        this.uid = uid;
        this.bid = bid;
        this.comment=comment;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

//    public void setCid(int cid) {
//        this.cid = cid;
//    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUid() {
        return uid;
    }

    public int getBid() {
        return bid;
    }

//    public int getCid() {
//        return cid;
//    }

    public String getComment() {
        return comment;
    }
}
