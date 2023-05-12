
class CharInt1 {

	public static void main(String[] args) {

		for(int i=1;i<=6;i++){

			int n = 5;
			char ch = 'F';
			for(int j=1;j<=6;j++) {

				if(j%2==0) {
					System.out.print(n+" ");
					n=n-2;
				}else {

					System.out.print(ch+" ");
					ch--;
					ch--;
				}
			}
			System.out.println();	
		}
	}
}	
