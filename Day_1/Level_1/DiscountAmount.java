public class DiscountAmount{
  public static void main(String[]args){
   
	    //creating variable fee and discountPercent
		double fee = 125000, discountPercent = 10;
		
		//creating variable discount
        double discount = fee * (discountPercent / 100);
		
        //creating variable discountedFee
		double discountedFee = fee - discount;
		
		//display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
		
    }
	
	
  }  