package practice;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		Dog dog[] = new Dog[5];
		
		dog[0]=new Dog("강아지1","말티즈");
		dog[1]=new Dog("강아지2","비숑");
		dog[2]=new Dog("강아지3","시츄");
		dog[3]=new Dog("강아지4","시바");
		dog[4]=new Dog("강아지5","꼬똥");
		
		
		for(int i=0;i<dog.length;i++) {
			String a=dog[i].showDongInfo();
			System.out.println(a);
		}
		

	}

}
 class DogTestArrayList{
	 	 
	 
	 
	 public void DogArrayList(String[] args){
	ArrayList <Dog> arr = new ArrayList <Dog>();
	 
	 arr.add(new Dog ("강아지1","말티즈"));
	 arr.add(new Dog ("강아지2","비숑"));
	 arr.add(new Dog ("강아지3","시츄"));
	 arr.add(new Dog ("강아지4","시바"));
	 arr.add(new Dog ("강아지5","꼬똥"));
	 
	 for(int i = 0 ; i < arr.size(); i ++) {
	System.out.println(arr.get(i).showDongInfo());
	 }
	 
	 for(Dog a : arr) {
		 System.out.println(a.showDongInfo());
	 }
	 
	 }
	 
	
}