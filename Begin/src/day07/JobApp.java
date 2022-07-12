package day07;

public class JobApp {

	public static void main(String[] args) {
			
		Job j=new Job("무슨회사");
		Job j1=new Job(10);
		Job j2=new Job(5);
		
		j2.jobInfo();
		j1.jobInfo();
		j.jobInfo();
		System.out.println("-----------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		Jobhunter h=new Jobhunter("나도일");
		Jobhunter h1=new Jobhunter("백수");
		Jobhunter h2=new Jobhunter("일원해");
		
		h2.showInfo();
		h1.showInfo();
		h.showInfo();
		System.out.println("-----------------");

	}

}
