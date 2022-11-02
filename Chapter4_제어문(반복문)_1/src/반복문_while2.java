/*
 * 난수 => 6개 추출 => 합
 * ----1~100;
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		int sum = 0;
//		int a = (int)(Math.random()*100)+1; //1~100 사이의 정수 한 개 추출
//		sum+=a;
//		a = (int)(Math.random()*100)+1;
//		sum+=a;
//		a = (int)(Math.random()*100)+1;
//		sum+=a;
//		a = (int)(Math.random()*100)+1;
//		sum+=a;
//		a = (int)(Math.random()*100)+1;
//		sum+=a;
//		a = (int)(Math.random()*100)+1;
//		sum+=a;
//		
//		System.out.println("sum="+sum);
		int sum = 0;
		int i=1;
		while(i<=6)
		{
			int a = (int)(Math.random()*100)+1;
			//a변수는 while 한번 수행시마다 => 새로운 변수다 $첫번째 나온 a와 두번째 나온 a는 서로 다르다.$
			System.out.println(i+"."+a);
			sum+=a;
			i++;
		}// a는 메모리에 의해서 자동 삭제
		// System.out.println("a="+a); // 오류 변수
		// System.out.println("i="+i); // 오류
		/* 아래는 가능
		 * int i=1;
		 * for(i=1;i<=100;i++)
		 * {
		 * }
		 * System.out.println("i="+i);
		 */
		System.out.println("sum="+sum);
// $똑같은 문장 3번 이상 반복되면 반복문 사용하고 두번은 그냥 한 번 더 코딩하기.$
// 싱글턴 -> ????????? 메모리 누수 방지  
	}

}
