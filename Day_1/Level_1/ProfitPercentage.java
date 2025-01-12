public class ProfitPercentage
{
  public static void main(String[]args)
 { 
        //creating variable costPrice and SellingPrice 
        int costPrice = 129, sellingPrice = 191;
		
		//creating variable profit and profitPercentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;
		
		// display result
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice+ "\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
        
 }
} 
