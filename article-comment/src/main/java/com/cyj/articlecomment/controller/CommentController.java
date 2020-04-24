package com.cyj.articlecomment.controller;

import com.cyj.articlecomment.entity.Comment;
import com.cyj.articlecomment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/commentAll")
    public String list(Model model){
        model.addAttribute("commentList",commentService.findAll());
        return "list";
    }


    @PostMapping("/add")
    public void insert(@RequestBody Comment comment) {
        commentService.insert(comment);
    }


    @PutMapping("/update")
    public void update(Comment comment){
        commentService.save(comment);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        commentService.del(id);
        return "delete success";
    }
}