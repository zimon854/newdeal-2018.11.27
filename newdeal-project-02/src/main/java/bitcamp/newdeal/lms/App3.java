//App3.java
//main()�� �ڵ带 �ۼ��Ѵ�.
//���� ���
//
//��ȣ? 1
//����? �Խñ��Դϴ�.
//
//��ȣ: 1
//����: �Խñ��Դϴ�.
//�ۼ���: 2019-01-01
//��ȸ��: 0

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("��ȣ");
		int no = Integer.parseInt(keyin.nextLine());
		
		System.out.println("����");
		String contents = keyin.nextLine();
		
		System.out.println();
		System.out.println("��ȣ?");
		int no2 = Integer.parseInt(keyin.nextLine());
		
		System.out.println("����");
		String contents2 = keyin.nextLine();
		
		System.out.println("�ۼ���");
		Date createdate = Date.valueOf(keyin.nextLine());
		
		System.out.println("��ȸ��");
		int clicker = Integer.parseInt(keyin.nextLine());
		
		keyin.close();
		
		System.out.println("��ȣ" + no);
		System.out.println("����" + contents);
		System.out.println();
		System.out.println("��ȣ" + no2);
		System.out.println("����" + contents2);
		System.out.println("�ۼ���" + createdate);
		System.out.println("��ȸ��" + clicker);
		

	}

}
