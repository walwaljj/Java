package jungsuk.jungsuk_200;
import java.util.*;
import java.util.regex.*;
public class java200_9_14 {

	public static void main(String args[]) {
		String [] phoneNumArr= {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"

		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			if(input.equals("")) {
			continue;
			} else if(input.equalsIgnoreCase("Q")) {
			System.exit(0);
			}
			
			String pattern = ".*"+input+".*";
			Pattern p = Pattern.compile(pattern);
//			if(Pattern.compile(input)==phoneNumArr[])
			for (int i = 0 ; i < phoneNumArr.length ; i++) {
				String str = phoneNumArr[i];
				String tmp = str.replace("-","");
				Matcher m = p.matcher(tmp);
				// 입력받은 input(패턴화해서 p 에 넣음) 과 phoneNumArr[i](replace해서 특수문자없앰.)을 비교하기위해 matcher에 담음.
				if(m.find()) {// 위 코드에서 t or f를 확인
					list.add(str); // t라면 list에 phoneNumArr[i]를 넣는다.
				
			}
			}
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println(" 일치하는 번호가 없습니다."); 
				}
		}

	}
}
