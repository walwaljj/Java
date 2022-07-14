package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println(" 각 도형의 면적을 구해 봅시다");
		System.out.println("가로 : "+7+", 세로 : " +8+"--------");
		
		Rectangle rt = new Rectangle();
		rt.area(7,8);
		Triangle ta =new Triangle();
		ta.area(7,8);
		System.out.println("반지름 : 8인 원의 면적--------");
		//Circle c = new SubCircle();[x]
		//추상클래스는 타입을 선언할 수 있으나, new로 객체 생성을 할수없다.
		//c.area(8);[x]
		//SubCircle에서 area
		Circle c = new SubCircle();
		((SubCircle)c).area(8);
		SubCircle c2 = new SubCircle();
		c2.area(8);
		
		/*[1] 객체들을 저장할 배열을 생성하고 저장한 뒤
		 *  for 루프 돌리면서 area()호출해보기. 
		 * 
		 */
		Shape s[] = {rt,ta,c,c2};
		
		//int 2개짜리는 
		//Subcircle 소속은 int 1개라 
		
		for(int i =0; i<s.length ;i++) {
			System.out.println(s[i]);
		}
		for(int i=0;i<s.length;i++) {
			if(i<2) {
				s[i].area(20,30);
			}else if(i>=2) {
				((SubCircle)s[i]).area(20);
			}
			
			
		}
		
		//만약 shape 가 sub타입이면 ,또는 그렇지않으면 else
		for(Shape shape : s) {
			if(shape instanceof SubCircle) {
				((SubCircle)shape).area(20);
			}else {
			shape.area(20,30);
			}
			System.out.println("***********");
			System.out.println();
		}
		
	}

}
