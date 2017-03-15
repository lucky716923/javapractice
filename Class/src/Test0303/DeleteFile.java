package Test0303;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File f=new File("e:/fileSecond.doc");
		if(f.exists()){
			f.delete();
			System.out.println("删除成功");
		}else{
			System.out.println("不存在此文件");
		}
	}

}
