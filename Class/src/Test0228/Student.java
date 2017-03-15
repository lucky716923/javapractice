package Test0228;
//3. 编写学生类，重写equals方法，通过学生的属性值来判断学生对象是否相同。
//4. 编写学生类，重写学生类的toString方法返回学生的基本信息和  equals方法通过学生的信息比较学生是否相同。
//  创建学生对象数组，将创建的学生对象存放在学生数组中。
//  存放学生对象的判断学生数组是否已存在，如果存在不进行存储，  如果不存在可以存储。最后将数组中所有学生对象打印。

public class Student {
	private String name;
	private int stuId;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stuId != other.stuId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "姓名："+"\t"+"学号：";
	}
	
	

}
