import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {

		System.out.print("\nTask" + number + " started => ");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask" + number + " Done ");
	}
}

public class ExecutorServiceRunner2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);// (n)몇개의 thread가 필요한지
		// Executors.newFixedThreadPool(n) :여러개의 thread를 실행하는 기능.

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		
		// Executors.newFixedThreadPool(n); 가 구현된 executorService 를 통해 실행함.
		// 결과 : n의 수 만큼 thread 동시 실행 함. 구현한 thread가 n개의 수만큼사용하게됨.
		//									=> 1,2 시작 , 1끝 => 3시작 , 2 3 끝 => 4 5 시작 ..
		// 즉 , thread 수를 사용자가 정의함.
		

		executorService.shutdown();// Executors.newSingleThreadExecutor(); 종료
	}

}
