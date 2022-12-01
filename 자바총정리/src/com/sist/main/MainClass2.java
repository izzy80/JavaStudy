package com.sist.main;
/*
 * 라이브러리
 * 		= java.lang(자바프로그램의 기본) => import를 생략이 가능
 * 			1) Object => 최상위 클래스(모든 클래스는 Object로부터 상속을 받는다)
 * 					  => 서로 다른 클래스를 묶어서 관리
 * 					  => 모든 라이브러리에서 객체를 리턴하는 메소드는 Object형을 가지고 있다
 *						------------- 사용자가 어떤 클래스명을 사용할 지 알지 못하기 때문에(형변환)
 *						class A
 *						{
 *							aaa()
 *							bbb()
 *							ccc()
 *						}
 *		
 *						Object a = new A(); ==> 변수는 Object가 가지고 있는 변수만 제어가 가능
 *						A aa = (A)a;
 *						 Object가 가지고 있는 메소드만 호출이 가능(메소드는 오버라이딩된 메소드를 호출한다)
 * 						=> toString() : 객체를 문자열로 변환 => 생략 가능
 * 						A a = new A();
 * 						System.out.println("a="+a) ==> a.toString()
 * 													  ------------- 객체의 주소 출력
 * 													  ------------- 오버라이딩(변수의 값)
 * 						=> finalize() : 소멸자(가비지컬렉션 => 자동호출) => 재정의(메모리 해제 여부 확인)
 * 										=> 멀티미디어, 화상, 음성
 * 						=> clone() : 복사(같은 메모리 크기로 새로운 메모리 제작) => 스프링(prototype)
 * 							스프링에서는 싱글턴(객체당 메모리 한 개만 사용) => 여러개 제작(clone) => 메모리 누수 현상 방지
 * 						=> equals() : 객체 비교
 * 										비교 : == 주소값 비교
 * 											  equals() 실제 저장된 값 비교
 * 						=> 참조
 * 							class A	
 * 							A a = new A();
 * 							A b = a;  ========================> a,b는 같다(매개변수로 값을 받는 경우)
 * 																Call By Reference => 같은 주소를 제어
 * 							A a = new A();
 * 							A b = a.clone(); =========> 새로운 메모리가 달라진다
 * 							
 * 
 * 			2) String : 문자열 저장(데이터베이스)
 * 						오라클
 * 						  문자형, 숫자형, 날짜형, 기타형
 * 						  ----- CHAR, VARCHAR2, CLOB => 자바에서 String으로 받는다
 * 								------ NUMBER(4), NUMBER(7,2) => int, double
 * 									   ------ DATE, TIMESAMP => java.util.Date
 * 												-----
 * 												BLOB/BFILE => InputStream
 * 				= 문자 저장 방법
 * 					String s =""(default), String s = new String("")
 * 					그냥 저장			새로운 메모리를 만들어 저장
 * 				= 기능 : 웹 사이트(화면 UI=>HTML은 한줄문자열) => CSS로 조절
 * 					1차 = SQL, 화면 UI(글꼴, 색상)
 * 				= length() : 문자의 갯수 => int length()
 * 				= trim() : 좌우의 공백 제거 => String trim() => 로그인, 회원가입, 검색
 * 				= substring() : 문자를 자를때
 * 								오버로딩 : String substring(int begin)
 * 										String substring(int begin, int end) : end-1
 * 				= startsWith() : 시작문자열이 같은 경우 : Cookie 저장
 * 								boolean startsWith(String fd)
 * 				= endsWith() : 끝문자열이 같은 경우
 * 								boolean endsWith(String fd)
 * 				= contains() : 문자 포함 여부 : 검색
 * 								=> 자음으로 찾기 => 오라클(PL/SQL)=Procedure, 자바
 * 								=> Procedure => 댓글
 * 								=> 프로시저 vs 트리거
 * 								=> boolean contains(String fd) => 추천, 챗봇
 * 				= equals() : 같은 경우 => 대소문자 구분, 로그인 처리, 아이디 찾기, 비밀번호 찾기
 * 				= indexOf() : 찾는 문자나 문자열의 위치 => 앞에서 찾는다
 * 								=> int indexOf(char c)
 * 								=> int indexOf(String s)
 * 								=> INSTR("",1) -> 오라클
 * 				= lastIndexOf() : 찾는 문자나 문자열의 위치 => 뒤에서 찾는다 => 경로명, 확장자
 * 								=> int lastIndexOf(char c)
 * 								=> int lastIndexOf(String s)
 * 								=> INSTR("",-1)
 * 								=> Hello java
 * 								   1234567890
 * 										  -2-1
 * 				= valueOf() : static메소드 => 모든 데이터형을 문자열로 변경
 * 							  static String valueOf(int)
 * 							  static String valueOf(double)
 * 							  static String valueOf(char[])
 * 							  ...
 * 							  
 * 			3) StringBuffer : 문자열 결합 : 최적화
 * 				= append() => 문자열 결합(+)
 * 				= toString() => 저장된 데이터를 한 번에 읽을 때
 * 			4) Math : 수학 관련
 * 				= random() : 난수 발생, (0.0~0.99) => static double random() (리턴형이 double)
 * 				= ceil() : 올림 함수 => 총 페이지 구하기 => static double ceil(double d)
 * 				= round() : 반올림 함수 => 평점 => static double round(double d)
 * 				-> 잘 사용하지 않는 이유는 오라클에도 있음. 
 * 			5) ***Wrapper(데이터형을 클래스화) => Integer, Double, Boolean, Long 
 * 				= 제네릭스 등록할때 주로 사용(제네릭스는 기본형을 사용할 수 없다. <클래스형>)
 * 					<int> (X) ==> <Integer>
 * 					기본형 ======= Wrapper 호환되어 있다
 * 					Wrapper = 기본값 ==> 박싱
 * 					Integer i = 10
 * 					기본형 = Wrapper ==> 언박싱
 * 					int ii = i -> Wrapper클래스를 받을 수 있음
 * 
 * 				# 원래 클래스는 주소값이 들어가야함. 클래스에 실제값을 대입할 수 있다.
 * 					=> parseInt(), parseDouble(), parseBoolean(), parseLong()
 * 						=> 문자열을 해당 데이터형으로 변경
 * 							---- 실제 프로그램 : 윈도우, 브라우저, 핸드폰
 * 											  ----- 데이터형(문자열)
 * 			## 면접에서 오버로딩/오버라이딩, 추상클래스/인터페이스, Wrapper 질문은 꼭 대답해야함.
 * 			6) System
 * 				표준 입출력 => System.in, System.out
 * 				gc() : 가비지컬렉션 호출
 * 				curentTimeMillis() : 시간 읽기 ==> 실행 시간 => 로그파일
 * 		= java.util(웹, 모바일 => 사용빈도가 많은 클래스의 집합)
 * 			1) StringTokenizer : 단어별 문자를 자를 때 사용
 * 				= 생성자 => new StringTokenizer(String data, 구분자)
 * 															----- String
 * 						=> new StringTokenizer(String data)==> 공백
 * 						=> 배열형식으로 => 데이터갯수가 넘으면 오류 발생
 * 				= 구분된 데이터를 읽기 : nextToken() => String nextToken()
 * 				= 구분된 데이터만큼 루프 처리 : hasMoreTokens() => 갯수가 다르거나 잘 모르는 경우
 * 				  **while(hasMoreTokens()) => boolean hasMoreTokens()
 * 				= countTokens() => 자른 갯수 => int countTokens()
 * 			2) Date, Calendar => Date는 기능은 없다(날짜의 데이터형)
 * 							  => Date에 없는 기능을 추가 새로운 클래스 => Calendar
 * 							  => Calendar는 추상 클래스
 * 									생성하는 방법)
 * 									Calendar cal = Calendar.getInstance()
 * 									--------------------------------------
 * 									날짜 설정 : set(Calendar.YEAR, 2022)
 * 											  set(Calendar.MONTH, 10) ==> 0번부터 인식(month-1)
 * 											  set(Calendar.DATE, 30)
 * 									날짜 읽기 : get(Calendar.YEAR)
 * 											  get(Calendar.MONTH)
 * 											  get(Calendar.DAYE)
 * 											  get(Calendar.DAY_OF_WEEK) => 요일 1번(일요일)
 * 									=> 달력 (예매, 예약, 결제일, 배송일)
 * 			3) ArrayList, HashSet, HashMap => Vector
 * 							Collection : 데이터를 모아서 관리(배열을 확장, 배열의 단점을 보완)
 * 							---------- 인터페이스 : 표준화되어 있다, 필요시에 오버라이딩해서 사용
 * 							배열단점 : 같은 데이터형만 모아서 저장, 고정적이다
 * 									 ---------------------- --------
 * 										다른 데이터형을 저장할 수 있다(Object), (크기는 추가될때마다 달라져서)가변형
 * 	
 * 							Collection
 * 								|
 * 					--------------------------------------------------------------------------------------------------------
 * 					|													|													|
 * 					List												Set													Map
 * 					1. 순서를 가지고 있다									1. 순서가 없다  										1. 키와 값을 동시에 저장
 * 					2. 데이터 중복 허용										2. 데이터 중복을 허용X										키는 중복X, 값은 중복O
 * 					3. 검색												3. ArrayList에 저장된 데이터중에 중복된 데이터 제거			2. 클래스 관리(스프링), SQL관리(마이바티스), 쿠키, 세션, 요청값 처리, 응답값 => Web에서 주로 등장
 * 					4. 순차적으로 저장했을때,								=> 오라클에서 제거 => DISTINCT							=> HashMap / Hashtable
 * 						속도가 가장 빠름									=> 구현된 클래스											------	-----------
 * 					5. 데이터 전급하는 속도가 빠름							HashSet / TreeSet										비동기		동기		===========> AJAX
 * 					6. 데이터베이스에서 주로 사용								--------												put() => 저장
 * 					=> 구현된 클래스										add(), remove(), get(), clear(), size()					get() => 읽기
 * 					ArrayList, Vector, LinkedList						=> 웹에서 통신할때(사용자 정보 저장) => 브라우저에 채팅			----------------- 데이터값변경 => put("같은 키", "값")
 * 					----------자료구조 (쉽게 메모리 제어가 가능 => CRUD)		Application : Socket
 * 					add(), remove(), set(), get(), clear(), size()		Web : WebSocket(Spring)
 * 					추가		삭제		수정		읽기		전체삭제	저장갯수
 * 
 * 			4) java.lang.regex
 * 				Pattern / Matcher ==> 정규식
 * 				정규식의 기호
 * 				----------
 * 					[] : 범위 [A-Z], [a-z], [A-Za-z], [0-9], [가-힣]
 * 							 대문자	소문자	알파벳전체	  숫자	  한글
 * 							 [A-C] [A|D|V]
 * 					{} : 갯수 [A-Z]{3} 대문자 3글자 [A-Z]{1,3}
 * 					+ : 1 이상 예) 맛있+ => 맛있고, 맛있는, 맛있....
 * 					* : 0 이상 예) 맛없* => 맛없, 맛없고, 맛없는...
 * 					. : 임의의 글자 한 글자 예) [A-Z]. => 앞에 알파벳 한글자, 뒤에 한글자, 총 임의의 두글자를 가져와라. 
 * 												   => A1 AK A가 
 * 					$ : 끝나는 문자 예) [A-Z]$
 * 					^ : 시작문자 예) ^[A-Z] => 알파벳으로 시작하는 것을 가져와라 / [^A-Z](부정)
 * 					| : 선택
 * 					=============================> 문자열의 패턴을 만들어 검색 (오라클, 자바스크립트)
 * 		java.text
 * 			1) SimpleDateFormat : 날짜를 원하는 형태로 출력 => 게시판, 입력...
 * 				=> TO_CHAR 오라클에서 변경 후 사용
 * 				=> String, Math, Date .... : 필요시에는 오라클에서 변경이 가능
 * 			2) MessageFormat : 예전에는 SQL때문에 많이 사용 => 형식있는 문자열을 만들때 사용
 * 				=> String name, sex, address, tel;
 * 					int age;
 * 					WHERE name LIKE '%A%'
 * 					WHERE REGEXP_LIKE(name, 'A')
 * 					WHERE SUBSTR(name, 1, 'A')
 * 					WHERE INSTR(name,1,'A')>0
 * 				=> 추가(문자열로 오라클로 전송)
 * 					String sql = "INSERT INTO table_name VALUES('"+name"','"+sex+"','"+address
 * 																	+"','"+tel+"','"+age")";
 * 					String sql = "INSERT INTO table_name VALUES('{0}','{1}','{2}','{3}','{4}')";
 * 					==> 최근에 java.sql에 등장 => PreparedStatement (미리 만들어놓고 나중에 값을 채워넣음)
 * 													=> VALUES 뒤에 (?,?,?,?,?)
 * 		java.io
 * 			1) File : 파일 / 디렉토리 정보
 * 				File file = new File("경로명"); ==> 디렉토리 정보
 * 				File file = new File("경로명/파일명"); ==> 파일 정보
 * 				=> 주요메소드
 * 					= getName() : 파일명, 디렉토리명
 * 					= getPath() : 경로명 전체 읽기
 * 					= getParent() : 경로명만 읽기
 * 					= length() : 파일 크기
 * 					= listFiles() : 전체 파일명을 읽기 ==> ls -a, dir
 * 					= createNewFile() : 파일 만들기 
 * 					= mkdir() : 폴더 만들기 : mkdir
 * 					= delete() : 파일 삭제 : rm -rf 
 * 						# 파일을 지워야 폴더가 삭제됨
 * 			2) FileInputStream / BufferedInputStream ==> 업로드
 * 								---------- 메모리 전체 데이터를 저장후 사용
 * 					read(), close() ==> 읽기 / 닫기
 * 			3) FileOutputStream / BufferedOutputStream ==> 다운로드
 * 					write(), close()
 * 			------------------------------------------------- 읽을 때 1byte => 바이트 스트림
 * 			4) FileReader / ***BufferedReader : readLine()
 * 					read(), close()
 * 			5) FileWriter / BufferedWriter
 * 					write(String), close()
 * 				------------------------------------------------ 읽을 때 2byte => 문자스트림
 * 																한글이 포함된 경우에 주로 사용(파일에 저장된 데이터를 제어)
 * 		java.net
 * 			1) URL : 웹사이트 주소를 설정할때 사용
 * 			2) URLEncoder : 브라우저(ASC), 자바(Unicode)
 * 							-----------	 -----------
 * 								1byte		2byte
 * 							=> 자바   ====== 브라우저로 전송
 * 									byte배열로 변경 => 인코딩
 * 							=> 브라우저 ======= 자바
 * 									byte배열을 String으로 변환 ==> 디코딩
 * 	https://www.google.com/search?q=%ED%99%8D%EA%B8%B8%EB%8F%99&oq=%ED%99%8D%EA%B8%B8%EB%8F%99&aqs=chrome..69i57.923j0j4&sourceid=chrome&ie=UTF-8
 * 	
 * 	%ED%99%8D%EA%B8%B8%EB%8F%99 : byte배열 => 인코딩
 * 	홍길동 => 디코딩
 */
import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url = new URL("https://www.daum.net/");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			if(conn!=null)//연결되었다면
			{
				BufferedReader in = 
						new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s = in.readLine();
					if(s==null) break;
					System.out.println(s);
				}
			}
		}catch(Exception ex) {}

	}

}
