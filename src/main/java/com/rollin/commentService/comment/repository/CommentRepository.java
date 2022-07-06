package com.rollin.commentService.comment.repository;


import com.rollin.commentService.comment.model.CommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {

   List<CommentEntity>  findAllByboardId(Integer boardId, Sort sort);


}
