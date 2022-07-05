package com.rollin.commentService.comment.service;

import com.rollin.commentService.comment.model.CommentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    List<CommentEntity> getAllComment();

    Integer insertComment(CommentEntity commentEntity);
}
