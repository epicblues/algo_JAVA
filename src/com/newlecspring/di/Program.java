package com.newlecspring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newlecspring.DependencyInjection;
import com.thisisjava.chap15.practice.Board;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		 * 스프링아 니가 아래 코드를 대신 입력 해줄래?
		Exam exam = new NewlecExam();
		
		ExamConsole console = new GridExamConsole();
		console.setExam(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/newlecspring/di/setting.xml");
		
		DependencyInjection console =  (DependencyInjection) context.getBean("console");
		
		Board board = context.getBean(Board.class);
		System.out.println(board);
		
		// 인터페이스 구현체 부품을(상황에 맞게) 만들어서 던져주는 것이 스프링
		
	}

}
