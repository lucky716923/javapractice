package Test0303;

import java.io.*;
import java.util.*;

//把属性保存在文件夹中并从属性文件加载信息
public class Demo {
	public static Properties pro=new Properties();
//	设置属性
	public static void  setProperties(){
		pro.setProperty("京", "北京");
		pro.setProperty("湘", "湖南");
		pro.setProperty("陕", "陕西");
	}

//分别输出属性值
	public static void getInfo(){
		Set<Object> keys=pro.keySet();
		Iterator<Object> it=keys.iterator();
		Object obj=null;
		while(it.hasNext()){
			obj=it.next();
			System.out.println(obj+""+pro.getProperty((String)obj));
		}
	}
//	把属性信息保存在文件中
	public static void saveFile(String fileName){
		System.out.println("\n开始保存属性文件");
		File f=new File(fileName);
//		保存属性信息
		try {
			pro.store(new FileOutputStream(f), "简称");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	从文件读取信息
	public static void readFile(String fileName){
		System.out.println("\n开始读取文件");
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
