
public class CalculateScore {
    float javaScore;
    float cScore;
    float dataBaseScore;
    void setJavaScore(float newJavaScore){
    	javaScore = newJavaScore;
    	System.out.println("Java的成绩："+newJavaScore);
    }
    float getJavaScore(){
    	return javaScore;
    }
    void setcScore(float cScore){
    	this.cScore = cScore;
    	System.out.println("c#的成绩"+cScore);
    }
    float getcScore(){
    	return cScore;
    }
   void setDataBaseScore(float dataBaseScore){
	   this.dataBaseScore=dataBaseScore;
    System.out.println("数据库的成绩："+dataBaseScore);
    }
    float getDatabaseScore(){
    	return dataBaseScore;
    }

	CalculateScore() {
	}
     
     CalculateScore(float a,float b,float c){
    	 a=getJavaScore();
    	 b=getcScore();
    	 c=getDatabaseScore();
     }
     
	public static void main(String[] args) {
		CalculateScore sc;
		sc = new CalculateScore(20, 30, 40);
		sc.setJavaScore(20);
		sc.setcScore(30);
		sc.setDataBaseScore(20);
		System.out.println("成绩之和为："
				+ (sc.getcScore() + sc.getJavaScore() + sc.getDatabaseScore()));
		System.out.println("平均成绩："
				+ (sc.getcScore() + sc.getJavaScore() + sc.getDatabaseScore())
				/ 3);

	}   
	}
    
   
