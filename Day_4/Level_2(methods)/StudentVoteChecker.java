import java.util.*;

public class StudentVoteChecker {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
		
        for (int i = 0; i < 10; i++) {
		
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
			
            System.out.println(canStudentVote(ages[i]) ? "Can vote" : "Cannot vote");
        }
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}