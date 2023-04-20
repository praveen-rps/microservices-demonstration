package com.example.comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comments.model.Comments;
import com.example.comments.repo.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	CommentsRepository repo;
	
	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Comments> getCommentsByPid(Integer pid) {
		// TODO Auto-generated method stub
		return repo.findByPid(pid);
	}

}
