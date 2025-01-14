import java.util.*;
public class CompareCharArray{
   public static char[] getCharsFromString(String st ){
      char[] charArray=new char[st.length()];
	   for (int i = 0; i < st.length(); i++) {
            charArray[i] = st.charAt(i);
        }
        return charArray;
	  
   }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
	
   public static  void main (String[] args){
      Scanner input=new Scanner(System.in);  
	                      
	  System.out.println("enter a string: ");
	  String st=input.next();
	  
	  char[] userDefine=getCharsFromString(st);
	  char [] builtInChars=st.toCharArray();
	  
	  boolean areEqual=compareCharArrays(userDefine, builtInChars);
	  
	  System.out.println("Are the arrays equal? "+ areEqual);
	  
   }
}