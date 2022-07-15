package day10;
import java.util.*;
//java.util.List 계열 => list []
public class VectorTest2 {

	public static void main(String[] args) {
		//[1]Student 객체 3개생성
		Student s1=new Student(1,"난이제");
		Student s2=new Student(2,"지쳤어요");
		Student s3=new Student(3,"땡벌");
		
		//[2]저장할 vector생성
		Vector<Student> v=new Vector<>(5,3);//초기영역은 마음대로줘도댐
											//하지만 2,1로 구성한다면 저장할 내용이 늘어날때마다 배열을 새로구성, 메모리 낭비가 심함..
		
		//[3]벡터에 학생객체 3개 저장
	
		v.add(s1);
		v.add(s2);
		v.add(s3);
		System.out.println("v.size()"+v.size());
		//[4]반복문이용해서 출력
		
		for(Student a : v) {
			System.out.println("학번 : "+a.getId()+", 이름 :" +a.getName());
		}
		
		
		for(int i=0;i<v.size();i++) {
			//System.out.println(v.get());//a.toString() 주소출력==object을 상속받고있기때문?
		//System.out.println("학번 : "+v.get(i)+", 이름 :" +v.getName());
		}//정보를 얻을수 있는 getter로 접근해야한다.
			
		
	
		
	//	public Iterator<E> iterator();
		/*Enumeration<E> elements()
		 * 			  ㄴ타입쓰면됨/ 
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		Enumeration<Student> en=v.elements();
		
		while(en.hasMoreElements()) {
			Student e= en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}System.out.println("***********");
		/////////////////////////////////////////////////////////////////////
		while(en.hasMoreElements()) {
			Student e= en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}////===>출력이안되는 이유는 논리적 커서가 이미 마지막을 가리켰기때문에/////
		
		System.out.println("++++++++++++문제+++++++++++++");
		//public Iterator<E> iterator()
		//iterator()메서드를 이용해서 v에 저장된 이름을 모두 출력하기.
		Iterator<Student> it = v.iterator();
		while(it.hasNext()) {
			Student i=it.next();
			System.out.println(i.getName()+": "+i.getId());
		}
		//clear(), removeAll() : 모든 요소를 삭제한다.
		System.out.println("+++백터 내용 모두삭제(v.clear())+++++");
		v.clear();
		//v의 내용이 사라져서 값이 나오지않음
		it=v.iterator();
		for(;it.hasNext();) {
			Student i=it.next();
			System.out.println(i.getName());
		}
		

	}

}/////////////////////////////////////
