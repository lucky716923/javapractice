package Test030702;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class radioBox {
	private JFrame frame=new JFrame("单选系统");
	private JRadioButton jrd1=new JRadioButton("A、4");
	private JRadioButton jrd2=new JRadioButton("B、3");
	private JRadioButton jrd3=new JRadioButton("C、2");
	private JRadioButton jrd4=new JRadioButton("D、0");
	private JPanel p=new JPanel();
	private Container  con=null;
	private JLabel label=new JLabel();
	private ButtonGroup group=new ButtonGroup();
	public radioBox(){
		frame.setSize(400,400);
		frame.setLocation(200,200);
		
		group.add(jrd1);
		group.add(jrd2);
		group.add(jrd3);
		group.add(jrd4);

		p.add(jrd1);
		p.add(jrd2);
		p.add(jrd3);
		p.add(jrd4);
		p.setVisible(true);
		con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		p.setBorder(BorderFactory.createTitledBorder("1+1=？"));
		p.setLayout(new GridLayout(4, 1));
		con.add(label,BorderLayout.SOUTH);
		con.add(p,BorderLayout.NORTH);
		jrd1.addItemListener(new My());
		jrd2.addItemListener(new My());
		jrd3.addItemListener(new My());
		jrd4.addItemListener(new My());
		
		frame.addWindowListener(new WindowAdapter() {
//			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null, "系统关闭", "警告", 2);
				System.exit(0);
				
			}
		});
		frame.setVisible(true);
	}
	private class My implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getItem().equals(jrd1)||e.getItem().equals(jrd2)||e.getItem().equals(jrd4)){
				label.setText("错误的");
			}else{
				label.setText("恭喜您，选对了");
			}
		}
		
	}

	public static void main(String[] args) {
		new radioBox();
	}

}
