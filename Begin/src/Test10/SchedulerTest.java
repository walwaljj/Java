package Test10;

import java.io.*;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고있거나 대기가 가장적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read(); // 할당방식을 입력받아 ch변수에 대입
		Scheduler scheduler = null;
		
		if(ch == 'R'|| ch=='r') {
			scheduler = new RoundRobin();
		}
		else if(ch =='L'|| ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch =='p'||ch == 'P') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
