
public class StudentManager extends UserManager {

	public void enrollCourse(Student student) {
		System.out.println(
				student.getFirstName() + " " + student.getLastName() + " " + "enroll to a course succesfully.");
	}
}
