package Test0303;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File f=new File("e:/fileSecond.doc");
		if(f.exists()){
			f.delete();
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("�����ڴ��ļ�");
		}
	}

}
