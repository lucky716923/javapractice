package List;

public class Store <E>{
	private E[] room;//�洢E�������͵�����
	private int quantity;
	private int index ;

	public E[] getRoom() {
		return room;
	}

	public void setRoom(E[] room) {
		this.room = room;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void save(E e){
		if(index>=quantity){
			System.out.println("�ֿ�����");
			return;
		}
		room[index]=e;
		index++;
	}
	//��ӡ������Ķ���
	public void veiw(){
		for(E e:room){
			System.out.println(e);
		}
	}

}
