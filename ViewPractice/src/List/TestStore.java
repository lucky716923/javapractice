package List;

public class TestStore {
	public static void main(String[] args) {
		Book[] bookRoom=new Book[2];
		
		Computor[] computorRoom=new Computor[]{
				new Computor("Lenvon",4000),
				new Computor("´÷¶û",5000)
				};
		
		Store<Book> bookStore=new Store<Book>();
		bookStore.setRoom(bookRoom);
		Book book1 = new Book("java",60);
		Book book2 = new Book("c",34);
		bookStore.setQuantity(bookRoom.length);
		bookStore.save(book1);
		bookStore.save(book2);
		bookStore.veiw();
		bookStore.save(book2);
		
		
		
		
//		System.out.println("*************************************");
//		Store<Computor> computorStore=new Store<Computor>();
//		computorStore.setRoom(computorRoom);
//		computorStore.setQuantity(2);
//		computorStore.veiw();
	}

}
