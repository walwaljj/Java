package javaBook;

public class Info {

	String num="201803120001";
	String id="abc123";
	String date="2018년 3월 12일";
	String name="홍길순";
	String item="PD0345-12";
	String addr="서울시 영등포구 여의도동 20번지";
	
	
	public void showInfo() {
		System.out.println("주문 번호 : "+num);
		System.out.println("주문자 아이디 : "+id);
		System.out.println("주문 날짜 : "+date);
		System.out.println("주문자 이름 : "+name );
		System.out.println("주문 상품 번호 : "+item);
		System.out.println("배송 주소 : "+addr);
	}
}
