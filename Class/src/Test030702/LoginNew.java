package Test030702;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class LoginNew {
	private JLabel lable;
	public   void  setFont(Font font,Color bg){
		lable.setFont(font);
		lable.setBackground(bg);
	}
	public  void setPractice(String img){
		Icon ic=new ImageIcon(img);
		lable.setIcon(ic);
		
	}
	public LoginNew(JLabel lable,JFrame frame){
		this.lable=lable;
		frame.add(lable);
	}
	public static void main(String[] args) {
		JFrame frame=new JFrame("登录页面");
//		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel userName=new JLabel("用户名");
		JTextField userText=new JTextField();
		JLabel passWord=new JLabel("密码");
		JTextField passText=new JTextField();
		JButton login=new JButton("登录");
		JButton reset=new JButton("重置");
		frame.setLocation(300,200);
		frame.setSize(600,400);
		userName.setBounds(100,80,80,50);
		userText.setBounds(200,90,120,30);
		passWord.setBounds(100,160,80,50);
		passText.setBounds(200,170,120,30);
		login.setBounds(120, 230, 80, 40);
		reset.setBounds(220, 230,80, 40);
		frame.add(userName);
		frame.add(userText);
		frame.add(passWord);
		frame.add(passText);
		frame.add(login);
		frame.add(reset);
		JLabel la=new JLabel();
		LoginNew l=new LoginNew(la,frame);
		Font f=new Font("宋体",Font.BOLD, 40);
	    l.setFont(f,Color.blue);
	    l.setPractice("F://4.jpg");
//	    la.setSize(1000, 150);
	    la.setText("小苹果");
	    frame.add(la);
	    
//	    System.out.println(la.getLocation().x + "," + la.getLocation().y);
//	    System.out.println(la.getSize().width + "," + la.getSize().height);
	    frame.setVisible(true);
	}
	

}
