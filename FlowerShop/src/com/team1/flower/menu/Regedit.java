package com.team1.flower.menu;

//�û���  ����  ��ͥ��ַ  �ֻ���
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Regedit {
	private JFrame frame;
	GridLayout grid;
	JButton button1 = new JButton("ע��");
	JButton button2 = new JButton("����");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JTextField text4 = new JTextField();
	JPanel pa;
	public Regedit() {
		frame = new JFrame("ע��ҳ��");
		frame.setSize(800, 800);
		frame.setLocation(100, 100);
		frame.setLayout(null);
		pa.setLayout(grid);
		pa.setSize(400,400);
		JLabel lable1 = new JLabel("�û�   ����");
		pa.add(lable1);
		text1.setPreferredSize(new Dimension(100, 20));
		pa.add(text1);
		JLabel lable2 = new JLabel("��      �룺");
		pa.add(lable2);
		text2.setPreferredSize(new Dimension(100, 20));
		pa.add(text2);
		JLabel lable3 = new JLabel("��ͥ��ַ��");
		pa.add(lable3);
		text3.setPreferredSize(new Dimension(100, 20));
		pa.add(text3);
		JLabel lable4 = new JLabel("�ֻ�   �ţ�");
		pa.add(lable4);
		text4.setPreferredSize(new Dimension(100, 20));
		pa.add(text4);
		grid.setVgap(40);
		grid.setHgap(70);
		frame.setVisible(true);
		frame.setResizable(false);
		pa.add(button1);
		pa.add(button2);
		pa.setVisible(true);
		button1.addActionListener(new My());
		button2.addActionListener(new My());
		ImageIcon ico = new ImageIcon("src/4.ipg");
		JLabel lable5 = new JLabel(ico);
		frame.add(lable5);
		frame.add(pa);
	}

	class My implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				JOptionPane.showMessageDialog(null, "ע��ɹ�");
			} else {
				text1.setText("");
				text2.setText("");
				text3.setText("");
				text4.setText("");
			}

		}

	}

	public static void main(String[] args) {
		new Regedit();
	}
}