
public class StringPractice {
	public static void main(String[] args) {
		String a="abcdefg";
 	    System.out.println(a.charAt(4));//�����Ҷ�Ӧ������
		System.out.println(a.concat("huanying"));//���������ַ���
		System.out.println(a.equals("abfg"));//�ж������ַ��Ƿ����
		System.out.println(a.toUpperCase());//Сд��ɴ�д
		System.out.println(a.toLowerCase());//��д���Сд
		System.out.println(a.compareTo("gh"));
		System.out.println(a.substring(2));//��ȡ�ַ���
		System.out.println(a.substring(2, 4));
		System.out.println(a.endsWith("g"));
		
	}

}
