/* Program which takes no from user if no is even print that no in reverse order
 or if no is odd print that no in reverse order by difference of 2 */

class ReverseOddEven {

	public static void main(String[] args) {

		int n = 7;
		int i = 1;
                int rev = 0;


			if(n%2==0) {
				while(i<=n){

				rev = n;
				System.out.println(rev);
				n--;
				}
			}else {
				while(i<=n){

				rev = n;
				System.out.println(rev);
				n--;
				n--;
				}
			}
			i++;

	}
}
