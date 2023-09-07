package Assessment;

import java.util.Scanner;

public class ReplaceWhiteCharacters {

    static void removeWhiteCharacters(String inp)
    {

        char c=' ';
        System.out.println(inp);
        System.out.println(inp.length());
        String output="";
        for(int i =0 ;i<inp.length();i++)
        {
            if(inp.charAt(i)==c)
            {
                continue;
            }
            else
            {
                output=output+inp.charAt(i);
            }
        }
        System.out.println("output sting is "+ output);
    }

    public static void main(String[] args) {
        System.out.println("Enter the input string");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        removeWhiteCharacters(input);

    }
}
