import java.sql.Date;
import java.util.Scanner;

public class Lessonhandler {
	
	//이 클래스는 keyboard 객체가 있어야 한다.
	//따라서 이 클래스의 메서드를 사용하기 전에 반드시 keyboard
	//객체를 꼽아 줘야 한다.
	static Scanner keyboard;

	  static final int LENGTH = 10;
	  
	  static Lesson[] lessons = new Lesson[LENGTH];
	  static int lessonIdx = 0;
	  
	  static Member[] members = new Member[LENGTH];
	  static int memberIdx = 0;
	  
	  static Board[] boards = new Board[LENGTH];
	  static int boardIdx = 0;
	  
	  
	  
	  public static void listLesson() {
		    for (int j = 0; j < lessonIdx; j++) {
		      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
		          lessons[j].no, lessons[j].title, lessons[j].startDate, 
		          lessons[j].endDate, lessons[j].totalHours);
		    }
		  }

		  public static void addLesson() {
		    Lesson lesson = new Lesson();

		    System.out.print("번호? ");
		    lesson.no = Integer.parseInt(keyboard.nextLine());

		    System.out.print("수업명? ");
		    lesson.title = keyboard.nextLine();

		    System.out.print("설명? ");
		    lesson.contents = keyboard.nextLine();

		    System.out.print("시작일? ");
		    lesson.startDate = Date.valueOf(keyboard.nextLine());

		    System.out.print("종료일? ");
		    lesson.endDate = Date.valueOf(keyboard.nextLine());

		    System.out.print("총수업시간? ");
		    lesson.totalHours = Integer.parseInt(keyboard.nextLine());

		    System.out.print("일수업시간? ");
		    lesson.dayHours = Integer.parseInt(keyboard.nextLine());

		    // i 번째 배열에 수업 정보를 담고 있는 Lesson 객체(의 주소)를 보관한다.
		    lessons[lessonIdx] = lesson;
		    lessonIdx++;

		    System.out.println("저장하였습니다.");
		  }
		

public static void addMember() {
    Member member = new Member();
    
    System.out.print("번호? ");
    member.no = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("이름? ");
    member.name = keyboard.nextLine();
    
    System.out.print("이메일? ");
    member.email = keyboard.nextLine();
    
    System.out.print("암호? ");
    member.password = keyboard.nextLine();
  
    System.out.print("사진? ");
    member.photo = keyboard.nextLine();
  
    System.out.print("전화? ");
    member.tel = keyboard.nextLine();
  
    member.registeredDate = new Date(System.currentTimeMillis()); 
    
    members[memberIdx] = member;
    memberIdx++;
    
    System.out.println("저장하였습니다.");
  }


public static void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.no = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("내용? ");
    board.contents = keyboard.nextLine();
    
    board.createdDate = new Date(System.currentTimeMillis()); 
    
    board.viewCount = 0;
    
    boards[boardIdx] = board;
    boardIdx++;
    
    System.out.println("저장하였습니다.");
  }


public static void listBoard() {
    for (int j = 0; j < boardIdx; j++) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          boards[j].no, boards[j].contents, boards[j].createdDate, boards[j].viewCount);
    }
  }
}

