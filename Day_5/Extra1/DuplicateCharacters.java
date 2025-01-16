import java.lang.*;
import java.util.*;
public class DuplicateCharacters{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   String s=sc.nextLine();
	   
	   String empty="";
	   
	   LinkedHashSet<Character>st=new LinkedHashSet<>();
	   for(int i=0;i<s.length();i++){
	      st.add(s.charAt(i));
	   }
	   for(char i : st){
	      empty+=i;
	   
	   }
	   System.out.println(empty);
	   
	   
	}
}