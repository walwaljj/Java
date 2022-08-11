package test12_1;
import java.util.*;


public class Student {

	
	String name;
	String num;
	
	public Student(String name,String num) {
		this.name=name;
		this.num=num;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(num);
	}
    public boolean equals(Object obj) {
    	
    	Student std = (Student)obj;
        if(this.num == obj);
        return ture;
    }
	public String toString() {
		String str = this.name+ " : " + this.num  ;
			return str;
	}
}
