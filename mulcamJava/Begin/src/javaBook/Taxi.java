package javaBook;

public class Taxi {
	int taxinum=11;
	long fee=10000;
	int paxcount=0;
	

	
	public Taxi() {
		fee=fee*paxcount;
		paxcount++;
		taxiInfo();
	}
	public Taxi(int taxinum,int paxcount) {
		this.taxinum=taxinum;
		this.fee=fee*paxcount;
		paxcount++;
		taxiInfo();
	}
	public void taxiInfo(){
		Student a=new Student();
		++paxcount;
		fee+=a.fee;
		System.out.println(taxinum+"번 택시는 "+paxcount+"명의 승객을 태웠습니다. 수입은 "
							+fee+"입니다.");
	}

}
