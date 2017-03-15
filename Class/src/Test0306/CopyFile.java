package Test0306;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		String file1="e://java"+File.separator+"Test.java";
		String file2="f://Test.java";	
		if(copy(file1, file2)){
			System.out.println("复制成功");
		}else{
			System.out.println("复制失败");
		}
	}
	public static boolean  copy(String file1, String file2){
		File f1=new File(file1);
		File f2=new File(file2);
		if(!f1.exists()){
			System.out.println("文件不存在");
			return false;
		}
		OutputStream ou=null;
		InputStream in=null;
		try {
			ou=new FileOutputStream(f2);
			in=new FileInputStream(f1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ou!=null&&in!=null){
			int temp=0;
			try {
				while((temp=in.read())!=-1){
					ou.write(temp);	
				}
				in.close();
				in.close();
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	

}
