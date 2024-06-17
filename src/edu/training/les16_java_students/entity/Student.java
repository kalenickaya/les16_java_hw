package edu.training.les16_java_students.entity;

import java.util.List;

public class Student {
	
	private String name;
	private int groupNumber;
	private List<Integer> grades;

	public Student(String name, int groupNumber, List<Integer> grades) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	public boolean hasExcellentGrades() {
		for (int grade : grades) {
			if (grade < 9) {
				return false;
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

}