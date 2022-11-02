/*
*  1~ 10에서 if(i==5){continue;}하면 결과값이 1 2 3 4 6 7 8 9 10 으로 결과값이 나옴. 
*  5가 제외됨. 
*  continue : 해당 숫자를 제외하고 나머지를 출력해라. 제외가 필요하면 for문 처음으로 다시 돌아갈때 while문
*/
// continue => 제외
// 1~10 ---> 5,9 제외
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==9)
				continue;//i==5 => i++로 이동 ==> 일반 자바, break 웹에서도 많이 쓰임
			System.out.print(i+" "); //결과값 : 1 2 3 4 6 7 8 10 
		}
		System.out.println();
		// 무한루프시에 주로 사용
		int i=1;
		while(i<=10)
		{
			// System.out.println("Hello");쓰면 무한루프 걸림
			if(i==5 || i==9)
				continue;
			System.out.print(i+" "); //결과값 : 1 2 3 4 그런데 무한루프걸림.계속 5에서 머물고 있음. i++로 넘어가지 못해서. 
			i++;
		}
		// continue는 while에서 쓰면 무한루프 상태가 걸리기 때문에 잘 안 쓰고 for문에서 많이 쓰인다. 
	}

}
