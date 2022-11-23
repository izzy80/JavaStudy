/*
 * 578page => 컬렉션
 * 			  ----- 데이터 모아서 메모리 저장(자료 구조:메모리에 저장된 데이터를 쉽게 관리)
 *			  컬렉션 프레임워크 : 표준화(동일하게 사용)
 *			  					|
 *							인터페이스(표준화의 가장 대표적인 프로그램, 표준화가 되었다 = 모든 클래스가 동일) 			
 * 
 * 							Collection
 * 								|
 * 					-------------------------
 * 					|			|			|
 * 					List		Set			Map
 * 					|			|			|
 * 					|			HashSet		HashMap
 * 		-------------------------
 * 		|			|			|
 * 	***ArrayList	Vector		LinkedList
 * 		int[]
 * 		index = 0
 * 		
 * 		index = arr.length
 * 		Stack : 들어갈 때 0번부터 나올때는 뒤에서부터 나옴. 
 * 		Queue : 인덱스번호랑 같이 감.
 * 579page
 * ----------------------------------------------------
 * List : 순서가 있다, 데이터중복 허용						
 * 			구현된 클래스 : ArrayList , Vector, LinkedList, Stack, Queue 
 * 														-------------- 코딩에서 등장. 많이 사용하지는 않음
 * 						데이터베이스 연결, 네트워크|사용자 정보 저장, C언어와 호환
 * 						--------------
 * 							웹의 중심  
 * ----------------------------------------------------
 * Set :  순서가 없다, 데이터중복 허용X
 * 			HashSet, TreeSet
 * 			------ 중복제거
 * ----------------------------------------------------
 * Map : key와 value를 쌍으로 저장
 * 		key는 중복X, value는 중복O
 * 		저장시 put("id", "admin")와 같이 사용
 * 		=> 정보처리시험에서 (도서) ISBN -> 키
 * 		=> session, cookie 프로그램에서 사용
 * 		=> Spring, MyBatis, JPA에서도 사용. 저장시에 key, value로 저장
 * 		HashMap, Hashtable, properties(파일)
 * ----------------------------------------------------
 * 
 * 가장 최상위 클래스 : Collection(자료구조라서  CURD가 가능)
 *		=> add() : 데이터 추가 #선언하고 있는 메소드 중 가장 대표적
 *		=> set() : 데이터 수정
 *		=> remove() : 데이터 삭제
 *		=> get() : 데이터 읽기
 *		=> size() :  갯수
 *
 *	ArrayList
 *	--------- 단점 : 인덱스번호를 자동으로 조절. 항상 순차적으로 생성
 *					데이터가 많으면 속도가 느려져서 불편. 그래서 데이터 수집용으로 많이 쓰임. 
 *					저장이 무엇으로 될 지 모름. 라이브러리는 이미 만들어짐. movie넣을지 사원 넣을 지 string을 넣을 지 몰라서 object로 되어있음.
 *					그래서 항상 형변환을 시켜야한다. => 불편
 *					그래서 개발자들이 요구함. 원하는 데이터를 출력하게 해달라
 *						-------------- 그래서 제네릭스라는 것을 만들어줌
 *					ArrayList<String> ==> Object가 다 String으로 변함. 
 *							  ----- 제네릭스
 *					제네릭스의 단점 : ArrayList<int> list = new ArrayList<int>(); 불가
 *								Wrapper 클래스가 들어감.
 *								ArrayList<Integer> list = new ArrayList<Integer>();
 * 
 * 
 * 
 */
import java.util.*;
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 표준화 예시
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		System.out.println(list);
		Vector vec = new Vector();
		vec.add(1);
		vec.add(2);
		System.out.println(vec);
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
	}

}
