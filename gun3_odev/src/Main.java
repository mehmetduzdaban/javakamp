public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Ahmet", "Erdoğan", "kodlama.io");
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("test");
		student2.setLastName("öğrenci");
		student2.setSchoolName("kodlama.io");

		String courseName = "Java+React";

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", courseName);

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		instructorManager.startCourse(instructor, courseName);
		studentManager.join(student1);
		studentManager.join(student2);
	}

}
