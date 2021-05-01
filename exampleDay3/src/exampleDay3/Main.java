package exampleDay3;

public class Main {

	public static void main(String[] args) {
		
		 
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Sezgin");
		student.setLastName("ERERMAN");
		student.setEmail("sezginererman@gmail.com");
		student.setPassword("123456789");
		
		Instructor instructor = new Instructor(2, "Engin", "DEMÝROG", "engin@kodlama.com","5789145", "Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.addLesson(student, new RegisterCsharpLesson());
		

		
	}

}
