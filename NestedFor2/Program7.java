
class OddSq {

	public static void main(String[] args) {

		int n = 1;
		for(int i=1;i<=3;i++) {

			for(int j=1;j<=3;j++) {

				if(n%2==0) {
					System.out.print(n+" ");
					n++;
				}else {
					System.out.print(n*n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}
}