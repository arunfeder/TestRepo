package Assessment;

import java.util.Scanner;

public class VowelsInString {
    private static void findVowels(String input) {
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='a')
            {
                System.out.println(input.charAt(i)+"  is vowel");
            }
           else if(input.charAt(i)=='e')
            {
                System.out.println(input.charAt(i)+"  is vowel");
            }

            else if(input.charAt(i)=='i')
            {
                System.out.println(input.charAt(i)+"  is vowel");
            }
            else if(input.charAt(i)=='o')
            {
                System.out.println(input.charAt(i)+"  is vowel");
            }
            else if(input.charAt(i)=='u')
            {
                System.out.println(input.charAt(i)+"  is vowel");
            }

            else
            {
                System.out.println(input.charAt(i)+"  is not a vowel");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter your input string");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        findVowels(input);
    }


}
