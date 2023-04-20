package com.example.comments.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {
	
	@Id
	Integer cid;
	
	Integer pid;
	
	String comment;
	
	String commenter;
	public Comments() {
		
	}
	
	public Comments(Integer cid, Integer pid, String comment, String commenter) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.comment = comment;
		this.commenter = commenter;
	}


	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	

}
