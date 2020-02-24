
public class sob34 {
	// Main method
	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
		Person person = new Person("hatim", "majaz", "05671564", "hatim@g.com");

		Student student = new Student("asif", "an", "5149993333", "mary100@aol.com", Student.FRESHMAN);

		Employee employee = new Employee("Mike", "dubai", "6189999999","mike80@aol.com", 910, 60000);

		Faculty faculty = new Faculty("jesse", "shj", "4133333333","sue28@aol.com", 101, 50000, "2pm to 6pm", "Professor");

		Staff staff = new Staff("Tom", "90 Country road", "2030000000","tomcat@aol.com", 12, 65000, "Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}