package com.sist.exception;
// CheckException : 컴파일러가 검증(예외처리 했는지 여부)
/*
 * 파일입출력
 * URL 이용
 * 쓰레드이용
 * 서버(Network)
 * 데이터베이스 
 */
import java.io.*;

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileReader fr = new FileReader("C:\\javaDev\\예외처리_1.java"); // 그냥 한 줄만 쓰면 오류가 난다. 반드시 오류처리를 하고 들어가야하는 코드. 
		/*FileReader fr = null; // 밖으로 빼놓고 사용해야 finally에서도 사용이 가능함. 
		try
		{
			fr = new FileReader("C:\\javaDev\\예외처리_1.java");
			int i = 0; // 한글자씩 읽어온다. (char 대신에 int로 읽어온다)
			while((i=fr.read())!=-1) // -1은 EOF(End Of File : 파일의 끝)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			System.out.println("파일이 존재하지 않습니다!!");
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException ex)
			{
				System.out.println("파일 닫기 실패");
			}
		}*/
		// 위에와 같은 코딩인데 보통 아래와 같이 코딩함. 
		try(FileReader fr=new FileReader("c:\\javaDev\\예외처리_1.java")) // fr.close()를 자동 반환해줌. 
		{
			int i = 0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			System.out.println("파일이 존재하지 않습니다!!");
		}
	}

}
