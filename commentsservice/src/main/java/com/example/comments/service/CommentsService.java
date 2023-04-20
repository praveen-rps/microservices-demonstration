package com.example.comments.service;

import java.util.List;

import com.example.comments.model.Comments;

public interface CommentsService {
	public List<Comments> getAllComments();
	public List<Comments> getCommentsByPid(Integer pid);
}
