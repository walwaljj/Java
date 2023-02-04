package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//Stream<T> filter(Predicate<? super T> predicate); 

/*
 * @FunctionalInterface public interface Predicate<T> { boolean test(T t);
 */
class EvenNumberPredicate implements Predicate<Integer> { // Predicate는 입력값의 참, 거짓을 판별 == 필터링.

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}


// void forEach(Consumer<? super T> action);
/*
 * @FunctionalInterface public interface Consumer<T> {
 * 
 * void accept(T t);
 */
class EachConsumer implements Consumer<Integer> { // Consumer 는 입력값을 소비 , 반환값 없음.

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}


//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//R apply(T t);
class NumberSquareMapper implements Function<Integer, Integer> { // 변형해줌.
									// type : 입력값 출력값
	@Override
	public Integer apply(Integer t) {

		return t * t;
	}
	
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		Predicate<? super Integer> evenPredicate = extracted();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

		List.of(23, 43, 34, 45,36,48).stream()
				.filter(evenPredicate).map(n -> n * n).forEach(e -> System.out.println(e));

		
		List.of(23, 43, 34, 45, 36, 48).stream()
				.filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(new EachConsumer());

		

	}

	private static Predicate<? super Integer> extracted() {
		return n -> n % 2 == 0;
	}

}
