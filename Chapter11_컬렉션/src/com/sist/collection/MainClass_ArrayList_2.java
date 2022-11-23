package com.sist.collection;
import java.util.*;
public class MainClass_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("포도");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("배");
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		System.out.println("----------------------");
		for(int i=0;i<list.size();i++)
		{
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("==== 출력 =====");
		System.out.println(list); // 데이터가 몇 개 안 될때
		System.out.println("==== 출력 ====");
		list.forEach((obj)->System.out.println(obj)); // 람다식(함수포인터)
		
		
	}

}
