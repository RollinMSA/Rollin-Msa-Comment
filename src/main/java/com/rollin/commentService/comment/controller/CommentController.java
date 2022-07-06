package com.rollin.commentService.comment.controller;



import com.rollin.commentService.comment.model.CommentEntity;
import com.rollin.commentService.comment.service.CommentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comment")
@Slf4j
public class CommentController {

    @Autowired
    CommentService commentService;

    @Autowired
    CommentEntity commentEntity;
    Environment env;
    @Autowired
    public CommentController(Environment env){
        this.env = env;
    }


    @GetMapping
    public List<CommentEntity> GetAll(){

        return commentService.getAllComment();
    }

    @PostMapping("id")
    public List<CommentEntity> GetAllById(@RequestBody CommentEntity commentEntity){

        commentEntity.setBoardId(commentEntity.getId());
        return commentService.getAllByboardId(commentEntity.getBoardId());
    }

    @PostMapping
    public Integer postComm(@RequestBody CommentEntity commentEntity){
        return commentService.insertComment(commentEntity);
    }

}
