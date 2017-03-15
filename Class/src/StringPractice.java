
public class StringPractice {
	public static void main(String[] args) {
		String a="abcdefg";
 	    System.out.println(a.charAt(4));//索引找对应的数据
		System.out.println(a.concat("huanying"));//连接两个字符串
		System.out.println(a.equals("abfg"));//判断两个字符是否相等
		System.out.println(a.toUpperCase());//小写变成大写
		System.out.println(a.toLowerCase());//大写变成小写
		System.out.println(a.compareTo("gh"));
		System.out.println(a.substring(2));//截取字符串
		System.out.println(a.substring(2, 4));
		System.out.println(a.endsWith("g"));
		
	}

}
