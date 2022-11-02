import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) // 종료하는 프로그램을 반드시 만든다. 
		{
			System.out.println("====== Menu =====");
			System.out.println("1. 로그인");//String
			System.out.println("2. 회원가입");//io
			System.out.println("3. 영화목록");//try~catch => Jsoup
			System.out.println("4. 영화상세");
			System.out.println("5. 영화예매");
			System.out.println("6. 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택하세요?");
			int menu = scan.nextInt();
			switch(menu)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				movieList();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.println("존재하지 않는 메뉴입니다!!(404)");
			}
		}
		
	}
	// 영화 목록 출력 기능 ==> 메소드(배열, 메소드, 클래스(변수+메소드) 
	static void movieList()
	{
		try
		{
			Document doc = Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title = doc.select("strong.tit_item a.link_txt");
			Elements reserve = doc.select("span.info_txt span.txt_num");
			for(int i=0;i<title.size();i++)
			{
				System.out.println((i+1)+"."+title.get(i).text()+"("+reserve.get(i).text()+")");
			}
		}catch(Exception e){}//8장
	}

}
