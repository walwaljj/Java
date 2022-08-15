package test13;

import java.util.*;

public class TravleTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		
		System.out.println("==고객명단 추가된 순서대로 출력==");
		customerList.stream().map(s->s.getName()).forEach(c->System.out.println(c));
		
		
		int total = customerList.stream().mapToInt(s->s.getPrice()).sum();
		System.out.println("총 여행 비용은 "+total+"입니다.");
		
		System.out.println("==20세 이상 고객 명단을 정렬하여 출력==");
		customerList.stream().filter(f->f.getAge()>=20)
		.map(m->m.getName()).sorted().forEach(s->System.out.println(s));
	
	}

}
