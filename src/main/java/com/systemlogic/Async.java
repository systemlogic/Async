package com.systemlogic;

import javax.jws.WebService;

@WebService
public class Async {

	public int asyncAdd(int a,int b){
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Thread was put on sleep for client program to proceed. ");
		return a+b;
	}
}
