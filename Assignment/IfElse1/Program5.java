/* Program in which according to month no print no of days in that month */

class Month {

	public static void main(String[]args) {

		int month = -6;

		if(month==1)	
			System.out.println("Jan has 31 days");
		else if(month==2)
			System.out.println("Feb has 28/29 days");
		else if(month==3)
			System.out.println("Mar has 31 days");
		else if(month==4)
		 	System.out.println("Apr has 30 days");
		else if(month==5)
			System.out.println("May has 31 days");
		else if(month==6)
			System.out.println("June has 30 days");
		else if(month==7)
			System.out.println("July has 31 days");
		else if(month==8)	
			System.out.println("Aug has 31 days");
		else if(month==9)	
			System.out.println("Sep has 30 days");
		else if(month==10)
			System.out.println("Oct has 31 days");
		else if(month==11)
			System.out.println("Nov has 30 days");
		else if(month==12)
			System.out.println("Dec has 31 days");
		else
			System.out.println("Invalid month");
	}
}
