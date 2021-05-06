public class Student extends User {

	private String _courseName;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String courseName) {
		super(id, firstName, lastName);
		this._courseName = courseName;
	}

	public String getSchoolName() {
		return _courseName;
	}

	public void setSchoolName(String schoolName) {
		this._courseName = schoolName;
	}

}
