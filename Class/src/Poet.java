public class Poet {
    String authorName;
    String dynasty;
    String sex;
    String poemName;
    
    void setAuthorName(String authorName){
    	this.authorName = authorName;
    }
    
    String getAuthorName(){
    	return authorName;
    }
    
    void setSex(String sex){
    	this.sex=sex;
    }
    
    String getSex(){
    	return sex;
    }
    
    Poet(){}
    
    public static void main(String[] args){
    	Poet a=new Poet();
    	a.setAuthorName("Àî°×");	
    	System.out.println(a.getAuthorName());
    	a.setSex("ÄÐ");
    	System.out.println(a.getSex());		
    }
    
}
