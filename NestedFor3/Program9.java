
class PatternNine {

	public static void main(String[] args) {

		int row = 3;
		int n = 1;

		for(int i=1;i<=row;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(n*n*n+" ");
				n++;
			}
			System.out.println();
		}
	}
}
