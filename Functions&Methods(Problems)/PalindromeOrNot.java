import java.util.*;
public class PalindromeOrNot{
    public static void main(String args[]) {
    System.out.println("Please Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPalindrome(num)) {
    System.out.println("Number : " + num + " is a palindrome");
    }
    else {
    System.out.println("Number : " + num + " is not a palindrome");
    }   
    }
    public static boolean isPalindrome(int num){
        int rev = 0;
        while (num != 0) {
        int lastdigit = num % 10;
        rev = rev * 10 + lastdigit;
        num = num / 10;
        }
        if(num == rev) {
        return true;
        }
        return false;
        }

}
