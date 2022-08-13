package innerclass;


class Outer2{
	Runnable getRunnable (int i ) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run(){
			System.out.println("Runnable이 구현된 익명클래스");
		}
	};
}
public class AnonymousLnnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble  = out.getRunnable(10);
		runnerble.run();//10,100
		out.runner.run();//Runnable이 구현된 익명클래스"
	}

}
