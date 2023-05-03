/* Program to write unique real time example of if elseif else ladder */

class RealTime {

	public static void main(String[] args) {

		int percent = 90;

			System.out.println("You got Good Score in Exam ?");
			System.out.println("Your Score:" +percent);

			if(percent>80)
				System.out.println("It is Distinction!! Dad Brought you a Gift!!");
			else if(percent>60 && percent<80)
				System.out.println("You Got Satisfactory score!! Dad is Happy mom Got you a Gift!!");
			else if(percent>40 && percent<60)
				System.out.println("You are Pass!! Every one is Suggesting to Study Hard");
			else
				System.out.println("You are fail!! Mom is with you to give you a chance");
	}
}
