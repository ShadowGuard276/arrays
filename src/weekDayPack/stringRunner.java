package weekDayPack;

public class stringRunner {
 public static void main (String[] args){
	 String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
	String daysWithMostCharacters="";
	 for(String day:daysOfWeek) {
		 if(day.length()>daysWithMostCharacters.length()) {
			 daysWithMostCharacters = day;
		 }
	 }
	 System.out.println("days with most number of characters:"+ daysWithMostCharacters);
	 
	 for(int i=daysOfWeek.length-1;i>=0;i--) {
		 
		 System.out.println(daysOfWeek[i]);
	 }
}
}
