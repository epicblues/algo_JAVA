package com.thisisjava.chap11.classs;

import java.lang.reflect.InvocationTargetException;

public class NewInstanceExample {

	public static void main(String[] args) {
		
			try {
//				Class clazz = Class.forName("com.thisisjava.chap11.classs.SendAction");
				Class clazz = Class.forName("com.thisisjava.chap11.classs.ReceiveAction");
				Action action = (Action)clazz.getDeclaredConstructors()[0].newInstance(3);
				action.execute();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
