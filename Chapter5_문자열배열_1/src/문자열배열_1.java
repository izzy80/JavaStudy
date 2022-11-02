import java.util.Arrays;

/*
 * 문자열 배열 => 206page
 * ---------------------
 * => 문자열 여러개를 저장할 수 있는 공간
 * => 선언
 * 		String[] 배열명;
 * 		String 배열명[];
 * => 초기화
 * 		String[] 배열명=new String[10];==>String의 초기값 null
 * 		=> 주소가 없는 상태
 * 		String[] 배열명={"홍길동","이순신","강감찬"}
 * -------------------------------------------------------------
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("홍길동".length());
		String[] names= {"홍길동","이순신","강감찬","박문수","김두한"};
		// 출력
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		System.out.println();
		for(String name:names)
		{
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(names));
	}

}