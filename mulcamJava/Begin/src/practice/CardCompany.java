package practice;

class CardCompany {
	
	private int cardNum;
	private String name;
	
	
	
	CardCompany(String name){
		this.cardNum = cardNum;
		this.name = name;
	}
	
	public void makeCard(int cardNum) {
		this.cardNum = cardNum++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int a) {
		a =cardNum++;
		return;
	}
	public void showInfo() {	
		System.out.println(name+"님의 카드가 발급되었습니다. 카드번호는 "+cardNum+"입니다.");
	}
	

}
