package Test0301;

public class DrinkTest {
	public static int num;
	public static void dink() throws PersonalException{
		if(num>=80){
			throw new PersonalException("������������������");
		}else if(num>=20){
			throw new PersonalException("�����ھƼ����������");
		}else{
			throw new PersonalException("лл��������ǵĹ�����ף��һ·˳��");
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
