package jungsuk.jungsuk_200;
class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	int backcn;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		
		backcn=this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	//현재 채널을 이전 채널로 변경한다
	public void gotoPrevChannel() {
		
		setChannel(backcn);

	}

}
public class java200_7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());//20의 이전 채널 10
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());//10의 이전 20으로

	}

}
