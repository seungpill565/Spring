package com.ezen.util;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	//다른 폴더에 있지만 같은 패키지이기 때문에 import가 필요없다
	Calculator calc = new Calculator();
	static int i;
	int a, b;
	@Before
	public void before() {
		System.out.println("Execute Junit @Before("+ ++i +")");
		a=10;
		b=20;
		
	}
	@After
	public void after() {
		System.out.println("Execute Junit @After("+ i + ")");
	}

	@Test
	public void addtest() {
		int result = calc.add(a,b);
		assertEquals(30, result);
	}
	
	@Test
	public void randomTest1() {
		for(int i =10; i <100; ++i) {
			assertTrue(calc.randomInt(i) < i);
		}
	}
	/*
	 	(1) 실행하면 짝수인 양의 정수를 생생성하여 반환하는 메서드를 정의한 후 알맞은 테스트 케이스를 작성
	 	
	 	(2) 어떤 숫자를 하나 전달하면 소수인지 아닌지 판별해주는 메서드를 정의한 후 알맞은 테스트 케이스를 작성
	 
	 
	 */
	//1.
	@Test
	public void evenTest() {
		int num = calc.getEven();
		
		 assertTrue(num % 2 == 0);
	}
	
	@Test
	public void evenTest2() {
		int num = calc.getEven();
		
		 assertFalse(num % 2 == 1);
	}
	
	@Test
	public void evenTest3() {
		ArrayList<Integer> evens = new ArrayList<>();
		for(int i=0; i< 20000; ++i) {
			evens.add(calc.getEven());
		}
		
		 assertFalse("evens에 0이 발견 되었습니다.",evens.contains(0));
	}
		
	//2.
	@Test
	public void primTEst() {
		int i=53;
		assertTrue(calc.prime(i));
	} 
	
	@Test
	public void primTEst2() {
		assertFalse(calc.prime(14));
	} 
	
	@Test
	public void primTEst3() {
		assertFalse("1을 소수로 판별함 ",calc.prime(1));
	} 
	@Test
	public void primTEst4() {
		assertFalse("-7을 소수로 판별함",calc.prime(-7));
	} 
	
	
}
