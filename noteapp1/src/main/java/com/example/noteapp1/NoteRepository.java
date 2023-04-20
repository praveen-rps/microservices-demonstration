package com.example.noteapp1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


//@Repository
public interface NoteRepository extends JpaRepository<Note,String> {
	public List<Note> findByTitle(String title);
	
	@Query("from Note u where u.title=?1 and u.author=?2")
	public List<Note> findByTitleAndAuthor(String title, String author);
	
}

//@Query