package com.cyj.articlecomment.service.impl;

import com.cyj.articlecomment.dao.CommentRepository;
import com.cyj.articlecomment.entity.Comment;
import com.cyj.articlecomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
    @Override
    public void insert(Comment comment) {
        commentRepository.insert(comment);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void del(String id) {
        commentRepository.deleteById(id);
    }
}
