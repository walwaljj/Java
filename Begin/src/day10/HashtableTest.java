package day10;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key) 
 * */

import java.util.*;
public class HashtableTest {
				//ㄴ사전적 개념?
	public static void main(String[] args) {
		Hashtable<String, Integer> h1=new Hashtable<>();
		//key 값은 String value 값은 Integer 
		//index 가 아닌 key와 value로 ..
		h1.put("생년", 2012);
		h1.put("나이", Integer.valueOf(20));
		h1.put("연봉", 5000);
		//h1.put("나이", 30);//key값이 중복되면 나중에 저장된 값만 나온다.
		
		//Map 계열은 검색이 용이함.
		Integer age= h1.get("나이");//key값으로 검색을 한다.
		System.out.println("age :"+age+"세" );
		System.out.println("h1.size();" + h1.size());
		//Enumeration<K>	keys() : key 값들만 Enumeration 객체로 반환함
		//key 값들 추출해서 출력한 뒤 , value도 같이 출력해보기.
		Enumeration<String>	en = h1.keys();
		for(;en.hasMoreElements();) {
			String key=en.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
		
		//Set<K>	keySet()		: key 값들만 Set객체로 반환
		Set<String> s=h1.keySet();
		for(String ky:s) {
			System.out.println(ky);
		}
		
		//Collection<V>	values()	:Value 값들만 반환
		Collection<Integer> co=h1.values();
		for(Integer i:co) {
			System.out.println(co);
		}
		Collection<Integer> cl=h1.values();
		for(Integer val : cl) {
			System.out.println(val);
		}
		//boolean	containsKey(Object key): key값을 포함하고 있으면 true, 없으면 false
		//boolean	containsValue(Object value) : Value값을 포함하고 있으면 true, 없으면 false
		System.out.println(h1.containsKey("생년"));//key중 생년이 있으면 true 를 찍을것
		System.out.println(h1.containsValue(2022));//Value중 2022이 있으면 true 를 찍을것
		


	} 

}
