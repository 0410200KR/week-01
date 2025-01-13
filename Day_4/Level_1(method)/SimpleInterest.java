import java.util.*; 

// making a class for calculating simple interest 
class SimpleInterest{

 public int simpleInterest(int Principal, int Rate, int Time){
  int si = (Principal* Rate* Time)/100; 
   return si; 
  }
 public static void main (String[] args){ 
  // making input as an object of Scanner class 
  Scanner input = new Scanner(System.in); 
  System.out.println("Enter Principal:"); 
   int principal = input.nextInt(); 
   
  System.out.println("Enter Rate of Interest: "); 
  int rate = input.nextInt(); 
  
  System.out.println("Enter Time in years: "); 
  int time = input.nextInt(); 
  
   SimpleInterest obj = new SimpleInterest(); 
   int si = obj.simpleInterest(principal,rate,time); 

  //Displaying simpleInterest 
   System.out.println("The Simple Interest is : "+si+" for Principal "+principal" , Rate of Interest "+rate" and Time "+time); 
  }
}

