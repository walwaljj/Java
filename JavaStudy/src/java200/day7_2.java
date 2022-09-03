package java200;

public class day7_2 {

	public static void main(String[] args) {
		//숫자맞추기 게임을 작성한 것이다. 1과100 사이의 값을 반복적으로 입력해서
		//컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는
		//자신이 생각한 값과 비교해서 결과를 알려준다.
		//사용자가 컴퓨터의 값을 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려준다.
		
		int answer= (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("1과 100사이의 값을 입력하세요:");
		do {
			input = sc.nextInt();//입력받은 값을 변수 input에 저장한다
			if(input!=0) {
				count++;
			if(input>100||input<1) {
				System.out.println("1과 100사이의 값을 입력해야해요.");
			}else if(input==answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				break;
			}else if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(input<answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
			}else {System.out.println("===프로그램 종료===");
			break;
			}
			
		}while(true);
		
	}

}
