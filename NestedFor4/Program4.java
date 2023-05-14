
class RowInc {

	public static void main(String[] args) {

		int row=4;
		for(int i=1;i<=row;i++) {

			int n = i;
			for(int j=row;j>=i;j--) {

				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
