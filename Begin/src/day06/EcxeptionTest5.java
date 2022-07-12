package day06;
/*
 * try{
 * }catch()
 * }finally{
 * 	finally블럭은 반드시 한번은 수행되는 블럭이다.
 * 	위 return문이 오더라도 한번은 수행하고 제어권을 넘긴다.
 * 
 * 단, 시스템 종료코드가 있을 경우 예외.System.exit(0)
 */

public class EcxeptionTest5 {

	public static void main(String[] args) {
		
		try {
			int num=Integer.parseInt(args[0]);//
			
			System.out.println(50/num);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("명령줄 인수를 1개 입력해야해요");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해야해요");
			return;//제어 흐름을 되돌려 main으로 돌아가 프로그램이끝남.
		}catch(ArithmeticException e) {
			System.out.println("분모가 0이 되어서는 안됩니다.");
			System.exit(0);//프로그램 종료
		}catch(Exception e) {
			System.out.println("기타 오류 발생 : "+ e.getMessage());
		}finally {//return 보다 우선순위. 리턴문 전 finally를 실행시킴.
			System.out.println("반드시 실행되어야 할 코드입니다.");
		}
		System.out.println("The End~~~~~~~~~~~~~~~~~~~");
	}

}
