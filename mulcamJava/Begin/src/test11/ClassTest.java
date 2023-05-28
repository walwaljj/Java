package test11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args)throws ClassNotFoundException {
		Person p=new Person();
		Class c=p.getClass();
		
		
		Constructor[] ct=c.getConstructors();
		for(Constructor con : ct) {
			System.out.println(con);
		}
		
		System.out.println("-------------");
		Method[] mt=c.getMethods();
		for(Method met : mt) {
			System.out.println(met);
		}
		System.out.println("-----------------");
		
		
		Field[] f=c.getFields();
		//왜 출력이안대징..
		for(Field fields:f) {
			System.out.println(fields);
			System.out.println(fields.getName());
		}
	}

}
