package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get(".");

		System.out.println("------------");
		Files.walk(currentDirectory, 0).forEach(System.out::println);//.

		// 현재 경로의 하위 파일보기
		/*.
.\.classpath
.\.project
.\.settings
.\bin
.\src*/
		Files.list(currentDirectory).forEach(System.out::println);

		System.out.println("------------");
		Files.walk(currentDirectory, 1).forEach(System.out::println);


		// 현재 경로의 하위 파일보기(두 단계 아래까지)
		/*.
.\.classpath
.\.project
.\.settings
.\.settings\org.eclipse.core.resources.prefs
.\.settings\org.eclipse.jdt.core.prefs
.\bin
.\bin\files
.\src
.\src\files*/ 
		System.out.println("------------");
		Files.walk(currentDirectory, 2).forEach(System.out::println);

		//현재 경로의 하위 파일 중 일치하는 문자열(.java) 있는지 찾기
		System.out.println("------------");
		Predicate<? super Path> predicate 
		= path -> String.valueOf(path).contains(".java");
		//path 를 변수로 가져와 path에 .java가 포함되어있는지 체크를 함.
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
	
		System.out.println("------------");
		BiPredicate<Path, BasicFileAttributes> matcher 
		=(path,attributes) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectory,4,matcher ).forEach(System.out::println);
	
		// 디렉토리 파일을 가져옴
		System.out.println("------------");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher
		=(path,attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);
	}

}
