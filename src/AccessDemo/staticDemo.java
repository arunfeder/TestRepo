package AccessDemo;

class A
{

    static int method(int a , int b){

        try {
            return a / b;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
       method(1,0);
    }

}


