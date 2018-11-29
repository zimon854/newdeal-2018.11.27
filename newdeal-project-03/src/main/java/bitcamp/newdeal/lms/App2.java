//과제 2: 여러 명의 회원 정보를 입력 받아 출력하라.
//App2.java
//main()에 코드를 작성한다.
//실행 결과
//목록으로 출력할 항목은 번호,이름,이메일,전화,가입일이다.
//
//번호? 1
//이름? 홍길동
//이메일? hong@test.com
//암호? 1111
//사진? hong.png
//전화? 1111-2222
//
//계속 입력하시겠습니까?(Y/n) y
//
//번호? 2
//이름? 임꺽정
//이메일? lim@test.com
//암호? 1111
//사진? lim.png
//전화? 1111-2223
//
//계속 입력하시겠습니까?(Y/n) y
//
//번호? 3
//이름? 전봉준
//이메일? jeon@test.com
//암호? 1111
//사진? jeon.png
//전화? 1111-2224
//
//계속 입력하시겠습니까?(Y/n) n
//
//1, 홍길동 , hong@test.com       , 1111-2222      , 2019-01-01
//2, 임꺽정 , lim@test.com        , 1111-2223      , 2019-01-01
//3, 전봉준 , jeon@test.com       , 1111-2224      , 2019-01-01

package bitcamp.newdeal.lms;

import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;

public class App2 {

  public static void main(String[] args) {
    Scanner keyin = new Scanner(System.in);
    final int DEFAULT_SIZE = 3;
    int[] no = new int[DEFAULT_SIZE];
    String[] name = new String[DEFAULT_SIZE];
    String[] email = new String[DEFAULT_SIZE];
    String[] photo = new String[DEFAULT_SIZE];
    int[] phonenumber = new int[DEFAULT_SIZE];
    
    int len = 0;
    for(int i = 0; i<DEFAULT_SIZE; i++) {
    System.out.println("번호");
    no[i] = Integer.parseInt(keyin.nextLine());
    
    System.out.println("이름");
    name[i] = keyin.nextLine();
    
    System.out.println("이메일");
    email[i] = keyin.nextLine();
    
    System.out.println("사진");
    photo[i] = keyin.nextLine();
    
    System.out.println("전화");
    phonenumber[i] = Integer.parseInt(keyin.nextLine());
     len++;  
     
     
     System.out.println("계속하시겠습니까? Y/N");
     String input = keyin.nextLine();
     if(input.equals("") || input.equalsIgnoreCase("y")) {
       continue;
     }
     break;
     
    }
    keyin.close();
    
    for (int i = 0; i < len; i++) {
      System.out.printf("%d, %s, %s, %s, %d \n",
          no[i], name[i], email[i], photo[i], phonenumber[i]);
    }
    
  }

}
