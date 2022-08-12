package test12_1;



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
	@Override
    public boolean equals(Object obj) {
    	
    	Student std = (Student)obj;
        if(this.num == std.num) {
        	return true;
        }else {
        return false;
        }
    }
	
	@Override
	public String toString() {
		String str = name+ " : " + num  ;
			return str;
	}
}
