package com.example.noteapp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	Logger logger = LoggerFactory.getLogger(NoteController.class);
	
	@Autowired
	NoteService service;
	
	@GetMapping("/port")
	public String getPorts() {
		return service.getCommentsPort();
	}
	
	
	
	//@CircuitBreaker(name="comments", fallbackMethod="sendDummyData")
	//@Retry(name="comments", fallbackMethod="sendDummyData")
	@GetMapping("/searchComments/{pid}")
	public List<CommentsDto> findCommentsOnPid(@PathVariable("pid")Integer pid){
		logger.info("connecting to comemnt server....");
		return service.findCommentsByPid(pid);
	}
	
	@GetMapping("/search/{pid}")
	public Optional<Note> findNotes(@PathVariable("pid") String pid) {
		return service.searchByNoteId(pid);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deleteNotes(@PathVariable("pid") String pid) {
		service.deleteNoteById(pid);
		return "Note Deleted";
	}
	
	@GetMapping("/all")
	public List<Note> findAll(){
		return service.showAll();
	}
	
	@GetMapping("/find/{title}")
	public List<Note> findAllByTitle(@PathVariable("title")String title){
		return service.searchByTitle(title);
	}
	
	@GetMapping("/find/{title}/{author}")
	public List<Note> findAllByTitleandAuthor(@PathVariable("title")String title,
			@PathVariable("author")String author){
		return service.searchByTitleandAuthor(title, author);
	}
	
	@PostMapping("/add")
	public Note addNote(@RequestBody Note note) {
		return service.addNotes(note);
	}
	
	public List<CommentsDto> sendDummyData(Exception e){
		List<CommentsDto> data = new ArrayList<>();
		data.add(new CommentsDto(5001,2001,"temp1","dummy data1"));
		data.add(new CommentsDto(5002,2002,"temp2","dummy data2"));
		data.add(new CommentsDto(5001,2003,"temp3","dummy data3"));
		return data;
		
	}
	
}
