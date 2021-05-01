package exampleDay3;

public class Instructor extends User {
	
	private String instructorLesson;

	public Instructor(int id, String firstName, String lastName, String email, String password,
			String instructorLesson) {
		super(id, firstName, lastName, email, password);
		this.instructorLesson = instructorLesson;
	}

	public String getInstructorLesson() {
		return instructorLesson;
	}

	public void setInstructorLesson(String instructorLesson) {
		this.instructorLesson = instructorLesson;
	}

}
