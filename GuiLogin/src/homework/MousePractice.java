package homework;

import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MousePractice {
	private JLabel la1=new JLabel();
	private JLabel la2=new JLabel();
	private JFrame frame=new JFrame();
	public MousePractice(){
		frame.add(la1);
		frame.add(la2); 
		frame.setLayout(new FlowLayout(0));
		frame.setSize(300, 200);
		frame.setLocation(200,200);
		frame.setResizable(false);
		frame.setVisible(true);
		Timer time=new Timer();
		time.schedule(new TimerTask(){
			public void run(){
				Point p=MouseInfo.getPointerInfo().getLocation();
				la1.setText("X的坐标："+p.getX());
				la2.setText("的坐标："+p.getY());
			}
		}, 100, 100);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
				
			}
		});
		
	}
	  public static void main(String[] args) {
		new  MousePractice();
	}

}
