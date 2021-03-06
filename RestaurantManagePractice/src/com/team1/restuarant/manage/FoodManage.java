package com.team1.restuarant.manage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.team1.restuarant.po.Food;
import com.team1.restuarant.po.Order;

public class FoodManage {
	Food[] food = new Food[100];
	Scanner ad = new Scanner(System.in);

	public Food[] getFood() {
		return food;
	}

	public void setFood(Food[] food) {
		this.food = food;
	}

	// 初始化食物   （定义一个数组food）
	public void initFoodInfo() {
		Food food1 = new Food();
		food1.foodName = "砂锅米线";
		food1.foodPrice = 8;
		food1.foodSize = "普通";
		food[0] = food1;

		Food food2 = new Food();
		food2.foodName = "砂锅宽粉";
		food2.foodPrice = 8;
		food2.foodSize = "普通";
		food[1] = food2;

		Food food3 = new Food();
		food3.foodName = "砂锅龙须面";
		food3.foodPrice = 8;
		food3.foodSize = "普通";
		food[2] = food3;

		Food food4 = new Food();
		food4.foodName = "牛肉面";
		food4.foodPrice = 10;
		food4.foodSize = "大份";
		food[3] = food4;

		Food food5 = new Food();
		food5.foodName = "牛肉面1";
		food5.foodPrice =    9;
		food5.foodSize = "小份";
		food[4] = food5;

		Food food6 = new Food();
		food6.foodName = "油泼面1";
		food6.foodPrice = 9;
		food6.foodSize = "小份";
		food[5] = food6;

		Food food7 = new Food();
		food7.foodName = "油泼面2";
		food7.foodPrice = 10;
		food7.foodSize = "大份";
		food[6] = food7;

		Food food8 = new Food();
		food8.foodName = "臊子汤面1";
		food8.foodPrice = 9;
		food8.foodSize = "小份";
		food[7] = food8;

		Food food9 = new Food();
		food9.foodName = "臊子汤面2";
		food9.foodPrice = 9;
		food9.foodSize = "大份";
		food[8] = food9;
	}

	// 打印菜单    
	//	想要输出序号必须定义一个变量，让其自加（注意的是删除的那一项其序号不自加，所以自加必须放到其后）
	public void printFoodList() {
		System.out.println(" 菜单\n 菜名 \t\t \t价格\t ");
		int a=0;
		for (int i = 0; i < food.length; i++) {
			Food foodlist = food[i];
			if (foodlist == null) {
				break;
			}
			if (foodlist.isDelete == false) {
				continue;
			}
			a++;
			System.out.println(a + "." + foodlist.foodName + "\t\t\t"
					+ foodlist.foodPrice + "\t\t   " + foodlist.foodSize );
		}
	}

	// 增加食物
	//定义一个food的数组food1 将增加的食物放在其内，因为增加是在food的基础上增加的，所以最后将food1放在
	//	food中（注意其是从food为空时开始接收food1里的值）
	
	public void addFood() {
		System.out.println("添加食物        \n请输入食物名称：         例如：油泼面");
		String foodName = ad.next();
		System.out.println("请输入食物价格：          例如：7");
		int foodPrice = ad.nextInt();
		System.out.println("请输入食物规格：          例如： 大碗  ");
		String foodSize = ad.next();
		Food food1 = new Food();
		food1.foodName = foodName;
		food1.foodPrice = foodPrice;
		food1.foodSize = foodSize;
		food1.isDelete = true;
		food1.payStatus = true;
		for (int i = 0; i < food.length; i++) {
			if (food[i] == null) {
				food[i] = food1;
				break;
			}
		}
	}

	// 删除食物   
	//	定义一个food2的数组，将food数组中的值赋给food2，想要删除一个菜必须使其是已删除的状态，删
	//	除是在food的基础上删除的所以在打印菜单时如果其是已删除的就不让其打印
	public void deleteFood() {
		System.out.println("请输入您所要删除的菜名");
		String deleteFoodName = ad.next();
		for (int i = 0; i < food.length; i++) {
			Food food2 = food[i];
			if (food2 == null) {
				break;
			}
			if (deleteFoodName.equals(food2.foodName)) {
				food2.isDelete = false;
			}
		}
	}
	
		//	得到真实的索引
	private int getRealIndex(int choose) {
		int a = 0;
		for (int i = 0; i < food.length; i++) {
			Food foodlist = food[i];
			if (foodlist == null) {
				break;
			}
			if (foodlist.isDelete == false) {
				continue;
			}
			a++;
			if (a == choose){
				return i;
			}
		}
		return -1;
	}
	
		//选餐 
	public void chooseFood(Order order){
		SimpleDateFormat currentTime=new SimpleDateFormat("yyyy-MM-dd   HH:MM:SS");
		System.out.println("请输入你所需要的序号     输入0结束");
		int sum = 0;
		String describe = "";
		while (true) {
				int choose = ad.nextInt();
				if(choose == 0){
					break;
				}else if (choose >0 && choose <= food.length){
					int index = getRealIndex(choose);  //真实索引
					if (index >=0) {
						Food f = food[index];
						System.out.println(food[index]);
						describe += f.toString() + "\n";
						sum+=food[index].foodPrice;
					}
				}else {
					System.out.println("您的输入有错");
				}
		}
		String time = currentTime.format(new Date());
		describe = describe + "您本次一共消费了"+sum +"元\n" + time;
		order.setFoodDescribe(describe);
		order.setOrderSum(sum);
		order.setOrderTime(time);
	}


	public static void main(String[] args) {
		FoodManage sc = new FoodManage();
		Order order = new Order();
		sc.initFoodInfo();
		sc.printFoodList();
		sc.addFood();
		sc.printFoodList();
		sc.deleteFood();
		sc.printFoodList();
		sc.chooseFood(order);
		System.out.println(order.getFoodDescribe());
	}

}
