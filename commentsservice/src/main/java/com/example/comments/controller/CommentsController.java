package com.example.comments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comments.model.Comments;
import com.example.comments.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsController {
	
	
	@Autowired
	CommentsService service;
	
	@GetMapping("/port")
	public String getPort() {
		return "Service running on port: 8008";
	}
	
	@GetMapping("/findByPid/{pid}")
	public List<Comments> getByPid(@PathVariable("pid")int pid)
	{
		return service.getCommentsByPid(pid);
	}
	@GetMapping("/test")
	public String test() {
		return "hell test";
	}
	
	@GetMapping("/all")
	public List<Comments> showComments(){
		return service.getAllComments();
	}

}
