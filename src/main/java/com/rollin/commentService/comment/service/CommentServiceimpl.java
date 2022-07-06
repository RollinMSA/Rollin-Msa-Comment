package com.rollin.commentService.comment.service;

import com.rollin.commentService.comment.model.CommentEntity;
import com.rollin.commentService.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceimpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<CommentEntity> getAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public List<CommentEntity> getAllByboardId(Integer boardId) {
        Sort sort = sortByvDate();
        final List<CommentEntity> sortedList = commentRepository.findAllByboardId(boardId, sort);

        return sortedList ;
    }

    private Sort sortByvDate() {
        return Sort.by(Sort.Direction.ASC, "ref2");
    }


    @Override
    public Integer insertComment(CommentEntity commentEntity) {
        CommentEntity new_comment=commentRepository.save(commentEntity);
        if(new_comment.getId()!=null) {
            return 1;
        }else{
            return 0;
        }
    }
}
