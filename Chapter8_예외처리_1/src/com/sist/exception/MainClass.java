package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends JFrame implements ActionListener{
	//					------------ 클래스		-----------------인터페이스(다중 상속 가능)
	//public class MainClass extends JFame implements ActionListener로 쓰면 인터페이스가 구현안된 메소드가 있어서 오류뜸
	// MainClass에 마우스 커서 가져다 대고 ~~~클릭
	private JTextArea ta; // 포함 클래스
	private JTextField tf;
	private JButton b1,b2;
	
	private int[] com = new int[3];
	private int[] user = new int[3];
	private int s,b;
	//시작과 동시에 배치
	public MainClass()
	{
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta); // 옆에 스크롤바가 JScrollPane
		tf = new JTextField(10);
		b1 = new JButton("Start");
		b2 = new JButton("Exit");
		add("Center", js);
		JPanel p=new JPanel(); // panel이 모아주는 것
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("South",p);
		
		// 크기
		setSize(450, 420);
		setVisible(true);
		
		// 이벤트 등록
		b1.addActionListener(this); // 클릭 ==> 시스템에 의해서 자동 호출(Callback)
		// 아래 actionPerformed 메소드 호출함
		tf.addActionListener(this); // 엔터 
		// 아래 actionPerformed 메소드 호출함
		
		
	}
	public void getRand()
	{
		for(int i=0; i<3;i++)
		{
			com[i] = (int)(Math.random()*9)+1;//1~9
			for(int j=0;j<i;j++)
			{
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
		}
		else if(e.getSource()==tf)
		{
			// 입력한 값을 읽어온다
			String input = tf.getText(); // 값을 입력하고 enter치는 것
			// 정수형으로 변경 -> 예외사항이 있기 때문에 try~catch이용
			try
			{
				int m = Integer.parseInt(input);
			}catch(Exception ex) {
				//복구
				JOptionPane.showMessageDialog(this, "세자리 정수 입력");
				tf.setText("");
				tf.requestFocus();
				return; //윈도우, 웹은 복구가 가능. dos창은 불가능
			}
			
			
		}
	}

}
// ppt
/*
 * 계층 순서 기억하기!
 * #
 * IO, 쓰레드, 네트워크 => 체크 이셉션.
 * #
 * 예외복구 try-catch, 예외처리 throws, 예외전환 throw
 * #
 * 예외 발생 코드 => 정상적인 코드
 * #
 * 예외 잘못된 코드 -> 프로그래머
 * 		부정확한 데이터 -> 사용자
 * 
 * 
 * 변수(데이터형)
 * int, double, boolean,String 
 * 연산자 : 증감연산자, 형변환, 산술, 비교, 논리, 대입, 삼항
 * 제어문 ㅣ if, for, while, break
 * ---------------------------------------------
 * 배열 1차원 : String[]
 * ----------------------------------------------
 * 클래스 : 멤버변수, 생성자, 메소드
 * 		=> 캡슐화, 오버라이딩, 포함 클래스 
 * 인터페이스
 * 예외처리(throws, try-catch)
 * ----------------------------------------------라이브러리
 * String / StringBuffer/Wrapper/Date/Calendar/List(배열) / Map / Set / IO
 * ------------------------------------------------------------------------
 * SQL(데이터베이스 연동)
 * 
 * 
 * 브라우저에서 실행할 수 있는 언어가 HTML/CSS, JavaScipt만 실행됨.
 * 오라클 안에 데이터를 영구적으로 저장한다. 
 * 자바를 공부한 이유는 브라우저(컴퓨터)랑 오라클을 연결하는 것이 좋은데 이것이 안 된다. 이 기능이 없다. 할 수 있는 방법은 연결하는 방법을 찾는 것. 
 * 중간에 받아서 오라클로 넘겨서 데이터를 받아서 다시 브라우저에 보내주는 이 역할을 수행하는 것이 자바이다.  
 * 데이터를 가져와서 브라우저에 뿌리는. 이 프로그램을 짤 줄 알아야함. 
 * 
 * html보다 속도가 빨라서 react-vue를 최근에 많이 사용함. 
 * 웅답받은 것을 화면으로 출력만 해주는 역할 html
 * 응답하고 요청을 받기 위해서 java를 배움
 * 화면 출력 -> front
 * 응답 및 요청 => back
 * 
 * 
 */
