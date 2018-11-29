package com.eomcs.lms.test;

public class Test {

	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.setname("홍길동");
		p1.setage(200);
		p1.setweight(700);
		p1.setheight(300);
		
		
		System.out.println(p1.getname());

	}

}
