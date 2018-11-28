
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
		int[] totalhours = new int[DEFAULT_SIZE];
		int[] dayHours = new int[DEFAULT_SIZE];

		int len = 0;

		Scanner keyIn = new Scanner(System.in);

		for (int i=0; i<DEFAULT_SIZE; i++) {

			System.out.print("��ȣ?");
			int no[i] = Integer.parseInt(keyIn.nextLine());

			System.out.print("������?");
			String title[i] = keyIn.nextLine();

			System.out.print("������?");
			String contents[i] = keyIn.nextLine();

			System.out.print("������?");
			Date startDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.print("������?");
			Date endDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.print("�Ѱ��ǽð�?");
			int totalhours[i] = Integer.parseInt(keyIn.nextLine());

			System.out.print("�ϰ��ǽð�?");
			int dayHours[i] = Integer.parseInt(keyIn.nextLine());
			len++;

			System.out.print("��� �Ͻðڽ��ϱ�?(Y/N");
			String input = keyIn.nextLine();
			
			if(input.equals("") || input.equalsIgnoreCase("y")) {
				continue;
		
			}
			break;
		}
		keyIn.close();

		for(int i=0; i<len; i++) {

			System.out.printf("%d,%s %s ~ %s, %d\n", 
					no[i],
					title[i],
					startDate[i],
					endDate[i],
					totalhours[i]);
			System.out.printf("������:%s\n", title[i]);
			System.out.printf("����:%s\n", contents[i]);
			System.out.printf("���ǽ�����:%s\n", startDate[i]);
			System.out.printf("����������:%s\n", endDate[i]);
			System.out.printf("�Ѽ����ð�:%d\n", totalhours[i]);
			System.out.printf("�ϼ����ð�:%d\n", dayHours[i]);
		}
	}
}
