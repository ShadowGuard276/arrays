package student;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
	this.name =name;
	this.marks = marks;
	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getTotalNumberOfMarks() {
		int sum =0;
		for(int mark:marks) {
			sum =sum+mark;
			
		}
		return sum;
	}

	public int getMaxNumberOfMarks() {
		int max=Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark>max) {
				max=mark;
			}
			
		}
		return max;
	}

	public int getMinNoOfMarks() {
		int min =Integer.MAX_VALUE;
		for( int mark:marks) {
			if(min>mark) {
				min =mark;
			}
		}
		return min ;
	}

	public BigDecimal getAverageOfMarks() {
		int sum = getTotalNumberOfMarks();
		int num = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(num),3,RoundingMode.UP);
	}

}
