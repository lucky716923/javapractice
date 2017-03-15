package Concat;

public class Book {
	String name;
	String address;
	double price;
	long id;

	public Book() {
	}

	public Book(String name, String address, double price, long id) {
		this.name = name;
		this.address = address;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String toString() {
		return "name=" + name + "   address=" + address + "   price=" + price
				+ "  id" + id;
	}
}
