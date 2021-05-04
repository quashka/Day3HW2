
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Berkay");
		student.setLastName("Şahin");
		student.setUniversity("ESOGU");

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setDetail("MCT, PMP ve ITIL sertifikalarına sahibim.");

		/*
		 * System.out.println(student.getId());
		 * System.out.println(student.getFirstName());
		 * System.out.println(student.getLastName());
		 * System.out.println(student.getUniversity());
		 * 
		 * System.out.println(instructor.getId());
		 * System.out.println(instructor.getFirstName());
		 * System.out.println(instructor.getLastName());
		 * System.out.println(instructor.getDetail());
		 */

		/*
		 * User[] users = new User[] {student, instructor}; for (User user : users) {
		 * System.out.println(user.getFirstName()); }
		 */

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.enrollCourse(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.uploadCourse(instructor);
	}

}
