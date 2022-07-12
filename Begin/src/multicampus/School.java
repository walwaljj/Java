package multicampus;
//메소드를 호출하는 방법 : 클래스.<-스태틱인 것 2.객체명.
import java.util.*;

public class School {
	//School has a students[배열] -- string으로 저장하게되면 이름만 저장가능. 숫자형 저장불가
	
	static Student[] arr=new Student[1];//배열 => 데이터베이스 같은 역할은 한다.
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	
	//
	public static void showMenu() {
		
		System.out.println("****** SchoolApp v1.1 ");
		System.out.println("======================");
		System.out.println("[1]......등   록.......");
		System.out.println("[2]......출   력.......");
		System.out.println("[3]......검   색.......");
		System.out.println("[4]......삭   제.......");
		System.out.println("[9]......종   료.......");
		System.out.println("======================");
		System.out.println("  메뉴 번호를 입력하세요.  ");
		System.out.println("======================");
	}//showmenu 끝----
	
	//등록시 표출 내용
	public static void register() {
		Student s1=new Student();//스튜던트 객체 s1 지역변수기때문에 arr에 저장해야한다.
		s1.inputInfo();
		System.out.println("=입력한 정보를 확인해 주세요.=");
		s1.showInfo();
		System.out.println("========================");
		System.out.println("입력한 정보를 저장할까요?");
		System.out.println("========================");
		System.out.println("[1] YES           [2] NO");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1) {
			try {
				//s1을 배열에 저장해야한다.==> arr에 저장하기
					arr[count]=s1;//윗줄에서 인덱스번호로 사용할 변수를 생성했다.
					count++;
				System.out.println("현재 등록된 인원 수 : "+count+"명");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("등록인원 마감되어 저장할수 없습니다. 현재인원 : "+ count+" 명");
				
			}
		}
			
		}//1번 끝!-----------------
	/**등록된 모든 학생정보를 출력하는 메소드*/	
		//출력시 표출 내용
		public void printAll() {
			Student s1=new Student();
			System.out.println("현재 등록된 모든 학생 정보입니다.");
			for(int count=0;count<arr.length;count++) {
				System.out.println(arr[count]);
			//System.out.println(s1);//<--의 주소값이 출력된다.
			}
			for(int i=0;i<count;i++){//count<arr.length를 count로 변경해서 정해진 학생수 보다 작게 입력했을때 에러가남
			 Student s=arr[i];
			 System.out.println("-------------------------");
			 s.showInfo();
			}
			
			
		
		}//2번 끝--------------------
	
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School obj=new School();
		int num;//메뉴번호를 담기위해 선언함
		do {
			//메소드 호출하기ㄱ //항상 클레스.메소드()
			School.showMenu();
			num = sc.nextInt();
			//메뉴에 없는 번호를 입력했을경우 다시입력하게 
			if((num>=5)&(num<9)|(num==0)) {
				System.out.println("메뉴에 없는 번호입니다. 다시입력하세요");
				continue;//밑에 문장은 스킵하고 showMenu를 실행하도록 함.
			}
			switch(num) {
			case 1: //학생 등록 
				School.register();//static이라 클레스.메소드 (=클레스 메소드)
				break;
			case 2: //출력 
				obj.printAll();//non static이라 객체명.메소드 (=인스턴스 메소드)
				break;
			case 3:
				break;
			case 4:
				break;
			}
			System.out.println("메뉴로 다시 돌아갈까요?");
			System.out.println ("[1] YES     [2] NO");
			int a=sc.nextInt();
			if(a!=1)
				if(a>1)
				break;
		} while(num!=9);//선택번호가 9가 아닐때까지 반복문을 돌자라는 뜻/
		System.out.println("안녕히가세요! :)");
		
		//Student s1=new Student();
		
				
	}

}
