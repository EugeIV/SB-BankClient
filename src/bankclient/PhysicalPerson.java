package bankclient;

public class PhysicalPerson extends Client
{

    public PhysicalPerson()
    {
        bankAccount = (int) (1000 + Math.random() * 1000);
    }
}
