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
	System.out.print("输出礼品名称：");
	s.setName("书包");
	System.out.println(s.getName());
	System.out.print("输出礼品类型：");
	s.setType("手提背包");
	System.out.println(s.getType());
}
}
