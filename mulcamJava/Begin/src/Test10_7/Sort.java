package Test10_7;

public interface Sort {
	public void asceding(int[]arr);//배열을 매개변수로 오름차순으로 정렬
		
	public void descending(int[]arr) ;//배열을 매개변수로 내림차순 정렬
		
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
