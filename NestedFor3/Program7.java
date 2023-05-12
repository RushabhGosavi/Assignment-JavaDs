
class PatternSeven {

	public static void main(String[] args) {

		int row = 6;
		for(int i=1;i<=row;i++) {

			char ch ='F';
			if(i==2){
				ch--;
			}else if(i==3) { 
				ch--;
				ch--;
			}else if(i==4) {
				ch--;
				ch--;
				ch--;
			}else if(i==5) { 
				ch--;
				ch--;
				ch--;
				ch--;
			}else if(i==6) {
				ch--;
				ch--;
				ch--;
				ch--;
				ch--;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
	
			if(i==1)
				ch--;
	
			System.out.println();
		}
	}
}
