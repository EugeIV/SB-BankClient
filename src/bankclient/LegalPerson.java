package bankclient;

public class LegalPerson extends Client
{
    private int FEE = 100;

    public LegalPerson()
    {
        bankAccount = (int) (2000 + Math.random() * 1000);
    }

    public void takeTheMoney(double money)
    {
        super.takeTheMoney(money + money / FEE);
    }
}
