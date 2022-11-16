package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends JFrame implements ActionListener{
	//public class MainClass extends JFame implements ActionListener로 쓰면 인터페이스가 구현안된 메소드가 있어서 오류뜸
	// Mainclass에 마우스 커서 가져다 대고 ~~~클릭
	private JTextArea ta;
	private JTextField tf;
	private JButton b1,b2;
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
