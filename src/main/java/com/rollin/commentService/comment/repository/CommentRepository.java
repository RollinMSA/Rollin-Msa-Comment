package com.rollin.commentService.comment.repository;


import com.rollin.commentService.comment.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {

}
