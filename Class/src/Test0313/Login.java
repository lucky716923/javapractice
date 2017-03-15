package Test0313;

import javax.swing.JFrame;
import javax.swing.JPanel;//���
import javax.swing.JButton;//��ť
import javax.swing.JLabel;//��ǩ
import javax.swing.JTextField;//�ı���

import java.awt.Font;//����
import java.awt.Color;//��ɫ

import javax.swing.JPasswordField;//�����

import java.awt.event.ActionListener;//�¼�����
import java.awt.event.ActionEvent;//�¼�����

import javax.swing.JOptionPane;//��Ϣ����

public class Login extends JFrame {
	public JPanel pnluser;
	public JLabel lbluserLogIn;
	public JLabel lbluserName;
	public JLabel lbluserPWD;
	public JTextField txtName;
	public JPasswordField pwdPwd;
	public JButton btnSub;
	public JButton btnReset;

	public Login() {
		pnluser = new JPanel();
		lbluserLogIn = new JLabel();
		lbluserName = new JLabel();
		lbluserPWD = new JLabel();
		txtName = new JTextField();
		pwdPwd = new JPasswordField();
		btnSub = new JButton();
		btnReset = new JButton();
		userInit();
	}

	public void userInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرտ�ܵ�ͬʱ��������
		this.setSize(300, 200);// ���ÿ�ܴ�СΪ��300,��200
		this.setResizable(false);// ���ÿ�ܲ����Ըı��С
		this.setTitle("�û���¼");// ���ÿ�ܱ���
		this.pnluser.setLayout(null);// ������岼�ֹ���
		this.pnluser.setBackground(Color.cyan);// ������屳����ɫ
		this.lbluserLogIn.setText("�û���¼");// ���ñ�ǩ����
		this.lbluserLogIn.setFont(new Font("����", Font.BOLD | Font.ITALIC, 14));// ���ñ�ǩ����
		this.lbluserLogIn.setForeground(Color.RED);// ���ñ�ǩ������ɫ
		this.lbluserName.setText("�û���:");
		this.lbluserPWD.setText("��    ��:");
		this.btnSub.setText("��¼");
		this.btnReset.setText("����");
		this.lbluserLogIn.setBounds(120, 15, 60, 20);// ���ñ�ǩx����120,y����15,��60,��20
		this.lbluserName.setBounds(50, 55, 60, 20);
		this.lbluserPWD.setBounds(50, 85, 60, 25);
		this.txtName.setBounds(110, 55, 120, 20);
		this.pwdPwd.setBounds(110, 85, 120, 20);
		this.btnSub.setBounds(85, 120, 60, 20);
		this.btnSub.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.btnReset.setBounds(155, 120, 60, 20);
		this.btnReset.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnreset_ActionEvent(e);
					}
				});
		this.pnluser.add(lbluserLogIn);// ���ر�ǩ�����
		this.pnluser.add(lbluserName);
		this.pnluser.add(lbluserPWD);
		this.pnluser.add(txtName);
		this.pnluser.add(pwdPwd);
		this.pnluser.add(btnSub);
		this.pnluser.add(btnReset);
		this.add(pnluser);// ������嵽���
		this.setVisible(true);// ���ÿ�ܿ���
	}

	public void btnsub_ActionEvent(ActionEvent e) {
		String name = txtName.getText();
		String pwd = String.valueOf(pwdPwd.getPassword());
		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "�˺Ų���Ϊ��", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else if (pwd.equals("")) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else if (true) {
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "�˺Ż��������", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
	}
	public void btnreset_ActionEvent(ActionEvent e) {
		txtName.setText("");
		pwdPwd.setText("");
	}

	public static void main(String[] args) {
		new Login();
	}
}