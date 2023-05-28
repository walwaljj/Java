package practice;
import java.util.*;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<StudenArray_Students> arr= new ArrayList<StudenArray_Students>();
		
		int a=1001;
		
		arr.add(new StudenArray_Students(a++,"James"));
		arr.add(new StudenArray_Students(a++,"Tomas"));
		arr.add(new StudenArray_Students(a++,"Edward"));
		
		for(int i=0;i<arr.size();i++) {
			a++;
			StudenArray_Students arrpl = arr.get(i);
			arrpl.showStudentInfo();
		}
		
		System.out.println("확장 for roof"); 
		
		for(StudenArray_Students arrpl : arr) {
			arrpl.showStudentInfo();
		}

	}

}
