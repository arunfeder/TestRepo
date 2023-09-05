package Assessment;

public class LargestOfArray {

   static int arr[]={1,50,25,205,34,28,199};


    public static int largestOfArrayFunction()
    {
        int largest = arr[0];//
        for (int i = 0; i < arr.length-1; i++)
        {
               for(int j=i+1;j<arr.length;j++)
               {
                   if (arr[j] >= largest)
                   {
                       largest = arr[j];//code
                   }

               }
            }

        return largest;

    }

    public static int smallestOfArrayFunction()
    {
        int smallest = arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j] <= smallest)
                {
                    smallest = arr[j];
                }

            }
        }

        return smallest;

    }
    public static void main(String[] args) {

        System.out.println("Largest number of the array is "+largestOfArrayFunction());

        System.out.println("Smallest number of the array is "+smallestOfArrayFunction());

    }
}
