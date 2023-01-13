package collections;

public class Student implements Comparable<Student> {
	private String name; // Student를 비교하기 위함.
	private int id;

	public Student(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "  name=" + name + ", ]";
	}

	@Override
	public int compareTo(Student that) {

//		return Integer.compare(this.id, that.id);// id를 기준으로 비교 하기위함. id 는 int 형이며 , int의 compare함수를 사용.
		// 비교대상 없으면 -1 , 또는 비교에 따라 0 , 1 을 반환함.
		return Integer.compare(that.id, this.id);// 내림차순.
	}

}
