import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	
	private String name;

	public CallableTask(String name) {
		this.name = name;
		
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
	
}


public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("gg")); // execute 가 아닌 submit 은
																						// callable을 실행할 수 있음.
		System.out.println("\n new CallableTask(\"gg\") executed ");
		String welcomeMessage = welcomeFuture.get(); // 결과값 반환. (ㅇㅖ외처리)
		System.out.println(welcomeMessage);

		System.out.println("\n Main completed");
		executorService.shutdown();
	}

}
