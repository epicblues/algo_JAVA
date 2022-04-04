package com.practice;

import java.util.Objects;

import com.practice.interfacesample.ConcreteTemplateMethod;
import com.practice.interfacesample.TemplateMethodImplementationClass;

public class Main {

	public static void main(String[] args) {
		TemplateMethodImplementationClass template = new ConcreteTemplateMethod();
		template.setFrontHook(() -> {
			System.out.println("hello baka its hook");
		});

		template.templateMethod();



	}

}
