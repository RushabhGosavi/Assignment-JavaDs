/* Program to print countdown of days to submit assignment */

class DaysAss {

	public static void main(String[] args) {

		int day = 7;
		if(day == 0) {

			System.out.println(day+" days Assignment is Overdue");
		}else {

			while(day>=1) {

				System.out.println(day+" days remaining");
				day--;
			}
		   if(day==0) {

			 System.out.println(day+" days remaining is Overdue");
		   }
		}

	
	}
}
