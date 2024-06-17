package edu.training.les16_java_students.main;

import java.util.ArrayList;
import java.util.List;

import edu.training.les16_java_students.entity.Group;
import edu.training.les16_java_students.entity.Student;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students = initStudents(students);

		Group group = new Group(students);
		group.printExcellentStudents();
	}

	public static List<Student> initStudents(List<Student> students) {
		students.add(new Student("Иванов И.И.", 1, new ArrayList<>(List.of(10, 9, 10, 9, 10))));
		students.add(new Student("Петров П.П.", 1, new ArrayList<>(List.of(8, 9, 10, 9, 10))));
		students.add(new Student("Сидоров С.С.", 2, new ArrayList<>(List.of(10, 10, 10, 10, 10))));
		students.add(new Student("Козлов К.К.", 2, new ArrayList<>(List.of(9, 9, 9, 9, 9))));
		students.add(new Student("Николаев Н.Н.", 3, new ArrayList<>(List.of(7, 8, 7, 8, 7))));
		students.add(new Student("Григорьев Г.Г.", 3, new ArrayList<>(List.of(10, 10, 9, 10, 9))));
		students.add(new Student("Алексеев А.А.", 4, new ArrayList<>(List.of(8, 8, 8, 8, 8))));
		students.add(new Student("Дмитриев Д.Д.", 4, new ArrayList<>(List.of(9, 10, 9, 10, 9))));
		students.add(new Student("Олегов О.О.", 5, new ArrayList<>(List.of(10, 9, 10, 9, 10))));
		students.add(new Student("Егоров Е.Е.", 5, new ArrayList<>(List.of(7, 6, 7, 6, 7))));
		return students;
	}

}