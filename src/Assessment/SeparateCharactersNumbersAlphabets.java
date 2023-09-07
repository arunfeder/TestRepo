package Assessment;

import java.util.Scanner;

public class SeparateCharactersNumbersAlphabets {

    static StringBuffer num = new StringBuffer();
    static StringBuffer alpha = new StringBuffer();
    static StringBuffer chara = new StringBuffer();

    private static void separateCharNumAlpha(String input)
    {
        for(int i=0;i<input.length();i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                num.append(input.charAt(i));
            }

            else if(Character.isAlphabetic(input.charAt(i)))
            {
                alpha.append(input.charAt(i));
            }

            else
            {
                chara.append(input.charAt(i));
            }
        }
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(chara);

    }
    public static void main(String[] args) {
        System.out.println("Enter your input String");
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        separateCharNumAlpha(input);


    }
}
