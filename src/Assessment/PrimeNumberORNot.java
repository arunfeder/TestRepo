package Assessment;

public class PrimeNumberORNot {


    static void primeNumberOrNot()
    {
        int n=3;
        if(n<=0)
        {
            System.out.println("Enter other then 0 or negative numbers");
        }
        else if(n==1)
        {
            System.out.println("Neither Prime not composite");
        }

        else if(n%2 == 0)
        {
            System.out.println(n+ " is not a prime number");
        }
        else
        {
            System.out.println(n + " is Prime number");
        }
    }

    public static void main(String[] args) {
        primeNumberOrNot();
    }
}
