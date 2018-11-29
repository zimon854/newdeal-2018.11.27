//번호? 1
//내용? 게시글입니다.
//
//계속 입력하시겠습니까?(Y/n) y
//
//번호? 2
//내용? 두 번째 게시글입니다.
//
//계속 입력하시겠습니까?(Y/n) y
//
//번호? 3
//내용? 두 번째 게시글입니다.
//
//1, 게시글입니다.              , 2019-01-01, 0
//2, 두 번째 게시글입니다.        , 2019-01-01, 0
//3, 세 번째 게시글입니다.        , 2019-01-01, 0

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner keyin = new Scanner(System.in);
    final int DEFAULT_SIZE = 3;


    int[] no = new int[DEFAULT_SIZE];
    String[]contents = new String[DEFAULT_SIZE];
    Date[] createDate = new Date[DEFAULT_SIZE];
    int[] clicker = new int[DEFAULT_SIZE];

    int i = 0;
    while(i < DEFAULT_SIZE) {
      System.out.println("번호?");
      no[i] = Integer.parseInt(keyin.next());

      System.out.println("내용?");
      contents[i] = keyin.next();

      createDate[i] = new Date(System.currentTimeMillis());

      clicker[i] = 0;

      i++;
    
    System.out.print("\n계속 입력하시겠습니까?(Y/n) ");
    String answer = keyin.nextLine().toLowerCase();

    if (!answer.equals("y") && answer.length() > 0) {
      break;
    }

    System.out.println();
  }

  keyin.close();

  System.out.println();

  // 배열에 입력한 개수만큼 출력한다.
  for (int j = 0; j < i; j++) {
    System.out.printf("%3d, %-20s, %s, %d\n", 
        no[j], contents[j], createDate[j], clicker[j]);
  }
}
}


