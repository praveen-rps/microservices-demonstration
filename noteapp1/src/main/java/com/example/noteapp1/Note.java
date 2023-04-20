package com.example.noteapp1;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="notes")
@Data
public class Note {
	
	@Id
	String pid;
	
	String title;
	
	String author;
	
	String description;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Note(String pid, String title, String author, String description) {
		super();
		this.pid = pid;
		this.title = title;
		this.author = author;
		this.description = description;
	}
	public Note() {
		
	}
	

}
