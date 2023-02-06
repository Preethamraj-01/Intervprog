package Dsa;

public class Palindromewhile {
    public static void main(String[] args) {

        String s = "madam";

        char c[] = s.toCharArray();
        int n = c.length;
        int start = 0;
        int end = n - 1;


        while (start < end) {
            if (c[start] != c[end]) {
                System.out.println("NOT A PALINDROME");
                break;
            } else {
                start++;
                end--;
            }
            if(start==(n/2))
            System.out.println("PALINDROME");
        }

    }
}