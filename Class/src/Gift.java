public class Gift {
String name;
String type;
void setName(String newName){
	name=newName;
}
String getName(){
	return name;
}
void setType(String newType){
	type=newType;
}
String getType(){
	return type;
}
public static void main(String[] args){
	Gift s=new Gift();
	System.out.print("�����Ʒ���ƣ�");
	s.setName("���");
	System.out.println(s.getName());
	System.out.print("�����Ʒ���ͣ�");
	s.setType("���ᱳ��");
	System.out.println(s.getType());
}
}
