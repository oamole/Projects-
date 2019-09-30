package serviceB;
import service.Phone;

public class BusinessPhone extends Phone{
	private String extension;

	public BusinessPhone() {
super();
		this.extension = "1234";

	}

	public BusinessPhone(String new_areaCode, String new_exchange, String new_numbers, String new_extension) {
		super(new_areaCode, new_exchange, new_numbers);

		this.extension = new_extension;
	}

	public BusinessPhone(Phone p, String new_extension) {
		super(p.getAreaCode(), p.getExchange(), p.getNumbers());
		this.extension = new_extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
			this.extension = extension;
	}

	public String toString() {
		String str;
		str = super.toString() + " " + this.extension;
		return str;
	}
}
