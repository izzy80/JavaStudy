import java.util.Arrays;

public class 메소드_2 {
	int[] rand(int no)
	{
		int[] com=new int[no]; //크기에 따라서 배열을 동적으로 만듦
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j]) // 중복 없이
				{
					i--;
					break;
				}
			}
		}
		return com; // 배열 리턴형으로 저장하면 ==> 주소(배열명)
	}
	
	void rand(int[] com) //void는 return값이 필요 없음
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j]) // 중복 없이
				{
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr= {1,2,3,4,5};
		int[] temp=arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));  
		
		temp[0]=100;
		temp[1]=200;
		temp[2]=300;
		temp[3]=400;
		temp[4]=500;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp)); // 주소가 같기 때문에 같은 결과값을 출력함. 
												   // arr값 바꾸면 temp값도 변함. temp값 변하면 arr값도 변함. 
		*/
		메소드_2 m=new 메소드_2();// => 인스턴스라서 객체를 생성해야 사용가능. rand()를 바로 쓸 수 없음. 
		// rand() 저장되어서 사용 가능해짐. 
		// static은 자동저장되어서 바로 사용가능
		//1)
		int[] arr=m.rand(10); // return형 // 결과값을 받아온다
		System.out.println(Arrays.toString(arr));
		//2)
		int[] arr1=new int[6];//매개변수 // arr1 => 주소(주소를 전송 => 해당 주소에 값을 채워달라)
		m.rand(arr1);
		System.out.println(Arrays.toString(arr1));
		// 클래스, 배열 ==> 값을 받을 경우(리턴형, 매개변수)
		/*
		 * 	기본형 매개변수 (int, double, char, boolean..), String ==> read only
		 * 				변수값을 읽기만 할 수 있다(변경 불가능하다)
		 * 	참조형 매개변수 사용자정의 클래스, 배열(주소) ==> trad, write
		 * 				변수값 읽기, 수정이 가능
		 * *** 매개변수가 3개 이상이면 클래스, 배열을 이용한다. 
		 */
	}

}
