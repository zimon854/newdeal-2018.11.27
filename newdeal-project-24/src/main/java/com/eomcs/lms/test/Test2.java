package com.eomcs.lms.test;

public class Test2 {

	public static void main(String[] args) {
		Score s1 = new Score();
		s1.name = "홍길동";
		s1.kor = 97;
		s1.math = 98;
		s1.eng = 99;
		s1.sum = s1.kor + s1.math + s1.eng;
		s1.aver = s1.sum / 3.0f;
		
		s1.sum = 250;
		s1.aver = 65.5f;

	}

}
