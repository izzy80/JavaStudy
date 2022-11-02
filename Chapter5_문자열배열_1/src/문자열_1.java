import java.util.Arrays;

/*
 * 문자열 관련 데이터형(자바) => "", char ''
 * ---------------
 * String
 * ------문자열을 저장하는 기능, 문자열 제어하는 기능(라이브러리)
 * 1) 저장 방법
 * 		**String s = ""; => 가장 많이 사용되는 방법(기본형처럼 사용) => 웹에 90%(모든 데이터가 문자열로 되어 있음)
 * 		String id="admin" => char[] c={'a','d','m','i','n'};
 * 		------ char[]을 사용하기 쉽게 만든 클래스
 * 		String s = new String("");
 * 2) String 기능(메소드)
 * 	  -------------------
 * 		1. 문자 변환
 * 			1) toUpperCase : 대문자 변환(알파벳만) 
 * 			2) toLowerCase : 소문자 변환
 * 			*****3) valueOf : 모든 데이터형을 문자열로 변경
 * 					int a=10;
 * 					valueOf(a) ==> "10" ==> parseInt("10") ==> 10
 * 					boolean b=true
 * 					valueOf(b)==>"true" ==> parseBoolean("true") ==> true
 * 		2. 문자 제어
 * 			*X10000 1) subString() ==> 문자열 자를때 사용(화면 UI)
 * 		3. 문자 변경
 * 			***1) trim() : 좌우 공백 제거(입력 ex| 아이디)
 * 			2) replace() : 글자 변경 ==> 오라클에서 크롤링 많이 함. 특히 이미지 들어갈때
 * 				이미지 주소 : https://mp-seoul-image-production-s3.mangoplate.com/412767/1_uvh7q169lxjh.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80
 * 				replace('&','^') => 오라클에서 &는 입려값을 요구하기 때문에 변환해서 들어가야함. 
 * 			3) replaceAll() ==> 정규식(문자형식)
 * 				ip
 * 				replaceAll("[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}")
 * 							-----
 * 							모든 숫자가 1자리 아니면 3자리로 되어있음. 숫자는 총 4개 => 127.1.63.200
 * 							맛있는 맛있고 맛있게....
 * 							---------------------비교하려면 경우의 수가 너무 많아서 >>맛있+<<으로 찾는다. 그래서 정규식이 분석시에(빅데이터, AI) 중요
 * 			4) split() : 문자열을 배열로 변경
 * 				String s = "red, blue, green";
 * 				String[] arr=s.split(",") => {"red", "blue", "green"} 
 * 									-----
 * 									,로 구분해서 배열로 저장해라 
 * 		4. 문자 비교
 * 			*****1) equals() : 대소문자 구분 후 비교(로그인, 아이디중복체크, 아이디 찾기.., 상세보기)
 * 			*****2) contains() : 포함(검색)
 * 			3) startsWith : 서제스트(시작단어) => 자동완성기
 * 			4) endsWith : 끝나는 단어
 * 			---------------------------------------------
 * 		5. 문자 찾기
 * 			*****1) indexOf : 앞에서부터 데이터 찾기
 * 				String s="Hello Java"
 * 								 -
 * 				s.indexOf("a");
 * 			2) lastIndexOf : 뒤에서부터 데이터 찾기
 * 				String s="Hello Java"
 * 								   -
 * 				s.lastIndexOf("a");
 * 		6. 기타
 * 			1) concat("a","b") ==> ab ==> +기호가 있어서 중요하지 않다
 * 				"a"+"b" => "ab" 
 * 			*****2) charAt() ==> 문자 한 개를 가지고 올때
 * 			3) toCharArray() => 문자열을 char[]변경
 *			------------------------------------------------------기능/용도/사용처
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		//1. 변수(문자열) 선언
		//String msg="Hello Java";
		String msg;
		//char[] ==>
		/*
		 * "Hello Java" ==> {'H','e,'l','l'....}
		 *  0123456789
		 * 
		 * charAt(0) ==> 'H'
		 */
		//2. 초기화
		msg="Hello Java"; //입력값을 받거나 파일 읽을 때 사용
		//	  0123456789
		//3. 활용(요청 처리)
		//	1) 문자의 갯수확인(length()) ==> 
		System.out.println(msg.length()); // 공백도 문자로 취급한다 // 비밀번호 자리수
		//	2) 공백을 제거
		System.out.println(msg.trim().length()); //입력값을 사용자가 등록(실수 => space)
		// 좌우에 있는 공백을 제거. 가운데에 있는 공백은 제거x
		//	3) 변환 대문자
		System.out.println(msg.toUpperCase()); //검색
		//	4) 변환 소문자
		System.out.println(msg.toLowerCase());//검색
		// ==> 한글 검색(자음->찾기) => 메소드
		//5) 자르기 substring()
		/*
		 * substring(int start) => 지정된 위치부터 
		 * substring(int start,int end) => 
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5));//end는 제외,내가 원하는 위치+1
		String post = "101-123";
		//101, 123
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		String fileName="문자열_1.java";
		//				 012345 6
		System.out.println(fileName.substring(6));
		// 파일명 => 문자열.1.java 확장자는 항상 뒤에 있으니까 lastIndexOf
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println(msg.indexOf("o"));
		System.out.println(msg.lastIndexOf("o"));
		//4. 출력
		/*
		 * 1. 메소드명(기능)
		 * 2. 매개변수
		 * 3. 리턴형
		 */
	}

}
