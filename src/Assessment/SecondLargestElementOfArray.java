package Assessment;

public class SecondLargestElementOfArray {
    static int arr[] = {3, 2, 48, 7, 48,80,104,96};
    static int barr[]=new int[arr.length];
    static int temp;
    static int findTheSecondLargest()
    {

        arrangeInputArray();
        for (int i = 0; i < barr.length; i++) {
            for (int j = 0; j < barr.length; j++) {
                if (barr[i] > barr[j]) {
                    temp = barr[j];
                    barr[j] = barr[i];
                    barr[i] = temp;
                }

            }
        }
        System.out.println("");
        System.out.print("second largest element is ");
        return barr[1];
    }

    static void arrangeInputArray()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    barr[i]=arr[i];
                }
            }
            System.out.print(" "+barr[i]);
        }
    }




    public static void main(String[] args) {
        System.out.println(findTheSecondLargest());
    }
}
