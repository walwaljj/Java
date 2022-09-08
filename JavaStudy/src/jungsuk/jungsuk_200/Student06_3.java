package jungsuk.jungsuk_200;

public class Student06_3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	float avg;
	int total;
	Student06_3(){
		setTotal(this.math,this.eng,this.kor);
		setAverage(this.math,this.eng,this.kor);
	}
	
	public void setTotal(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = (kor+eng+math);
		
	}
	public void setAverage(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		avg = (kor+eng+math)/3;
		
	}
	
	public int getTotal() {
		
		return kor+eng+math;
	}
	
	public float getAverage() {
		
		return (kor+eng+math)/3;
	}
	public String info() {
		return this.name+","+this.ban+","+this.eng;
	}
}
