 import java.lang.*;
import java.util.*;
public class compareStringsUsingCharAt
{
   public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
  public static void main(String []args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   String str1=sc.next();
	   
	    System.out.println("Enter another string: ");
	   String str2=sc.next();
	   System.out.println(compareStringsUsingCharAt(str1,str2));
	   
	   
	}
}