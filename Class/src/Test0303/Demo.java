package Test0303;

import java.io.*;
import java.util.*;

//�����Ա������ļ����в��������ļ�������Ϣ
public class Demo {
	public static Properties pro=new Properties();
//	��������
	public static void  setProperties(){
		pro.setProperty("��", "����");
		pro.setProperty("��", "����");
		pro.setProperty("��", "����");
	}

//�ֱ��������ֵ
	public static void getInfo(){
		Set<Object> keys=pro.keySet();
		Iterator<Object> it=keys.iterator();
		Object obj=null;
		while(it.hasNext()){
			obj=it.next();
			System.out.println(obj+""+pro.getProperty((String)obj));
		}
	}
//	��������Ϣ�������ļ���
	public static void saveFile(String fileName){
		System.out.println("\n��ʼ���������ļ�");
		File f=new File(fileName);
//		����������Ϣ
		try {
			pro.store(new FileOutputStream(f), "���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	���ļ���ȡ��Ϣ
	public static void readFile(String fileName){
		System.out.println("\n��ʼ��ȡ�ļ�");
		File f2=new File(fileName);
		try {
			pro.load(new FileInputStream(f2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		setProperties();
		saveFile("f:/java3-7/project.txt");
		readFile("f:/java3-7/project.txt");
		getInfo();
	}
}
