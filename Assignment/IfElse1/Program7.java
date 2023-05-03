/* Program to calculate Profit or loss 
  take cost price and selling price */

class ProfitLoss {

	public static void main(String[] args) {

		int sPrice = 900;
		int costPrice = 900;

		if(sPrice>costPrice) {

			System.out.println("Profit of "+(sPrice - costPrice)); 
		}else if(sPrice<costPrice) {

			System.out.println("Loss of "+(costPrice - sPrice));
		}else {

			System.out.println("No Profit No Loss");
		}
	}
}
