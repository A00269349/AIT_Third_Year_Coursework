
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("John");
		Person p3 = new Person("Mary", "Cork");
		Person p4 = new Person("Claire", 871234567);
		Person p5 = new Person("Michael", 877654321, "Dublin");
		
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
		p4.printDetails();
		p5.printDetails();
	}

}
