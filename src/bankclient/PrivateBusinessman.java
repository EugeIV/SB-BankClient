package bankclient;

public class PrivateBusinessman extends Client
{

    private int FEE_1 = 100;
    private double FEE_05 = 0.5 / 100;

    public PrivateBusinessman()
    {
        bankAccount = (int) (3000 + Math.random() * 1000);
    }

    public void putTheMoney(double money)
    {
        if (money < 1000)
        {
            super.putTheMoney(money - money / FEE_1);
        }
        else
        {
            super.putTheMoney(money - money * FEE_05);
        }
    }
}
