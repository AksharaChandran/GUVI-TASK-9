public class Q3 {

    public static void main(String[] args) {

        int n = 1; // Starting number
        for (int i = 1; i <= 4; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop through each column in the row
                System.out.print(n + " "); // Print the current number
                n++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }


}
