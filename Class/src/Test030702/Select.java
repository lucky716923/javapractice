package Test030702;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JOptionPane;


public class Select {
	public Select(){
		JFrame frame=new  JFrame ("下拉框");
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setLocation(100, 100);
		JComboBox<String> com=new JComboBox<String>();
		com.addItem("请选择城市");
		com.addItem("渭南");
		com.addItem("西安");
		com.addItem("韩城");
		com.setBounds(0, 0, 290, 30);
		frame.add(com);
		frame.setVisible(true);
		
		com.addItemListener(new My());
		com.addItemListener(new My());
		com.addItemListener(new My());
		com.addItemListener(new My());
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
		
			}
		}
		public static void main(String[] args) {
			new Select();
		}


}
