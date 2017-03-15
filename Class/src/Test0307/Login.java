package Test0307;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Login {
	private JLabel lable;
	JFrame frame=new JFrame("登录页面");
	JLabel userName=new JLabel("用户名");
	JTextField userText=new JTextField();
	JLabel passWord=new JLabel("密码");
	JTextField passText=new JTextField();
	JButton login=new JButton("登录");
	JButton reset=new JButton("重置");
	JButton login2=new JButton("多账号");
	JRadioButton rad1=new JRadioButton("记住密码");
	JRadioButton rad2=new JRadioButton("自动登录");
	JLabel la=new JLabel("");
	JPanel pan=new JPanel();
	Container con=null;
	private ButtonGroup bur=new ButtonGroup();
	public   void  setFont(Font font,Color bg){
		lable.setFont(font);
		lable.setBackground(bg);
	}
	public  void setPractice(String img){
		Icon ic=new ImageIcon(img);
		lable.setIcon(ic);
	}
	public Login(JLabel lable,JFrame frame){
		this.lable=lable;
		frame.add(lable);
	}
	public Login(){
		frame.setLocation(300,200);
		frame.setSize(600,600);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		userName.setBounds(100,125,60,30);
		userText.setBounds(180,125,120,30);
		passWord.setBounds(100,160,60,30);
		passText.setBounds(180,160,120,30);
		login.setBounds(120, 230, 80, 30);
		login2.setBounds(350, 230, 80, 30);
		reset.setBounds(220, 230,80, 30);
		frame.add(userName);
		frame.add(userText);
		frame.add(passWord);
		frame.add(passText);
		frame.add(login);
		frame.add(reset);
		frame.add(login2);
		frame.add(rad1);
		frame.add(rad2);
		bur.add(rad1);
		bur.add(rad2);
		Login l=new Login(la,frame);
		Font f=new Font("宋体",Font.BOLD, 40);
	    l.setFont(f,Color.blue);
	    l.setPractice("F://4.jpg");
	    frame.setVisible(true);
	    pan.add(rad1);
	    pan.add(rad2);
	    
	    
	    
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
				
			}
		});
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Login();
	    
	}

}
