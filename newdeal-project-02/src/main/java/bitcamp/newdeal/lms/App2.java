//App2.java
//main()�� �ڵ带 �ۼ��Ѵ�.
//���� ���
//
//��ȣ? 1
//�̸�? ȫ�浿
//�̸���? hong@test.com
//��ȣ? 1111
//����? hong.png
//��ȭ? 1111-2222
//
//��ȣ: 1
//�̸�: ȫ�浿
//�̸���: hong@test.com
//��ȣ: 1111
//����: hong.png
//��ȭ: 1111-2222
//������: 2019-01-01

package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("��ȣ?");
		int no = Integer.parseInt(keyin.nextLine());
		
		System.out.println("�̸�?");
		String name = keyin.nextLine();
		
		System.out.println("�̸���");
		String email = keyin.nextLine();
		
		System.out.println("��ȣ");
		String password = keyin.nextLine();
		
		System.out.println("����?");
		String photo = keyin.nextLine();
		
		System.out.println("������");
		Date startdate = Date.valueOf(keyin.nextLine());
		
		keyin.close();
		
		System.out.println();
		
		System.out.println("��ȣ"+no);
		System.out.println("�̸�"+name);
		System.out.println("�̸���"+email);
		System.out.println("��ȣ"+password);
		System.out.println("����"+photo);
		System.out.println("������"+startdate);
		
		
		
		

	}

}
