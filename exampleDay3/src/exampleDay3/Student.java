package exampleDay3;

public class Student extends User{
	
	private String recordedLesson;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String password, String recordedLesson) {
		super(id, firstName, lastName, email, password);
		this.recordedLesson = recordedLesson;
	}

	public String getRecordedLesson() {
		return recordedLesson;
	}

	public void setRecordedLesson(String recordedLesson) {
		this.recordedLesson = recordedLesson;
	}
	

}
