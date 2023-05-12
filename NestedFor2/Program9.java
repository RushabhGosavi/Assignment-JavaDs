
class DigitChar1 {

	public static void main(String[] args) {

		int n = 1;
		for(int i=1;i<=3;i++){
			
			char ch ='C';
			int num = 3;
			for(int j=1;j<=3;j++) {

				System.out.print(n*n+""+ch+""+num+" ");
				ch--;
				num--;
				n++;
			}
			System.out.println();
		}
	}
}
