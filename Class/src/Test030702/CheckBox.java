package Test030702;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class CheckBox {
	private JCheckBox lab1=new  JCheckBox("请选择城市");
	private  JCheckBox lab2=new  JCheckBox("渭南");
	private  JCheckBox lab3=new  JCheckBox("西安");
	private  JCheckBox lab4=new  JCheckBox("韩城");
	private JFrame frame=new  JFrame ("多选框");
	private JPanel p=new JPanel();
	private Container con=null;
	private JLabel la=new JLabel();
	public CheckBox(){
		frame.setSize(300, 300);
		frame.setLocation(100, 100);
//		frame.setLayout(new BorderLayout());
		p.add(lab1);
		p.add(lab2);
		p.add(lab3);
		p.add(lab4);
		con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p,BorderLayout.NORTH);
		con.add(la,BorderLayout.SOUTH);
		frame.setVisible(true);
		
		lab1.addItemListener(new My());
		lab2.addItemListener(new My());
		lab3.addItemListener(new My());
		lab4.addItemListener(new My());
		frame.addWindowListener(new WindowAdapter() {
//			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
				
			}
		});
	}
	
	private class My implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getItem()==lab1||e.getItem()==lab2||e.getItem()==lab3||
					e.getItem()==lab4){
				la.setText("您已选择");
			}
		}
		
	}

	public static void main(String[] args) {
		new CheckBox();
	}
}
