package Test0215;

import java.util.Scanner;

public class PracticeMath {
	Scanner sc=new Scanner(System.in);
	public void printMath1(){
		System.out.println("������1~7֮�����");
		int a=sc.nextInt();
		switch(a){
		case 1:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ��ѧ��");
			break;
		case 2:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ���Ŀ�");
		    break;
		case 3:
			System.out.println(a+":"+"����ѡ�Ŀγ�ΪӢ���");
			break;
		case 4:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ�ߵȴ���");
		    break;
		case 5:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ��ѧ����");
			break;
		case 6:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ���Դ���");
		    break;
		case 7:
			System.out.println(a+":"+"����ѡ�Ŀγ�Ϊ�����");
			break;
		default:System.out.println("���������д�");
		}
	}
	
	public void printMath2(){
		int salary=3000;
		int target=500;
		System.out.println("����нˮΪ��"+salary);
		System.out.println("����Ŀ��Ϊ��"+target);
	    System.out.println("�������������۶");
	    int b=sc.nextInt();
		if(b>=target){
			System.out.println("����нˮΪ��"+salary*(1+0.3));
		}else{
			System.out.println("����нˮΪ��"+salary*(1-0.3));
		}
		}

	public void printMath3() {
			System.out.println("�����뼾�ڣ�");
			String c = sc.next();
			if (c.equals("����")) {
				System.out.println( "������ˮ����" + "ľ��" + " ���㽶" + " ӣ�ҷ��� "
						+ "����" + "���ٳ�");
			} else if (c.equals("�ļ�")) {
				System.out.println("�ļ���ˮ����" + "����" + "��" + " ���� " + "â��"
						+ "��");
			} else if (c.equals("�＾")) {
				System.out.println("�＾��ˮ����" + "�޻��� " + "ţ�̽� " + " ��ʯ�� "
						+ "���׹�" + "����");
			} else if (c.equals("����")) {
				System.out.println( "������ˮ����" + "���� " + "⨺��� " + " ��ʯ�� "
						+ "ƻ��" + "����");
			} else {
				System.out.println("�Բ������������д�");
			}
	}
	
	public void printMath4(){
		int a=95283;
		System.out.println("ÿ��λ�ϵ�����֮��Ϊ��"+(a%10)+"+"+(a/10%10)+"+"+
		(a/100%10)+"+"+(a/1000%10)+"+"+(a/10000)+"="+(a%10+a/10%10+a/100%10+a/1000%10+a/10000));
	}
	
	public void printMath5(){
		for(int i=1;i<7;i++){
			for(int j=1;j<i;j++)
			System.out.print("*"+"\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PracticeMath sa=new PracticeMath();
		sa.printMath1();
		sa.printMath2();
		sa.printMath3();
		sa.printMath4();
		sa.printMath5();
	}
}
