package com.team1.flower.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class LayerDemo extends JFrame{
	private Container con = this.getContentPane();
	
	public LayerDemo(){
		con.setBackground(Color.white);
		con.setLayout(new BorderLayout(0, 10));
		
	}
	
	public void initPanel(){
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public Container getCon() {
		return con;
	}

	public void setCon(Container con) {
		this.con = con;
	}
	
	
}
