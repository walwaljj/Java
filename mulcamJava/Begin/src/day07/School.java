package day07;


public class School {
	
	public static void main(String[] args) {
		
		
		//학생객체 학번 이름 전공
		Student s1=new Student();
		s1.setNo(1);
		s1.setName("김학생");
		s1.setMajor("관광");
		
		//s1.showInfo();
		
		//문제1]학생 객체를 2개 더 생성하고...
		//        각각 이름,학번,전공 값을 넣어준뒤...
		//			학생저장 배열에 저장하자.
		//			for루프 돌리면서 저장된 학생 객체들의
		//         정보를 출력해보자.
		
		Student s11=new Student();
		s11.setNo(2);
		s11.setName("이학년");
		s11.setMajor("회계");
		
		Student s111=new Student();
		s111.setNo(3);
		s111.setName("삼학년");
		s111.setMajor("연기");
		
		Student[] a=new Student[3];//같은 타입(student)으로 해야함.
		a[0]=s1;
		a[1]=s11;
		a[2]=s111;
		
		for(int i=0;i<a.length;i++) {
			Student st=a[i];
			//System.out.println(st);//주소값이 나옴
			st.showInfo();
		

		}
		
		
		//교사객체 교번 이름 과목
		Teacher s2=new Teacher();
		s2.setNo(1);
		s2.setName("김교사");
		s2.setSubject("빅데이터");
		
		//s2.showInfo();
		
		//문제2]교사 객체 1개 더 생성
		//		값 할당 후 배열저장
		//		확장 for루프 이용해서 교사정보 출력
		
		Teacher s22=new Teacher();
		s22.setNo(2);
		s22.setName("김교수");
		s22.setSubject("자바");
		
		Teacher t2[]= {s2 ,s22};
		
		for(Teacher t : t2) {
			t.showInfo();
		}
		
		
		
		
		//직원객체 사번 이름 소속
		Staff s3=new Staff();
		s3.setNo(1);
		s3.setName("김사원");
		s3.setDept("인사팀");
		
		s3.showInfo();
		
		/*System.out.println("학 번 : "+s1.getNo());
		System.out.println("이 름 : "+s1.getName());//1회용
		String mj=s1.getMajor();			  	//변수를 만들어서 사용가능
		System.out.println("전 공 : "+mj);*/
		

		
	
		
		
		


		
	}
	
}
