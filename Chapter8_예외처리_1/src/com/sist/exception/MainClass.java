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
 */
