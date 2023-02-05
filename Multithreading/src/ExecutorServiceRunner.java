import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// 한번에 하나의 thread를 실행하는 기능.

		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2())); 
		
		// Executors.newSingleThreadExecutor(); 가 구현된 executorService 를 통해 task1 , 2 를 실행함.
		// 결과 : task1 이 끝난 후 task2 를 실행함.
		// 즉 , thread를 하나만 사용하도록 통제함.
		
		System.out.print("\nTask3 kicked Off ");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3 Done ");
		System.out.print("\nMain Done");

		executorService.shutdown();// Executors.newSingleThreadExecutor(); 종료
	}

}
