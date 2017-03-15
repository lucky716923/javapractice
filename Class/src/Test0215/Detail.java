package Test0215;

public class Detail {
	private String name;
	private String numberPhone;
	private String idCard;

	public Detail() {
	}

	public Detail(String name, String numberPhone, String idCard) {
		this.name = name;
		this.numberPhone = numberPhone;
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String toString() {
		return "name=" + name + "   numberPhone=" + numberPhone + "   idCard="
				+ idCard;
	}

}
