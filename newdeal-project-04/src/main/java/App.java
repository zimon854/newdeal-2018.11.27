import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    Lesson[] lessons = new Lesson[LENGTH];
    
    int i = 0;
    while (i < LENGTH) {
     
    	lessons[i] = new Lesson();
      
      System.out.print("��ȣ? ");
      lessons[i].no = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("������? ");
      lessons[i].contents = keyboard.nextLine();
      
      System.out.print("����? ");
      lessons[i].startDate = Date.valueOf(keyboard.nextLine());
      
      System.out.print("������? ");
      lessons[i].endDate = Date.valueOf(keyboard.nextLine());
      
      System.out.print("������? ");
      lessons[i].totalHours = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("�Ѽ����ð�? ");
      lessons[i].dayHours = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("�ϼ����ð�? ");
      lessons[i].no = Integer.parseInt(keyboard.nextLine());
      
      i++; // �迭�� �ε����� ������Ų��.
      
      // ����ڰ� �Է��� ���� �ҹ��ڷ� ��ȯ�Ѵ�.
      System.out.print("\n��� �Է��Ͻðڽ��ϱ�?(Y/n) ");
      String answer = keyboard.nextLine().toLowerCase();
      
      // �Է� ���� "Y", "y", "" �� �ƴϸ�, �Է��� �����Ѵ�. 
      if (!answer.equals("y") && answer.length() > 0) {
        break;
      }

      System.out.println();
    }
    
    keyboard.close();
    
    System.out.println(); // �� �� ���
    
    // �迭�� �Է��� ������ŭ ����Ѵ�.
    for (int j = 0; j < i; j++) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          lessons[j].no, lessons[j].contents, 
          lessons[j].startDate,lessons[j].endDate,lessons[j].totalHours,
          lessons[j].dayHours);
    }
  }
}
