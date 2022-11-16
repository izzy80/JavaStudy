package com.sist.exception;
class A
{
	
}
class B extends A
{
	
}
public class MainClass_실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str=" 10"; // ""안에 공백이 들어가면 안 됨
			System.out.println(Integer.parseInt(str.trim())); //parseInt() 문자열을 정수형으로 변경할 때 사용되는 메소드
			//System.out.println(10/0);
			//System.out.println(str.trim()); // 끝 => catch로 이동 후 종료, catch절은 다시 돌아오지 않는다. 
			// B b = (B)new A(); -> 이렇게 하는 거 아님. Classcast발생
			A a = new B();
			B b = (B)a;
		}catch(ArrayIndexOutOfBoundsException ex) 
		{
			// 배열 범위를 초과할 때 처리하는 예외처리 => 한개만 수행
			System.out.println("배열의 범위를 초과하였습니다!!");
		}
		catch(ArithmeticException ex)
		{
			// 0으로 나눌 경우 처리
			System.out.println("0으로 나눌 수 없습니다!!");
		}
		catch(NumberFormatException ex)
		{
			// 문자열 => 정수형으로 변경시에 처리
			System.out.println("정수로 변환이 안 됩니다!!");
		}
		catch(NullPointerException ex)
		{
			// 객체, 클래스의 주소값이 없는 경우
			System.out.println("객체의 주소가 없는 상태입니다!!");
		}
		catch(ClassCastException ex)
		{
			// 형변환을 잘못했을 경우
			System.out.println("클래스 형변환이 잘못되었습니다!!");
		}
		catch(RuntimeException ex) 
		// => 맨 위로 올라가면 오류처리남. 
		// 맨 위에 올라가면 그 밑에 있는 것들은 RuntimeException으로 속해있어서 굳이 코딩할 필요가 없음. 
		//그래서 맨 아래에 쓴다. 
		{
			// 위에 있는 모든 예외처리 // 예상하지 못하는 경우 (기타)
			System.out.println("위에 등록된 예외 외의 다른 모든 예외를 처리한다!!");
		}

	}

}
