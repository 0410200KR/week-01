import java.util.*;

public class StringLength{
  public static int countString(String k){
      int count=0;
	  int i=0;
      while(true){
	   try{
	    k.charAt(i);
         count++;	
         i++;		 
	  }
	  catch(Exception e){
		  System.out.println("Index out of Bound : ");
		  return count;
	  }
	  }
	  
  }
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string: ");
	String st=sc.next();
	
	System.out.println(countString(st));
	System.out.println(st.length());
	
  }
}