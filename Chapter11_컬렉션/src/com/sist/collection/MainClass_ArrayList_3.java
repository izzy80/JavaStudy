package com.sist.collection;
//객체 단위로 저장하는 법
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	} // 우클 - source - constructure using field
	public Sawon()
	{
		
	}
	
}
// 데이터 중복 제거 ==> HashSet ==> addAll(), subList : copy할때 
public class MainClass_ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// >>사원관리하는 프로그램 <<
		
		// 데이터 저장
		list.add(new Sawon(1, "홍길동","개발부","서울",3000));
		list.add(new Sawon(2, "심청이","기획부","경기",3500));
		list.add(new Sawon(3, "박문수","자재부","경기",3200));
		//list.add(new Sawon(4, "이순신","영업부","서울",4000));
		list.add(new Sawon(4, "이순신","개발부","서울",4000));
		//list.add(new Sawon(5, "강감찬","총무부","부산",4500));
		list.add(new Sawon(5, "강감찬","기획부","부산",4500));
		
		// 사원 목록을 출력
		System.out.println("=========== 사원 목록 ==============");
		for(int i=0;i<list.size();i++)
		{
			Sawon sa = (Sawon)list.get(i);
			/*System.out.println("사번:"+sa.getSabun());
			System.out.println("이름:"+sa.getName());
			System.out.println("부서:"+sa.getDept());
			System.out.println("근무지:"+sa.getLoc());
			System.out.println("연봉:"+sa.getPay());
			System.out.println("-------------------");*/
			System.out.println(sa.getSabun()+" "
			+sa.getName()+" "
			+sa.getDept()+" "
			+sa.getLoc()+" "
			+sa.getPay());
		}
		System.out.println("==================================");
		
		ArrayList temp=new ArrayList();
		temp.addAll(list); 
		// System.out.println(temp); //이 방식을 사용하면 값이 아닌 주소값을 출력함
		// addAll : for문을 이용하지 않고 위 전체 데이터를 통으로 저장할 때 쓰는 방식=>중복 데이터 제거 => 제거된 데이터를 받는 경우
		// addAll() ==> Vector / LinkedList / HashSet
		for(int i=0;i<temp.size();i++)
		{
			Sawon sa = (Sawon)temp.get(i);
			System.out.println(sa.getSabun()+" "
			+sa.getName()+" "
			+sa.getDept()+" "
			+sa.getLoc()+" "
			+sa.getPay());
		}
		
		//Scanner scan = new Scanner(System.in);
		/*System.out.println("이름 입력:");
		String name = scan.next();
		
		System.out.println("======== 정보 출력 =========");
		for(int i=0;i<list.size();i++)
		{
			Sawon sa = (Sawon)list.get(i);
			if(sa.getName().equals(name))
			{
				System.out.println("이름:"+sa.getName());
				System.out.println("부서:"+sa.getDept());
				System.out.println("근무지:"+sa.getLoc());
				System.out.println("연봉:"+sa.getPay());
				break;
			}
		}
		System.out.println("========= 데이터 추가 ==============");
		Sawon sa = new Sawon();
		System.out.println("이름 입력:");
		sa.setName(scan.next()); // String name=scan.next()
		
		System.out.print("부서 입력:");
		sa.setDept(scan.next());
		
		System.out.print("근무지 입력:");
		sa.setLoc(scan.next());
		
		System.out.print("연봉 입력:");
		sa.setPay(scan.nextInt());
		
		// 사번을 자동 증가하도록 만듦  ==> 시퀀스
		int max=0;
		for(int i=0;i<list.size();i++)
		{
			Sawon s = (Sawon)list.get(i);
			if(max<s.getSabun())
				max = s.getSabun();
		}
		sa.setSabun(max+1); 
		// list.size() ==> 중간에 하나를 제거하면 5->4인데 index가 바뀌는 거지 사번이 바뀌는 것은 아니다. 
		// 그래서 항상 최대값을 가져오고 +1을 해야함 
		list.add(sa);
		
		System.out.println("======== 추가된 인원 확인 ==========="); // 위에서 ctrl+C&V
		for(int i=0;i<list.size();i++)
		{
			Sawon sa1 = (Sawon)list.get(i);
			System.out.println(sa1.getSabun()+" "
			+sa1.getName()+" "
			+sa1.getDept()+" "
			+sa1.getLoc()+" "
			+sa1.getPay());
		}
		System.out.println("==================================");*/
		
		
		/*System.out.println("============ 부서별 찾기 =============");
		ArrayList deptList = new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			Sawon s = (Sawon)list.get(i);
			deptList.add(s.getDept()); // 중복된 부서들이 있다. 
		}
		System.out.println(deptList);
		
		// 데이터 중에 중복을 제거 Set(중복을 허용하지 않는다)
		HashSet set = new HashSet();
		for(int i=0;i<deptList.size();i++)
		{
			set.add(deptList.get(i));
		}
		//System.out.println(set); 
		int i=1;
		for(Object obj:set)
		{
			System.out.println(i+"."+obj);
			i++; // 집어넣어야 번호의 숫자가 바뀜
		}
		
		// 데이터 찾기 : 데이터가 중복된 것이 있기 때문에 이번에는 break를 주면 안 된다. 
		System.out.println("부서명 입력:");
		String dept=scan.next();
		for(i=0;i<list.size();i++)
		{
			Sawon s = (Sawon)list.get(i);
			if(s.getDept().equals(dept))
			{
				System.out.println(s.getName()+" "+s.getDept());
			}
		}*/
		
		
		
	}

}
