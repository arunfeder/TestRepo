package Assessment;



import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToTheEndOfArray {
    static int arr[] = {1,2,0,8,5,9,4,10,0,5,0,0,4,0};


    public static void moveZeroesToTheEnd( )
    {
        Arrays.sort(arr);
        System.out.println("Out ut is as follows");
        System.out.print("[");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println(" ]");

    }

    public static void main(String[] args) {

        moveZeroesToTheEnd();
    }
}
