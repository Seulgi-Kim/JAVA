package arrayList;

import java.util.ArrayList;


public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	public Student (int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int mark) {
		Subject subject = new Subject();
		
		subject.setName (name);
		subject.setMark (mark);
		
		subjectList.add(subject);
	}
	
	public void showMarkInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			total += subject.getMark();
			System.out.println(studentName + "'s " + subject.getName() 
							+ " mark is " + subject.getMark());
			
		}
		System.out.println(studentName + "'s total mark is " + total);
	}
	
	
	
}
