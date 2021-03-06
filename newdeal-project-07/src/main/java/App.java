import java.sql.Date;
import java.util.Scanner;

public class App {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static final int LENGTH = 10;
  
  static Member[] members = new Member[LENGTH];
  static int memberIdx = 0;
  
  static Board[] boards = new Board[LENGTH];
  static int boardIdx = 0;
  
  public static void main(String[] args) {
	  
	  //사용할 객체에 의존 객체를 주입하기
	  Lessonhandler.keyboard = keyboard;
    
    while (true) {
      String command = prompt();

      if (command.equals("/lesson/add")) {
        Lessonhandler.addLesson();
        
      } else if (command.equals("/lesson/list")) {
    	Lessonhandler.listLesson();
      
      } else if (command.equals("/member/add")) {
        addMember();
        
      } else if (command.equals("/member/list")) {
        listMember();
        
      } else if (command.equals("/board/add")) {
        addBoard();
        
      } else if (command.equals("/board/list")) {
        listBoard();
        
      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;
        
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      
      System.out.println(); // 결과 출력 후 빈 줄 출력
    }

    keyboard.close();
  }

  private static String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine().toLowerCase();
  }

  private static void listBoard() {
    for (int j = 0; j < boardIdx; j++) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          boards[j].no, boards[j].contents, boards[j].createdDate, boards[j].viewCount);
    }
  }

  private static void addBoard() {
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

  private static void listMember() {
    for (int j = 0; j < memberIdx; j++) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
          members[j].no, members[j].name, members[j].email, 
          members[j].tel, members[j].registeredDate);
    }
  }

  private static void addMember() {
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
}

  
