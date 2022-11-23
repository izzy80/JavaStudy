// 데이터는 건들지 않고 메소드만 건들임. 
package com.sist.movie;
import java.util.*;
import java.io.*;
/*
 * 목록
 * 상세
 * 검색
 * ----
 * 
 */
public class MovieSystem {
	private static ArrayList movieList = new ArrayList(); // => 오라클
	// 접속하는 모든 사람이 데이터를 볼 수 있도록 static(공유변수)을 사용함. 
	// static을 사용하지 않으면 유저마다 따로따로 갖고 들어감. 
	static 
	{
		try
		{
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer sb = new StringBuffer(); // movie에 있는 데이터를 sb에 모아주기 위해서
			while((i=fr.read())!=-1) // 파일 끝까지 읽기 => 한 글자씩 읽어온다
			{
				sb.append(String.valueOf((char)i));
			}
			// 파일 닫기
			fr.close();
			String movie = sb.toString();
			String[] temp = movie.split("\n"); // 한 줄씩 읽는다
			for(String m:temp) //m => 영화 한 개에 정보
			{
				String[] mm=m.split("\\|"); //StringTokenizer을 사용해서 자를 수도 있음
				Movie mov = new Movie();
				mov.setMno(Integer.parseInt(mm[0]));
				mov.setTitle(mm[1]);
				mov.setGenre(mm[2]);
				mov.setPoster(mm[3]);
				mov.setActor(mm[4]);
				mov.setRegdate(mm[5]);
				mov.setGrade(mm[6]);
				mov.setDirector(mm[7]);
				
				movieList.add(mov);
			} // 데이터 불러와서 set이용해서 클래스 자체를 array에 저장
		}catch(Exception ex) {}
	}
	public ArrayList movieAllData(int page) //웹
	{
		ArrayList list = new ArrayList(); //페이지 나누어서 리스트 다시 만들어주어야함
		int j = 0;
		int pagecnt = (page*20)-20; //데이터 20개씩 받으면서 페이지 나눔
		/*
		 * for => start ~ end
		 * 1page => 0~19
		 * 2page => 20~39
		 * 3page => 40~59
		 * ------------------ 자바로 페이지를 나누면 단점이 있음 => 속도가 저하됨. 오라클을 배우면 인라인뷰라는 것을 배우는 데 이것을 사용해서 내가 필요한 부분을 잘라올 수 있음
		 * 						오라클 인라인뷰(페이징기법, 가상테이블)이 기술면접에 나옴 
		 * 
		 * 1938개의 데이터라 20으로 나눌 수 없음. 18이 남는다. 
		 * for(int i=pagecnt;i<pagecnt+20;i++) -> 더 잘짠 코딩
		 * 
		 * 
		 */
		for(int i=0;i<movieList.size();i++) // 1938바퀴를 도는 코딩
		{
			if(j<20 && i>=pagecnt)
			{
				Movie m = (Movie)movieList.get(i);
				list.add(m);
				j++;
			}		
		}
		return list;
	}
	public int movieTotalPage()
	{
		return (int)(Math.ceil(movieList.size()/20.0));
	}
	public Movie movieDetailData(int mno)
	{
		return (Movie)movieList.get(mno-1);
	}
	public ArrayList movieFind(int type, String fd)
	{
		ArrayList list = new ArrayList(); // 찾은 데이터를 묶어서 전송
		for(int i=0;i<movieList.size();i++)
		{
			Movie m = (Movie)movieList.get(i);
			if(type==1) // MainClass_조립기에서 1 => 제목 
			{
				if(m.getTitle().contains(fd))
				{
					list.add(m);
				}
			}
			else if(type==2) // 2 => 출연
			{
				if(m.getActor().contains(fd))
				{
					list.add(m);
				}
			}
			else if(type==3) // 3=> 장르
			{
				if(m.getGenre().contains(fd))
				{
					list.add(m);
				}
			}
				
		}
		return list;
	}
}
/*
 * 다른 내용
 * 자바로 HTML만들어줌. 실제로 만들어진 브라우저의 소스를 보면 java코드는 없고 HTML만 출력함
 * <% %> 부분은 다 사라지고 초로색 글씨만 출력
 */

