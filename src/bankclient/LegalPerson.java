package bankclient;

public class LegalPerson extends Client {
    private int FEE = 100;

    public LegalPerson() {
        bankAccount = ++count;
    }

    public void takeTheMoney(double money) {
        super.takeTheMoney(money + money / FEE);
    }
}
