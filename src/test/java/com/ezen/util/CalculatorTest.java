package com.ezen.util;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	//�ٸ� ������ ������ ���� ��Ű���̱� ������ import�� �ʿ����
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
	 	(1) �����ϸ� ¦���� ���� ������ �������Ͽ� ��ȯ�ϴ� �޼��带 ������ �� �˸��� �׽�Ʈ ���̽��� �ۼ�
	 	
	 	(2) � ���ڸ� �ϳ� �����ϸ� �Ҽ����� �ƴ��� �Ǻ����ִ� �޼��带 ������ �� �˸��� �׽�Ʈ ���̽��� �ۼ�
	 
	 
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
		
		 assertFalse("evens�� 0�� �߰� �Ǿ����ϴ�.",evens.contains(0));
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
		assertFalse("1�� �Ҽ��� �Ǻ��� ",calc.prime(1));
	} 
	@Test
	public void primTEst4() {
		assertFalse("-7�� �Ҽ��� �Ǻ���",calc.prime(-7));
	} 
	
	
}
