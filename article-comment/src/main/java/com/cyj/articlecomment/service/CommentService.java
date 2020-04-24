package com.cyj.articlecomment.service;

import com.cyj.articlecomment.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentService {

   /**
    * 查询所有
    * @return
    */
   List<Comment> findAll();

   /**
    * 增加
    * @param comment
    */
   void insert(Comment comment);

   /**
    * 修改
    * @param comment
    */
   void save(Comment comment);

   /**
    * 删除
    * @param id
    */
   void del(String id);

}
