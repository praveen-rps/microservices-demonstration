package com.example.comments.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.comments.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments,Integer>{
	public List<Comments> findByPid(Integer pid);
}
