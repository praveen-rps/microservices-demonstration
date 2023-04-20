package com.example.noteapp1;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient("COMMENT-SERVICE/comments")
public interface CommentProxy {
	
	@GetMapping("/findByPid/{pid}")
	public List<CommentsDto> getByPid(@PathVariable("pid")int pid);
	
	@GetMapping("/port")
	public String getPort();
}
