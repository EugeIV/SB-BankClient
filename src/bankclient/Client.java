package bankclient;

public abstract class Client
{

    public int bankAccount;
    private double money;

    public double howMuchMoney(int bankAccount)
    {
        System.out.println("На счету " + bankAccount + ": " + money);
        return money;
    }

    public void putTheMoney(double money)
    {
        this.money += money;
        System.out.println("Внесена сумма: " + money);
    }

    public void takeTheMoney(double money)
    {
        this.money -= money;
        System.out.println("Снята сумма: " + money);
    }
}
