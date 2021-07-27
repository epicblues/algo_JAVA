package com.thisisjava.chap15;

public class Board {
	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board) { 
			Board target = (Board)obj;
			return subject.equals(target.subject) && content.equals(target.content);
					
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return subject.hashCode();
	}
}
