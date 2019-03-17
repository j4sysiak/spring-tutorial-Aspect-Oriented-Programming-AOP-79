package com.jaceksysiak.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaceksysiak.spring.camera.accessries.Lens;

public class App {

	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/aop/beans.xml");
 
		Camera camera = (Camera) context.getBean("camera");
		Lens lens = (Lens) context.getBean("lens");
		
		//camera.snap();
		//camera.snap(1000);
		//camera.snap("Warshaw castle");
		//camera.snapNighttime();
		lens.zoom(5);
		
		//System.out.println(camera);
		
		((ClassPathXmlApplicationContext)context).close();
		  
		  
	}

}
