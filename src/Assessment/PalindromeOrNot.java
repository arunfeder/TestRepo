package Assessment;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeOrNot {


    public static void main(String[] args) {
try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string");
    String inputString = sc.next();
    String reverseString="";
    int lengthOfInputString=inputString.length();

    for(int i=lengthOfInputString-1;i>=0;i--)
    {
        reverseString = reverseString+inputString.charAt(i);
    }

    if(reverseString.toLowerCase().equals(inputString.toLowerCase()))
    {
        System.out.println("Given input is Palindrome");

    }

    else
    {
        System.out.println("Given input is not Palindrome");
    }

}catch(Exception e)
{
    System.out.println("Exeception");
}


}
}

