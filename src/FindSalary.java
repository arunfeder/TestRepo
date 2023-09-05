 class logintoAPP
{
    String Key = "loginid";

    private int creditCardNumber = 123456;

    int getCreditCardNumber(String Key)
    {
        System.out.println(this.Key);
        System.out.println(Key);
        if(this.Key == Key)
        {
            return creditCardNumber;
        }
        return 0;
    }

    void setCreditCardNumber(int creditCardNumberum)
    {
        this.creditCardNumber = creditCardNumberum;
        System.out.println(this.creditCardNumber);
    }

}

