//@@@@@@@@@@continue와 break 위치 파악하기!!@@@@@@@@@
import java.util.Scanner;
/*
 * 	1. 컴퓨터 가위바위보
 * 		------------ 계속 진행 ==> 사용자가 q/Q입력시 그만.  
 */
//무한루프 돌아갈때 프로그램 멈추면 : 작업관리자 - 세부정보-javaw-작업끝내기
public class 반복제어문_3 {
	//종료 => break, 잘못된 입력(경고) => continue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win = 0,lose = 0,same = 0;
		int count = 0; //게임 횟수
		//new ==> 메모리가 공간이 다르다. 100개를 하면 100개가 저장되어 메모리가 오버가 된다. Scanner은 한 번만 생성해주기.
		Scanner scan = new Scanner(System.in);
		/* System.out.println(scan);
		 * java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
		 * ↑ scanner 주소
		 */
		while(true)
		{
			// 난수 발생 ==> 게임 시점 ==> 0(가위), 바위(1), 보(2)
			int com = (int)(Math.random()*3); //0~2
			// random ==> 웹에서 예약일을 할때 사용됨.  0.0~0.99 ==> 0.0~2.999 ==> 반올림이라는 것은 없음. int 변환시 소수점 아래 다 삭제 => 0~2
			System.out.print("가위(0), 바위(1), 보(2):");
			// int와 char을 동시에 받지 못하므로 게임이 한 번끝날때마다 종료할까요?를 물어본다. 
			int user = scan.nextInt();
			if(user<0 || user>2) // 잘못된 입력
			{
				System.out.println("가위(0), 바위(1), 보(2)를 입력하세요!!");
				continue;//처음부터 다시 실행 ==> while의 조건문으로 이동
			}
			count++;//게임 횟수
			// 결과값 출력
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else if(com==2)
				System.out.println("컴퓨터:보");
			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else if(user==2)
				System.out.println("사용자:보");
			
			// 누가 이겼는지 확인
			/*
			 *                             
			 * com		user		com-user
			 * 0(가위)	0 (가위)			0 (s)
			 * 			1 (바위)			-1 u-w
			 * 			2  (보)			-2 c-w
			 * com 		user
			 * 1(바위)	0 (가위)			1 c-w
			 * 			1 (바위)			0 (s)
			 * 			2 (보)			-1 u-w
			 * com 		user	
			 * 2(보)		0 (가위)			2 u-w
			 * 			1 (바위)			1 c-w
			 * 			2 (보)			0 (s)
			 * ------------------------------------------> user ==> -1,2
			 * 												com ==> -2,1
			 * 												same ==> 0
			 */

			switch(com-user)
			{
			case -1: case 2:
				System.out.println("사용자 Win!!");
				win++;
				break;
			case -2: case 1:
				System.out.println("컴퓨터 Win!!");
				lose++;
				break;
			case 0:
				System.out.println("비겼다");	
				same++;
			}
			// 종료 확인
			System.out.println("게임을 종료할까요?(y/n):");
			char c = scan.next().charAt(0); // Scanner로 문자 한 개 받기
			if(c=='y' || c=='Y')
			{
				System.out.println("Game Over!!");
				break;//while을 종료
			} // n값은 처리 안 해도 된다. n집어넣으면 알아서 while문 돌음
		}
		//게임 종료 여부 확인 ex) 10전 4승 2무 4패
		System.out.printf("%d전 %d승 %d무 %d패\n",count,win,same,lose);
	}

}
