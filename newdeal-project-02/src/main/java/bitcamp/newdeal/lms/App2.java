//App2.java
//main()에 코드를 작성한다.
//실행 결과
//
//번호? 1
//이름? 홍길동
//이메일? hong@test.com
//암호? 1111
//사진? hong.png
//전화? 1111-2222
//
//번호: 1
//이름: 홍길동
//이메일: hong@test.com
//암호: 1111
//사진: hong.png
//전화: 1111-2222
//가입일: 2019-01-01

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("번호?");
		int no = Integer.parseInt(keyin.nextLine());
		
		System.out.println("이름?");
		String name = keyin.nextLine();
		
		System.out.println("이메일");
		String email = keyin.nextLine();
		
		System.out.println("암호");
		String password = keyin.nextLine();
		
		System.out.println("사진?");
		String photo = keyin.nextLine();
		
		System.out.println("가입일");
		Date startdate = Date.valueOf(keyin.nextLine());
		
		keyin.close();
		
		System.out.println();
		
		System.out.println("번호"+no);
		System.out.println("이름"+name);
		System.out.println("이메일"+email);
		System.out.println("암호"+password);
		System.out.println("사진"+photo);
		System.out.println("가입일"+startdate);
		
		
		
		

	}

}
