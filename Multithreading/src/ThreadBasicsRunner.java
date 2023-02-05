//extends Thread
//implements Runnable

class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask1 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {

		Task1 task1 = new Task1();
//		task1.run();// 보통 메서드의 실행 방법 : task1 후 task2 실행됨.
		task1.start();// Thread 실행법 : task1 와 task2가 함께 실행됨.

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask2 Done");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3d Done");
	}

}
