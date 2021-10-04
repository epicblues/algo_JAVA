package com.thisisjava.chap15.practice;
import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		Iterator<Board> iter = list.iterator();
		
		while(iter.hasNext()) {
			Board board = iter.next();
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}

}
