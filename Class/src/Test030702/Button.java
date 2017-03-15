package Test030702;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Button {
	JFrame frame=new JFrame();
	JButton jb1=new JButton("我是哈哈");
	JButton jb2=new JButton("我是嘿嘿");
	JButton jb3=new JButton("我是呵呵");
	JButton jb4=new JButton("我是嘻嘻");
	
	public Button(){
		frame.setSize(200,200);
		frame.setLayout(new FlowLayout());
		frame.setLocation(100,100);
		frame.add(jb1);
		frame.add(jb2);
		frame.add(jb3);
		frame.add(jb4);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1.addMouseListener(new Act());
		jb2.addMouseListener(new Act());
		jb3.addMouseListener(new Act());
		jb4.addMouseListener(new Act());
		frame.addMouseMotionListener(new mylis());
		
		frame.addWindowListener(new WindowAdapter() {
//			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
				
			}
		});
	}
	private class Act implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
//			 TODO Auto-generated method stub
			if(e.getSource()==jb1){
				System.out.println(jb1.getText()+"的横坐标为:"+jb1.getX()+
						"\n"+jb1.getText()+"的纵坐标为:"+jb1.getY());
			}
			if(e.getSource()==jb2){
				System.out.println(jb2.getText()+"的横坐标为:"+jb2.getX()+
						"\n"+jb2.getText()+"的纵坐标为:"+jb2.getY());
			}
			if(e.getSource()==jb3){
				System.out.println(jb3.getText()+"的横坐标为:"+jb3.getX()+
						"\n"+jb3.getText()+"的纵坐标为:"+jb3.getY());
			}
			if(e.getSource()==jb4){
				System.out.println(jb4.getText()+"的横坐标为:"+jb4.getX()+
						"\n"+jb4.getText()+"的纵坐标为:"+jb4.getY());
			}
			else{
				System.out.println(e.getX()+" "+e.getY());
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class mylis implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("当前鼠标坐标 ："+e.getX()+","+e.getY());
		}
		
	}
	public static void main(String[] args) {
		new Button();
	}
}
