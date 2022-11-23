package com.sist.main;
//JSP
// 유저가 보는 브라우저라고 생각하기
import java.util.*;
import com.sist.movie.*;
public class MainClass_조립기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curpage = 1; //현재 페이지
		MovieSystem ms = new MovieSystem();
		int totalpage = ms.movieTotalPage();
		Scanner scan = new Scanner(System.in);
		System.out.println("페이지 입력(1~"+totalpage+"):");
		curpage=scan.nextInt();
		// 해당 페이지에 있는 영화목록 얻기
		ArrayList list = ms.movieAllData(curpage);
		System.out.println("========"+curpage+"page 영화목록=======");
		for(int i=0;i<list.size();i++)
		{
			Movie m = (Movie)list.get(i);
			System.out.println(m.getMno()+"."+m.getTitle());
		}
		
		System.out.println("=============================");
		/*System.out.println("상세볼 영화 번호 입력:");
		int mno = scan.nextInt();
		
		Movie m = ms.movieDetailData(mno); // Movie에 선택한 모든 상세보기 데이터가 있음
		System.out.println("순위:"+m.getMno());
		System.out.println("영화명:"+m.getTitle());
		System.out.println("출연자:"+m.getActor());
		System.out.println("감독:"+m.getDirector());
		System.out.println("장르:"+m.getGenre());
		System.out.println("등급:"+m.getGrade());
		System.out.println("개봉일:"+m.getRegdate());*/
		System.out.println("======== 검색 ============");
		System.out.println("1. 제목 검색");
		System.out.println("2. 출연 검색");
		System.out.println("3. 장르 검색");
		System.out.println("=========================");
		System.out.println("검색 타입 선택:");
		int type = scan.nextInt();
		System.out.println("검색어 입력:");
		String fd=scan.next();
		ArrayList fList = ms.movieFind(type, fd);
		System.out.println("검색 결과:"+fList.size()+"개 검색");
		for(int i=0;i<fList.size();i++)
		{
			Movie m=(Movie)fList.get(i);
			System.out.println("제목:"+m.getTitle());
			System.out.println("장르:"+m.getGenre());
			System.out.println("출연:"+m.getActor());
		}
		
	}
}
