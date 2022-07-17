package practice;

public class StudenArray {

	public static void main(String[] args) {
		
		StudenArray_Students [] ss = new StudenArray_Students [3];
		
		int num=1001;
		
		ss[0] = new StudenArray_Students(num++,"James");
		ss[1] = new StudenArray_Students(num++,"Tomas");
		ss[2] = new StudenArray_Students(num++,"Edward");
		
		
		for(int i=0;i<ss.length;i++) {
			ss[i].showStudentInfo();
			System.out.println();
		}

	}

}
