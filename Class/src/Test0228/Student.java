package Test0228;
//3. ��дѧ���࣬��дequals������ͨ��ѧ��������ֵ���ж�ѧ�������Ƿ���ͬ��
//4. ��дѧ���࣬��дѧ�����toString��������ѧ���Ļ�����Ϣ��  equals����ͨ��ѧ������Ϣ�Ƚ�ѧ���Ƿ���ͬ��
//  ����ѧ���������飬��������ѧ����������ѧ�������С�
//  ���ѧ��������ж�ѧ�������Ƿ��Ѵ��ڣ�������ڲ����д洢��  ��������ڿ��Դ洢���������������ѧ�������ӡ��

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
		return "������"+"\t"+"ѧ�ţ�";
	}
	
	

}
