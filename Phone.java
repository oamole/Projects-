package service;

public class Phone{
	private String AreaCode;
	private String Exchange;
	private String Numbers;

	public Phone() {
		this.AreaCode = "999";
		this.Exchange = "999";
		this.Numbers = "9999";
	}

	public Phone(String new_areaCode, String new_exchange, String new_numbers) {
		this.setAreaCode(new_areaCode);
		this.setExchange(new_exchange);
		this.setNumbers(new_numbers);
		//this.areaCode = new_areaCode;
		//this.exchange = new_exchange;
		//this.numbers = new_numbers;
	}

	public String getAreaCode() {
		return this.AreaCode;
	}

	public void setAreaCode(String areaCode) {
		char ch = areaCode.charAt(0);
		int parse = Integer.parseInt(String.valueOf(ch));
		if(parse >= 2 && parse <= 9)
			this.AreaCode = areaCode;
		else
			System.out.println("Invalid area code\n");
	}

	public String getExchange() {
		return this.Exchange;
	}

	public void setExchange(String exchange) {
		char ch = exchange.charAt(0);
		int parse = Integer.parseInt(String.valueOf(ch));
		if(parse >= 2 && parse <= 9)
			this.Exchange = exchange;
		else
			System.out.println("Invalid exchange\n");
	}

	public String getNumbers() {
		return this.Numbers;
	}

	public void setNumbers(String numbers) {
		this.Numbers = numbers;
	}

	public String toString() {
		String str;
		str = "(" + this.AreaCode + ")" + this.Exchange + "-" + this.Numbers;
		return str;
	}
}
