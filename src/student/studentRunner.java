package student;

import java.math.BigDecimal;

public class studentRunner {

	public static void main(String[] args) {
		Student student = new Student("ben", 60,70,80,77,82,91 );
		int number = student.getNumberOfMarks();
		System.out.println("number of marks :"+ number);
		int sum = student.getTotalNumberOfMarks();
		System.out.println("sum of marks "+ sum);
		int maxMarks =student.getMaxNumberOfMarks();
		System.out.println("the max marks:"+ maxMarks);
		int minMarks = student.getMinNoOfMarks();
		System.out.println("min marks:"+ minMarks);
		BigDecimal average = student.getAverageOfMarks();
		System.out.println("average of number:" + average);
		System.out.println(student);
	}

}
