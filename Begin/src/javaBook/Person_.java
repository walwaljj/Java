package javaBook;

public class Person_ {
	
	String name="왈왈";
	int hight;
	int weight;
	
	public Person_() {
		showInfo();
	}
	
	public Person_(String name) {
		this.name=name;
	}
	public Person_(int weight) {
		hight=160;
		this.weight=weight;
	}
	public Person_(String name,int hight,int weight) {
		this.name=name;
		this.hight=hight;
		this.weight=weight;
		System.out.println(name+","+hight+","+weight);
	}
	
	public void showInfo() {
		System.out.println(this.name+this.hight+this.weight);
	}
	
}
