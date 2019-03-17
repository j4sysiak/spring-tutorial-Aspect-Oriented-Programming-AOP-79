package com.jaceksysiak.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(* com.jaceksysiak.spring.aop.*.*(..))")
	public void cameraSnap(){
	}
	
	@Pointcut("execution(* com.jaceksysiak.spring.aop.Camera.snap(String))")
	public void cameraSnapName(){
	}
	
	@Pointcut("execution(* *.*(..))")
	public void cameraRelatedAction(){
	}
	
	@Before("cameraSnap()")
	public void aboutToTakePhoto(){
		System.out.println("About To Take Photo ...");
	}
	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName(){
		System.out.println("About To Take Photo with Name...");
	}
	
	@Before("cameraRelatedAction()")
	public void aboutCToDoCameraRelatedAction(){
		System.out.println("Doing something related to cameras ...");
	}

}
