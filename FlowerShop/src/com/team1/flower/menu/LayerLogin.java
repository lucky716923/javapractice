package com.team1.flower.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LayerLogin extends LayerDemo{
	//������ǩ
	private JLabel lbTop = new JLabel();
	//��߱�ǩ
	private JLabel lbCLeft = new JLabel();
	//������
	private JComboBox<String> txId = new JComboBox<String>();
	//�����
	private JPasswordField  txPwd = new JPasswordField();
	//��ѡ��
	private JCheckBox cbJZMM = new JCheckBox("��ס����");
	//��¼��ť
	private JButton btnLogin = new JButton("��¼");
	//ע�ᰴť
	private JButton btnSign = new JButton("ע���˺�");
	
	public LayerLogin(){
		//����JFrame�ı���
		this.setTitle("���϶���ϵͳ��¼");
		//��������ǩ����ͼƬ
		lbTop.setIcon(new ImageIcon("img/bg1.png"));
		
		lbTop.setPreferredSize(new Dimension(485,195));
		this.getCon().add("North",lbTop);
		
		JPanel pCenter = new JPanel();
		pCenter.setPreferredSize(new Dimension(485,95));
		pCenter.setBackground(Color.white);
		
		lbCLeft.setIcon(new ImageIcon("img/boy.jpg"));
		pCenter.setAlignmentY(5);
		
		pCenter.add(lbCLeft);
		
		JPanel pCCenter = new JPanel();
		pCCenter.setLayout(new GridLayout(3,2,20,10));
		pCCenter.setAlignmentY(5);
		
		pCCenter.setBackground(Color.white);
		
		txId.setEditable(true);
		txId.setBackground(Color.white);
		pCCenter.add(txId);
		pCCenter.add(btnSign);
		
		
		pCCenter.add(txPwd);
		
		pCCenter.add(cbJZMM);
		cbJZMM.setBackground(Color.white);
		
		pCenter.add(pCCenter);
		
		this.getCon().add("Center", pCenter);
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.white);
		bottom.add(btnLogin);
		this.getCon().add("South",bottom);
		initPanel();
		
		// ��¼����
//		btnLogin.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				String curId = (String) txId.getSelectedItem();
//				char[] pwdArray = txPwd.getPassword();
//				String curPwd = String.valueOf(pwdArray);
//				if (curId != null && !curId.equals("")){
//					if(!curPwd.equals("")){
//						
//					}else{
//						JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
//					}
//				}else{
//					JOptionPane.showMessageDialog(null, "id����Ϊ��");
//				}
//			}
//
//			
//		});
//		
//		btnSign.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			}
//			
//		});
	}
	public static void main(String[] args) {
		new LayerLogin();
	}

}
