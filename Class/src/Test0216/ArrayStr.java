package Test0216;

import java.util.Arrays;

//9����������String���͵����飬a,b��
//��a�еĵ�һ��Ԫ�ظ�ֵ��b�����У�
//�ӵڶ�������ĵڶ���λ���п�ʼ����ֵ����Ԫ��
public class ArrayStr {
	public static void main(String[] args) {
		String[] a={"ƻ��","�㽶","��","â��"};
		String[] b=new String[]{"hehe","sd","dfg","dgfe","rer","haha"};
		 b[2]=a[0];
		 for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 b[1]="˯��";
		 b[2]="�Ͽ�";
		 for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 
	}  
}
