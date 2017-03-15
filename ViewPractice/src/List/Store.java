package List;

public class Store <E>{
	private E[] room;//存储E数据类型的数组
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
			System.out.println("仓库已满");
			return;
		}
		room[index]=e;
		index++;
	}
	//打印泛型里的东西
	public void veiw(){
		for(E e:room){
			System.out.println(e);
		}
	}

}
