package Test0303;

import java.io.File;

public class AddFileMk {
	public static void main(String[] args) {
		String first="e:"+File.separator+"java3-7";
		File f=new File(first);
		if(f.exists()){
			f.delete();
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("�ļ�������");
			f.mkdir();
			System.out.println("file creat success");
		}
	}

}
