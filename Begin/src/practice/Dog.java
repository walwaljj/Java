package practice;

public class Dog {
	private String name;
	private String type;
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public String showDongInfo() {
		return name + "," + type;
	}

}
