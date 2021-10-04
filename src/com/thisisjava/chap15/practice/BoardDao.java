package com.thisisjava.chap15.practice;
import java.util.*;
public class BoardDao {
	private List<Board> boardList;

	public BoardDao() {
		boardList = new ArrayList<>();
		boardList.add(new Board("제목1","내용1"));
		boardList.add(new Board("제목2","내용2"));
		boardList.add(new Board("제목3","내용3"));
	}
	
	public List<Board> getBoardList() {
		return boardList;
	}

	
	
}
