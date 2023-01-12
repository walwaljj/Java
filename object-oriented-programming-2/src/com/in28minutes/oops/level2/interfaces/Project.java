package com.in28minutes.oops.level2.interfaces;

public class Project {

	interface Test {
		void nothing();

		default void nothing1() {
		};// default 생략시 class1,2 nothing1() 구현안함 에러뜸
			// ㄴ 인터페이스 구현 후 배포할때 메서드를 구현하지 않아발생하는
			// 컴파일 오류를 방지할 수 잇다.
	}

	class Class1 implements Test {

		@Override
		public void nothing() {

		}
	}

	class Class2 implements Test {

		@Override
		public void nothing() {

		}
	}
	public static void main(String[] args) {

		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
