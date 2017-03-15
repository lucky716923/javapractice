public class SetGet {
String user;
String pwd;
void setUser(String newUser){
	user=newUser;
}
String getUser(){
	return user;
}
void setPwd(String newPwd){
	pwd=newPwd;
}
String getPwd(){
	return pwd;
} 
public static void main(String[] args){
 SetGet s=new SetGet();
 s.setUser("ÀèÃ÷");
 System.out.println(s.getUser());
	System.out.println();
	s.setPwd("lq123");
	System.out.println(s.getPwd());
}
}
