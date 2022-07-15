package day10;
import java.util.*;
import javax.swing.JButton;

/*java Collection Framework
 *    -Collection : 객체를 수집해서 저장하는 역할
 *    -Framework  : 사용방법을 미리 정해놓은 라이브러리를 의미
 *    -Vector , ArrayList, HashTable, HashMap, HashSet, TreeSet..
 *  #Vector
 *  - List계열
 *  -입력순서를 기억한다.
 *  -데이터 중복 지정 가능
 *  -유사 클래스 : ArrayList
 * 
 */

public class VactorTest {

	public static void main(String[] args) {
		//jdk1.4 이전 버전
		//Vector v=new Vector();//초기용량 : 10개, 가득차면 2배로 저장공간을 늘린다.
		Vector v1=new Vector(5,3);//5:초기용량,3:증가치
		System.out.println("백터 v1의 현재 용량 :"+v1.capacity());
		System.out.println("백터 v1의 현재 크기 :"+v1.size());
		//데이터 저장:add() = addElement()
		//데이터 꺼내기 : Object get (int index), Object elementAT(int index)
		v1.add("Hello");
		v1.add(new Integer(20));//ㅇㅖ전 타입.
		v1.add(Integer.valueOf(22));//요즘
		v1.add(3.14);//double 이 저장되는 것이 아니라 Double => Wrapper class로 auto boxing 되어 저장된다.
		
		System.out.println("백터 v1의 현재 용량2 :"+v1.capacity());//5
		System.out.println("백터 v1의 현재 크기2 :"+v1.size());//4
		
		v1.add(new Object());
		v1.add(new javax.swing.JButton("ok"));
		
		System.out.println("백터 v1의 현재 용량3 :"+v1.capacity());//8
		System.out.println("백터 v1의 현재 크기3 :"+v1.size());//6
		
		//Object obj = v1.get(0);
		String obj = (String)v1.get(0);
		System.out.println(obj.toUpperCase());//String타입의 고유한 형이라서 오브젝으로받으면 에러. 강제형변환해야함.
		
		Double db1=(Double)v1.get(3);
		System.out.println(db1);
		
		//String str=(String)v1.get(5);//jbutton 은 STRING이 아니지만 컴파일은 문법체크만 하기때문에 에러는안남.
		//System.out.println(str);// err
		
		JButton str=(JButton)v1.get(5);
		System.out.println(str);
		
		
		//----------------------------------------------------------------------------
		//5.0 이후 부터 Generic을 사용함
		Vector<String> v2=new Vector<>(); // 백터에 스트링만 저장하겠다는 뜻/
		
		v2.add(new String("java"));
		//v2.add(Integer.valueOf(5));//ERR
		v2.add(Integer.valueOf(4).toString());
		
		String s2=v2.get(0); //버전 1과 다르게 형변환 생략가능
		System.out.println(s2);
		
		//[1] for루프 이용해서 v2에 저장된 객체를 출력하기
		for(int i=0; i<2;i++) {// 벡터저장가능한 사이즈가 2 또는 v2.size()
			System.out.println(v2.get(i)+" ");
		}
		
		
		//[2] Float 유형을 저장할 벡터 v3를 생성하고 
		//    Float 객체를 3개이상 저장하기
		//    확장 for문 이용해 v3에 저장된 값들의 합계출력
		
		Vector<Float> v3=new Vector<>();
		v3.add(3.14f);//<= auto unboxing 3.14f, (float)3.14, Float.valueOf(3.14)
		v3.add(4f);
		v3.add(5f);
		
		float sum=0;

		for(float a : v3 ) //<= auto unboxing ,
			sum+=a;
			System.out.println("합계 : " + sum);
		
		
		

	}

}
