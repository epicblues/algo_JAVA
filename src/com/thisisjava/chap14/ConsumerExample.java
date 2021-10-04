package com.thisisjava.chap14;
import java.util.function.*;
public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String,String> biConsumer = (t,v) -> System.out.println(t+v);
		biConsumer.accept("java", "8");
		
		DoubleConsumer	dConsumer = d -> System.out.println("java" + d);
		dConsumer.accept(8);
		
		ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
		
		IntSupplier intSup = () -> 5;
		
		System.out.println(intSup.getAsInt());
		
		

	}

}
