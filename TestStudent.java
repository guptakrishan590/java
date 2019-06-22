
public class TestStudent {

	public static void main(String[] args) {
		int marks[]= {80,80,80};
		Student s1 =new Student(100, "kRiSh kUmAr gUpTa ",marks );
		System.out.println(s1.print());
		int ramMarks [] = {90,90,90};
		s1.setMarks(ramMarks);
		System.out.println("///////////////////////////////////////////");
		System.out.println(s1.print());
	}

}
