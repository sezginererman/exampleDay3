package exampleDay3;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci ba�ar�yla eklendi.");
	}
	
	public void addLesson(Student student,RegisterLesson registerLesson) {
		System.out.println(student.getFirstName()+student.getLastName());
		registerLesson.registerLesson();
	}
}
