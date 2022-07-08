package com.rollin.commentService.comment.service;

import com.rollin.commentService.comment.model.CommentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommentService {

    List<CommentEntity> getAllComment();

    List<CommentEntity> getAllByboardId(Integer boardId) ;

    Integer insertComment(CommentEntity commentEntity);

    Optional<CommentEntity> loveCount(Integer id, Integer love);

}
