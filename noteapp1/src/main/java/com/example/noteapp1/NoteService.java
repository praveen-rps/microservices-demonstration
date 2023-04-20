package com.example.noteapp1;

import java.util.List;
import java.util.Optional;



public interface NoteService {
	public List<Note> showAll();
	public Note addNotes(Note note);
	public Optional<Note> searchByNoteId(String pid);
	public void deleteNoteById(String pid);
	public List<Note> searchByTitle(String title);
	public List<Note> searchByTitleandAuthor(String title,String author);
	public String getCommentsPort();
	public List<CommentsDto> findCommentsByPid(int pid);
}
