import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        int x = 300;
        int y = 800;
        int z = 100;

        // Find the largest number using conditional statements
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);
        }

    }

