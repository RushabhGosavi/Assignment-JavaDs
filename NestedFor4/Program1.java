
class C2w {

	public static void main(String[] args) {

		int row = 4;
		int num = 10;
		for(int i=1;i<=row;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print("C2W"+num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
