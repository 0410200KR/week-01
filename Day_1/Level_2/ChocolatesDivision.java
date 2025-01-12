/*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
*/
import java.util.*;

public class ChocolatesDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolates = input.nextInt();
		
        System.out.print("Enter the number of children: ");
        int children = input.nextInt();
        
		//calculating number of chocolates per person
        int chocolatesPerChild = chocolates / children;
		
		// calculating remaining chocolates
        int remainingChocolates = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        
    }
}
