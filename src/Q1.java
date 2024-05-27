public class Q1 {

    public static void main(String[] args) {

        //write a program to check whether the given string is palindrome or not using for loop and if else statement
String s1 = "hello world";
String reverse = " ";

for (int i = s1.length()-1; i>=0; i--) {
    char c = s1.charAt(i);
    reverse = reverse + c;
}
        System.out.println(reverse);

if (s1.equals(reverse)) {
    System.out.println("Given string is a palindrome");
}  else {
    System.out.println("Given string is not a palindrome");
}


    }
}
