package com.model;

public class Test {
	public static void main(String[] args) {
		Login sc=new Login();
		sc.login();
		FoodList fl=new FoodList();
		Food[] f=fl.showFoodList();
		fl.choosefood(f);
	}

}
