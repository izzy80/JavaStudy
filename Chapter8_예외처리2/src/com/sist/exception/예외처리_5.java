package com.sist.exception;
/*
 * 예외 던지기 => 임의로 예외를 발생
 * 형식 ==> throw new 예외처리생성자();
 * throw 발생해라~~
 * 예) throw new Exception() ==> 에러가 있는 경우 ==> 처리 
 */
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 10;
			if(a%2==0)
			{
				throw new MyException(a+"는(은) 홀수가 아닙니다!!");
			}
		}catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
