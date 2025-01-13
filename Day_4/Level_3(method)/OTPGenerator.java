import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class OTPGenerator {

    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//making "input" as Scanner class object
        Scanner input = new Scanner(System.in);
        int[] otps = new int[10];
        
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique!");
        } 
		else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}