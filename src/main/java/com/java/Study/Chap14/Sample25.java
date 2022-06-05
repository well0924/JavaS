package com.java.Study.Chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Autowierd{
	String value();
}

class GreetingService{
	@Autowierd("Cheol-su")
	public void greeting(String name) {
		System.out.println(name);
	}
}
public class Sample25 {
	public static void main(String[] args) throws Exception {
		GreetingService service = new GreetingService();
		Method method = service.getClass().getMethod("greeting", String.class);
		
		if(method.isAnnotationPresent(Autowierd.class)) {
			Autowierd anno = method.getAnnotation(Autowierd.class);
			method.invoke(service, anno.value());
		}
	}
}
