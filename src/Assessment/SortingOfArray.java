package Assessment;

public class SortingOfArray {
    static int arr[] = {1, 2, 50, 7, 50};
    static int temp;
   static int len = arr.length;

    static void sortFunction()
    {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

    }

    static void printArray()
    {
        sortFunction();
        System.out.print("[");
        for (int i = 0; i < len; i++) {

            System.out.print(" "+ arr[i]+",");

        }

        System.out.print("]");
    }
    public static void main(String[] args) {
        printArray();

    }

}
