package Test0307;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Select {
//	private JLabel lab1=new  JLabel();
//	private  JLabel lab2=new  JLabel("μ��");
//	private  JLabel lab3=new  JLabel("����");
//	private  JLabel lab4=new  JLabel("����");
	private JFrame frame=new  JFrame ("������");
	private JComboBox  com=new JComboBox();
	private JPanel p=new JPanel();
	private Container con=null;
//	private JLabel la=new JLabel();
	public Select(){
		frame.setSize(300, 300);
		frame.setLocation(100, 100);
//		frame.setLayout(new BorderLayout());
		com.addItem("��ѡ�����");
		com.addItem("μ��");
		com.addItem("����");
		com.addItem("����");
		con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p,BorderLayout.NORTH);
		frame.setVisible(true);
		
		com.addItemListener(new My());
		com.addItemListener(new My());
		com.addItemListener(new My());
		com.addItemListener(new My());
		frame.addWindowListener(new WindowAdapter() {
//			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "ϵͳ�ر�", "����", 2);
				System.exit(0);
				
			}
		});
	}
	
	private class My implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
		
			}
		}
		


}
