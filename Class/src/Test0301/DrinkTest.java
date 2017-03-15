package Test0301;

public class DrinkTest {
	public static int num;
	public static void dink() throws PersonalException{
		if(num>=80){
			throw new PersonalException("您正在醉驾请配合我们");
		}else if(num>=20){
			throw new PersonalException("您正在酒驾请配合我们");
		}else{
			throw new PersonalException("谢谢您配合我们的工作，祝您一路顺风");
		}
	}
	public static void main(String[] args) {
		DrinkTest.num=13;
		try{
			dink();
		}catch(PersonalException e){
			e.printStackTrace();
		}
	}

}
