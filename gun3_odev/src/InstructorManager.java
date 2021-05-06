public class InstructorManager extends UserManager {

	public void startCourse(Instructor instructor, String courseName) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " started the course : " + courseName);

		this.join(instructor);
	}

	// aşağıdaki metod yorum satırı olarak kaldığında
	// Usermanager'dan kalıtım ile gelen join metodu çalışır
	// yorum satırları açılır ise bu sınıfın join metodu kullanılır....

	/*
	 * 
	 * public void join(Instructor instructor) {
	 * System.out.println(instructor.getFirstName() + " " + instructor.getLastName()
	 * + " joined the course " + instructor.getCourseName() +
	 * " as Instructor (Instructor Manager)"); }
	 */
}
