package com.sist.main;
class A
{
	
}
/*
 * int a = 10;
 * int a1 = 20;
 * ...
 * ...
 * ...
 * int a9 = 100;
 * 공간이 10개
 * 
 * =====================>
 * int a =10;
 * a = 20;
 * a = 30;
 * 공간 1개로 돌려막기
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++)
		{
			A a = new A();
			System.out.println("a="+a);
		}*/
		// 더 잘 짠 코딩
		A a =null;
		for(int i=1;i<=10;i++)
		{
			a = new A();
			System.out.println("a="+a);
		}
		
	}

}
