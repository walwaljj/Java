package day06;
/*인사관리 프로그램을 짠다.
 * ==>객체 : 사원, 부서, 급여, 전화번호
 * 			일을 한다. 휴식을취한다. 점심을 먹는다.
 * 사원만 필요하다하면..
 * 
 * 객ㅊㅔ = 속성 (attribute) + 행동양식(behavior)
 * 		  명사형				 동사형
 * 
 * ==> 객체들을 프로그램으로 끌어들이는것을 추상화(Abstraction)이라 한다.
 * 
 * 		[1]속성 ==> 멤버변수
 * 		[2]행동양식 ==> 메소드
 * 
 */
import java.util.*;
public class Employee {
	//멤버변수 속성: "has a"관계를 가져야한다.
	//Employee has a no = 사원은 (사번,사원,소속.급여) 를 갖습니다.
	int no;//사번
	String name;//사원이름
	String dept;//소속부서
	int salary;//급여
	Date indate;//입사일
	
	
	//행위 ==> 메소드로 구성한다.
	public void work(String type) {//~유형의 일을 한다
		System.out.println(name+"은"+type+" 일을 하고있어요");
		
	}
	public int receive_sal() {//int 는 반환타입.
		
		return salary*12;
	}
}///////////////////////
