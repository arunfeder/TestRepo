package Hdfc;


public class transaction implements  SBI
{


    @Override
    public void payUsingCash() {
        System.out.println("successfull using cash");

    }

    @Override
    public void payUsingCreditCard() {
        System.out.println("successfull using card");

    }

    @Override
    public void payUsingUPI() {
        System.out.println("suu");
    }
}