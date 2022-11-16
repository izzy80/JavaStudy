package com.sist.model;
import java.util.Scanner;
public class MainClass {
	public static int menu() // menu는 모든 사람들이 동일하게 써야 해서 static을 사용함. 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("============== Menu =================");
		System.out.println("1.HOME");
		System.out.println("2.회원가입");
		System.out.println("3.영화");
		System.out.println("4.공지사항");
		System.out.println("5.게시판");
		System.out.println("6.종료");
		System.out.println("======================================");
		System.out.println("메뉴 선택:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move mm=null; // interface
		// Map ==> 어노테이션 @
		while(true)
		{
			int m = menu();
			switch(m)
			{
			/*case 1: // Home이동
				Home home = new Home();
				home.move();
				break;
			case 2:// 회원가입
				Join join = new Join();
				join.move();
				break;
			case 3:
				Movie movie = new Movie();
				movie.move();
				break;
			case 4:
				Notice notice = new Notice();
				notice.move();
				break;
			case 5:
				Board board = new Board();
				board.move();
				break;
			case 6:
				System.out.println("사이트를 종료합니다!!");
				System.exit(0);*/
			case 1: // Home이동
				mm = new Home();
				mm.move();
				break;
			case 2:// 회원가입
				mm = new Join();
				mm.move();
				break;
			case 3:
				mm = new Movie();
				mm.move();
				break;
			case 4:
				mm = new Notice();
				mm.move();
				break;
			case 5:
				mm = new Board();
				mm.move();
				break;
			case 6:
				System.out.println("사이트를 종료합니다!!");
				System.exit(0);
			}
			
		}
	}

}
