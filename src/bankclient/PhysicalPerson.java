package bankclient;

public class PhysicalPerson extends Client {

    public PhysicalPerson() {
        bankAccount = ++count;
    }
}
