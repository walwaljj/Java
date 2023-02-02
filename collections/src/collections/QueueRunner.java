package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// queue의 기본 정렬인 알파벳 순서에서 단어의 길이로 정렬을 변경하기
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
