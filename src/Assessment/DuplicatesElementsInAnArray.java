package Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesElementsInAnArray {


    public static void main(String[] args) {

        //Declare and initialize the array elements
        int[] array = { 2, 3, 5, 4, 4};

        //sorting an array
        Arrays.sort(array);
        System.out.println("These elements are repeated along with its frequency-");

        //call a user defined method
        duplicate(array);
    }

    //user defined method
    static void duplicate(int[] array){

        //declared the variables
        int i,j,frequency;

        //loop for logic implementation
        for(i=0; i<array.length; i++){
            frequency = 1;
            for(j=i+1; j<array.length; j++){
                if(array[j] == array[i]){
                    frequency++;
                } else {
                    break;
                }
            }
            i=j-1;
            if(frequency > 1){
                //printing the output
                System.out.println(array[i] + " repeated " + frequency+" times.");
            }
            else
            {
                System.out.println(array[i] + " repeated only " + frequency+" time.");
            }
        }
    }

}