public class ConstructorDemo {
    ConstructorDemo()
    {
        System.out.println("i am constructor");
    }

    public void ConstructorDemo(int a)
    {
        System.out.println("i am constructor 1 " );
    }

    ConstructorDemo(float a)
    {
        System.out.println("i am constructor 2 ");
    }

     ConstructorDemo(int a, int b)
    {
        System.out.println("i am constructor 3");
    }


    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(1,2);
    }
}
