

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		
		System.out.print("��ȣ?");
		int no = Integer.parseInt(keyIn.nextLine());
		
		System.out.print("������?");
		String title = keyIn.nextLine();
		
		System.out.print("������?");
		String contents = keyIn.nextLine();
		
		System.out.print("������?");
		Date startDate = Date.valueOf(keyIn.nextLine());
		
		System.out.print("������?");
		Date endDate = Date.valueOf(keyIn.nextLine());
		
		System.out.print("�Ѱ��ǽð�?");
		int totalhours = Integer.parseInt(keyIn.nextLine());
		
		System.out.print("�ϰ��ǽð�?");
		int dayHours = Integer.parseInt(keyIn.nextLine());
		
		keyIn.close();
		
		System.out.println("��ȣ:"+ no);
		System.out.printf("������:%s\n", title);
		System.out.printf("����:%s\n", contents);
		System.out.printf("���ǽ�����:%s\n", startDate);
		System.out.printf("����������:%s\n", endDate);
		System.out.printf("�Ѽ����ð�:%d\n", totalhours);
		System.out.printf("�ϼ����ð�:%d\n", dayHours);
		
	
		
		
		
    }
}
