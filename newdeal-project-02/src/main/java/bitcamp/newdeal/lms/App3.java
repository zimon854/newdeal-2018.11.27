//App3.java
//main()에 코드를 작성한다.
//실행 결과
//
//번호? 1
//내용? 게시글입니다.
//
//번호: 1
//내용: 게시글입니다.
//작성일: 2019-01-01
//조회수: 0

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("번호");
		int no = Integer.parseInt(keyin.nextLine());
		
		System.out.println("내용");
		String contents = keyin.nextLine();
		
		System.out.println();
		System.out.println("번호?");
		int no2 = Integer.parseInt(keyin.nextLine());
		
		System.out.println("내용");
		String contents2 = keyin.nextLine();
		
		System.out.println("작성일");
		Date createdate = Date.valueOf(keyin.nextLine());
		
		System.out.println("조회수");
		int clicker = Integer.parseInt(keyin.nextLine());
		
		keyin.close();
		
		System.out.println("번호" + no);
		System.out.println("내용" + contents);
		System.out.println();
		System.out.println("번호" + no2);
		System.out.println("내용" + contents2);
		System.out.println("작성일" + createdate);
		System.out.println("조회수" + clicker);
		

	}

}
