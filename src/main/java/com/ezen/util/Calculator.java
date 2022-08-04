package com.ezen.util;

public class Calculator {
	
	public int add(int a, int b) {
		return a+ b;
	}
	
	
	public int randomInt(int size) {
		return (int)(Math.random()*size);
	}
	
	public int getEven () {
		int num =(int)(Math.random()* 100000);
		return num % 2 == 0 ? num : num+1;
	}
	
	public boolean prime (int a) {
		boolean isprime = true;
		if(a <2) {
			isprime = false;
		}
		for(int i=2; i<a; i++) {
			if(a % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;
		 
	}
}
