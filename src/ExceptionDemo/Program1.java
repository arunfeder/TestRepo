package ExceptionDemo;

import java.io.FileInputStream;

public class Program1  {

    public int divide(int a , int b)
    {
        return a/b;

    }

    public static void main(String[] args)  {
        Program1 pgm = new Program1();
        pgm.divide(5,0);


    }
}
