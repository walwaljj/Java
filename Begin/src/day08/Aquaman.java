package day08;

public class Aquaman extends Human {
	
	double speed;
	
	//오버라이딩 할때 

	public Aquaman() {
		this("수중인간",160,789.12);
		
	}
	
	public Aquaman(String n, int h, double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	
	//getInfo()메소드를 오버라이드 하기
	
	public String getInfo() {
		
		String info ="이름 : "+name+"\n키 : "+height+"\nspeed : " + (double)speed;
		return info;
	}


	

}
