package Test0307;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ButtonTest {
	private JFrame frame=new JFrame("按钮页面");
	private JButton greenButton=new JButton("绿色按钮");
	private JButton redButton=new JButton("红色按钮");
	private JButton yellowButton=new JButton("黄色按钮");
	private JTextArea area=new JTextArea("我是一个小按钮");
	public   ButtonTest(){
		frame.setSize(400, 400);
		frame.setLocation(100, 100);
		frame.setLayout(new FlowLayout());
		frame.add(greenButton);
		frame.add(redButton);
		frame.add(yellowButton);
		frame.add(area);
		frame.setVisible(true);
		greenButton.addActionListener(new button());
		redButton.addActionListener(new button());
		yellowButton.addActionListener(new button());
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
	class button implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==greenButton){
				Font f=new Font("黑体",Font.BOLD,50);
				area.setFont(f);
				area.setForeground(Color.green);
			}
			if(e.getSource()==redButton){
				Font f=new Font("黑体",Font.BOLD,50);
				area.setFont(f);
				area.setForeground(Color.red);
			}
			if(e.getSource()==yellowButton){
				Font f=new Font("黑体",Font.BOLD,50);
				area.setFont(f);
				area.setForeground(Color.yellow);
			}
		}
		
	}
	public static void main(String[] args) {
		ButtonTest e=new ButtonTest();
		
	}

}
