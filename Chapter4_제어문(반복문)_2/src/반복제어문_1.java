/*
 * 		반복제어문
 * 			=> 반복문 종료 : break
 * 			=> 특정부분을 제거 : continue
 * 			*** 주의점
 * 				break;
 * 				continue; ===> 바로 밑에 소스 코딩을 할 수 없다. 
 * 
 * 				if(i<10)
 * 				{	
 * 					여기는 코딩이 가능함. 
 * 					break; / continue;
 * 					System.out.println("a"); ==> 오류
 * 				}
 * 
 * 				break  =======> 반복문, 선택문에서만 사용이 가능(if문에서 사용하지 못함) => 제어문을 종료
 * 				continue =====> 반복문이 있는 경우에만 사용이 가능 => 제외하고 다음 반복문을 수행하여라. 
 * 
 * 				while()
 * 				{
 * 					break; ==> 중단
 * 				}
 * 
 * 				for()
 * 				{
 * 					break; ==> 중단
 * 				}
 * 			
 * 				while(조건식)
 * 				{
 * 					continue; ==> 조건식으로 이동
 * 				}
 * 	
 * 				for(초기값;조건식;증가식)
 * 				{
 * 					continue; ==> 증가식으로 이동
 * 				}
 */
// break; 1~100까지 출력 ==> 5까지만 출력 후 for을 중단
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i==5)
				break;//i=5면 종료 
			// break문장 아래에 코드를 추가하면 안 되지만 break는 if문 안에 있어서 상관없음. 아래 문장은 if문 소속문장이 아님. 
			System.out.print(i+" "); // 결과값 : 1 2 3 4(그냥 빠지는 형태)
		}
		System.out.println();
		for(int i=1;i<=100;i++) // 입력값 => q,Q ===> 게임 ESC => break
		{
			System.out.print(i+" ");// 결과값 : 1 2 3 4 5(출력하고 빠져나가는 형태)
			if(i==5)
				break;//i=5면 종료 
		}
		// 코드를 어디에 입력하느냐에 따라서 결과값이 바뀔수 있음.
		System.out.println();
		int i = 1;
		while(i<=100)
		{
			if(i==5)
				break;
				//break대신에 System.exit(0)을 쓰면 프로그램이 아예 종료되어서 이후 코드가 수행되지 않는다. 
			System.out.print(i+" "); 
			i++; //결과값 : 1 2 3 4
		}
		System.out.println();
		int i_1 = 1;
		while(i_1<=100)
		{
			System.out.print(i_1+" ");
			if(i_1==5)
				break;// while종료 ==> System.exit(0)
			i_1++; //결과값 : 1 2 3 4 5 
		}
		//일반적으로 종료할 때는 break를 쓰고, 프로그램을 종료하고 싶을 때 System.in을 쓰는 것. 
	}

}
