package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final int DEFAULT_SIZE = 20;
    int[] no = new int[DEFAULT_SIZE];
    String[] title = new String[DEFAULT_SIZE];
    String[] contents = new String[DEFAULT_SIZE];
    Date[] startDate = new Date[DEFAULT_SIZE];
    Date[] endDate = new Date[DEFAULT_SIZE];
    int[] totalHours = new int[DEFAULT_SIZE];
    int[] dayHours = new int[DEFAULT_SIZE];

    int len = 0;
    
    Scanner keyIn = new Scanner(System.in);

    for (int i = 0; i < DEFAULT_SIZE; i++) {
      System.out.print("��ȣ? ");
      no[i] = Integer.parseInt(keyIn.nextLine());

      System.out.print("������? ");
      title[i] = keyIn.nextLine();

      System.out.print("����? ");
      contents[i] = keyIn.nextLine();

      System.out.print("���ǽ�����? ");
      startDate[i] = Date.valueOf(keyIn.nextLine());

      System.out.print("����������? ");
      endDate[i] = Date.valueOf(keyIn.nextLine());

      System.out.print("�Ѱ��ǽð�? ");
      totalHours[i] = Integer.parseInt(keyIn.nextLine());

      System.out.print("�ϰ��ǽð�? ");
      dayHours[i] = Integer.parseInt(keyIn.nextLine());

      len++;

      System.out.print("����Ͻðڽ��ϱ�?(Y/n) ");
      String input = keyIn.nextLine();
      if (input.equals("") || input.equalsIgnoreCase("y")) {
        continue;
      }
      break;
    }
    keyIn.close();

    for (int i = 0; i < len; i++) {
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          no[i], title[i], startDate[i], endDate[i], totalHours[i]);
    }

  }
}