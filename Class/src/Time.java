import java.util.Scanner;
public class Time {
	String year;
	String  month;
	String day;
	String hour;
	String minute;
	String second;
	private int getYear;
	void setYear(String newYear){
		year=newYear;
	}
	String getYear(){
		return year;
	}
	void setMonth(String newMonth){
		month=newMonth;
	}
	String getMonth(){
		return month;
	}
	void setDay(String newDay){
		day=newDay;
	}
	String getDay(){
		return day;
	}
	void setHour(String newHour){
		hour=newHour;
	}
	String getHour(){
		return  hour;
	}
	void setMinute(String newMinute){
		minute=newMinute;
	}
	String getMinute(){
		return minute;
	}
	void setSecond(String newSecond){
		second=newSecond;
	}
	String getSecond(){
		return second;
	}
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	Time s=new Time();
	System.out.println("��������");
	s.setYear(input.next());
	System.out.println("��������");
	s.setMonth(input.next());
	System.out.println("��������");
	s.setDay(input.next());
	System.out.println("������ʱ");
	s.setHour(input.next());
	System.out.println("�������");
	s.setMinute(input.next());
	System.out.println("��������");
	s.setSecond(input.next());
	System.out.println(s.getYear()+s.getMonth()+s.getDay()+s.getHour()+s.getMinute()+s.getSecond());
}
}
