public class Q2 {

    public static void main(String[] args) {

        //write a program that reads in a string from the user and uses a loop to reverse the order of the characters in
        // the string. then output the reversed string.

        String s1 = "palindrome";
        String reverse = " ";

        for (int i = s1.length()-1; i>=0; i--) {
            char c = s1.charAt(i);
            reverse = reverse + c;
        }
        System.out.println(reverse);
    }
}
