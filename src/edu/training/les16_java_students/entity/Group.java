package edu.training.les16_java_students.entity;

import java.util.List;

public class Group {
	
	private List<Student> students;

	public Group(List<Student> students) {
		this.students = students;
	}

	public void printExcellentStudents() {
		StringBuilder report = new StringBuilder();
	    report.append("Список студентов, имеющих оценки, равные только 9 или 10:\n")
	    .append("------------------------------")
	    .append("\n");
	    for (Student student : students) {
	        if (student.hasExcellentGrades()) {
	            report.append(student.getName())
	            .append(", группа номер ")
	            .append(student.getGroupNumber())
	            .append("\n");
	        }
	    }
	    report.append("------------------------------");
	    System.out.println(report);
	}

}