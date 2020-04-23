package student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks= new ArrayList<Integer>();

	public Student(String name, int... marks) {
	this.name =name;
	for(int mark:marks) {
		this.marks.add(mark);
	}
	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalNumberOfMarks() {
		int sum =0;
		for(int mark:marks) {
			sum =sum+mark;
			
		}
		return sum;
	}

	public int getMaxNumberOfMarks() {
	
		return Collections.max(marks);
	}

	public int getMinNoOfMarks() {
				return Collections.min(marks) ;
	}

	public BigDecimal getAverageOfMarks() {
		int sum = getTotalNumberOfMarks();
		int num = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(num),3,RoundingMode.UP);
	}
	public String toString() {
		return name+ marks;
		
	}

}
