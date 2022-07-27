package Test10_7;

public class QuickSort implements Sort{
	@Override
	public void asceding(int[] arr) {
		System.out.println("QuickSort ascedning");
		
		
	}
	@Override
	public void descending(int [] arr) {
		System.out.println("QuickSort descending");
		
	}
	@Override
	public void description() {
		System.out.println("QuickSort입니다.");
		Sort.super.description();
	}
}
