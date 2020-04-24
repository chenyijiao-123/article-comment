package com.cyj.articlecomment.service.impl;


import com.cyj.articlecomment.entity.Comment;
import com.cyj.articlecomment.service.CommentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommentServiceImplTest {

    @Autowired
    private CommentService commentService;
    @Test
    public void findAll() {
        System.out.println(commentService.findAll());
    }

    @Test
    public void insert() {
        Comment comment = new Comment();
        comment.setId("7");
        comment.setArticleid("10007");
        comment.setContent("你好,靓仔");
        comment.setParentid("1");
        commentService.insert(comment);
    }
    @Test
    public void save() {
        Comment comment = new Comment();
        comment.setId("7");
        comment.setContent("你好嗨");
        commentService.save(comment);
    }

    @Test
    public void del() {
      commentService.del("7");
    }
}