
class CharInt {

	public static void main(String[] args) {

		int row=6;
		int n = 1;
		char ch ='F';
		for(int i=1;i<=row;i++) {

			char temp=ch;
			for(int j=1;j<=i;j++) {
				
				if(j%2!=0)
					System.out.print(temp++ +" ");
				else 
					System.out.print(n++ +" ");
			}
			ch--;
			System.out.println();
		}
	}
}
