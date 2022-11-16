package com.sist.exception;

public class MainClass_예외처리실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 414 page..
		// 416page 별표 중요중요(정의, 목적)
		/*System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
		}catch(RuntimeException ex)
		{
			System.out.println(6);
		}
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
		// 1 2 3 4 5 7 8 9 => catch절빼고 나머지 다 수행*/
	
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(10/0); // => catch 이동. 
			// error나는 밑에 문장부터 수행하지 못함. error부터 2개의 문장 건너뛰고 수행
			System.out.println(5);
		}catch(RuntimeException ex)
		{
			System.out.println(6);
		}
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
		// 1 2 3 6 7 8 9
		// error나면 catch로 이동, final은 에러가 나든 무조건 수행
	}

}
