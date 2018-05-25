package Week3.Ex1;

import java.util.Scanner;

// Demonstrate static function calls
public class MaximumFinder {
    public static void main(String[] args) {

        // Create new instance of Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter in values
        System.out.print("Enter 3 floating-point values separated by spaces: ");

        // Read values from user
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1,num2,num3);

        System.out.println("Maximum is: "+result);
    }
    // Find the maximum value between 3 double values
    public static double maximum(double x, double y, double z){
        return Math.max(x,Math.max(y,z));
        /*
        double maxValue = x;
        if(y > maxValue)
            maxValue = y;
        if (z > maxValue)
            maxValue = z;
        return maxValue;
        */

    }
}
