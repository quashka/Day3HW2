
public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("We are grateful to you for trying to teach us something" + " " + user.getFirstName() + " "
				+ user.getLastName() + ". " + "Information multiplies as it is shared.");

	}

	public void uploadCourse(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " " + "upload a course succesfully.");
	}
}
