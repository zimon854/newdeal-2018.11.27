
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
			System.out.print("번호?");
			int no[i] = Integer.parseInt(keyIn.nextLine());

			System.out.print("수업명?");
			String title[i] = keyIn.nextLine();

			System.out.print("수업명?");
			String contents[i] = keyIn.nextLine();

			System.out.print("시작일?");
			Date startDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.print("종료일?");
			Date endDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.print("총강의시간?");
			int totalhours[i] = Integer.parseInt(keyIn.nextLine());

			System.out.print("일강의시간?");
			int dayHours[i] = Integer.parseInt(keyIn.nextLine());
			len++;

			System.out.print("계속 하시겠습니까?(Y/N");
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
		
		}
	}
}
