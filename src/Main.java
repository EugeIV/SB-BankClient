import bankclient.Client;
import bankclient.LegalPerson;
import bankclient.PhysicalPerson;
import bankclient.PrivateBusinessman;

public class Main {
    public static void main(String[] args) {
        Client client = new PhysicalPerson();
        Client client1 = new PhysicalPerson();
        Client client2 = new LegalPerson();
        Client client3 = new PrivateBusinessman();
        Client client4 = new PrivateBusinessman();
        System.out.println(client.bankAccount);
        client.putTheMoney(10000);
        client.takeTheMoney(1500);
        client.howMuchMoney(client.bankAccount);
        System.out.println();
        System.out.println(client1.bankAccount);
        client1.putTheMoney(20000);
        client1.takeTheMoney(4000);
        client1.howMuchMoney(client1.bankAccount);
        System.out.println();
        System.out.println(client2.bankAccount);
        client2.putTheMoney(30000);
        client2.takeTheMoney(3000);
        client2.howMuchMoney(client2.bankAccount);
        System.out.println();
        System.out.println(client3.bankAccount);
        client3.putTheMoney(900);
        client3.howMuchMoney(client3.bankAccount);
        System.out.println();
        System.out.println(client4.bankAccount);
        client4.putTheMoney(10000);
        client4.howMuchMoney(client4.bankAccount);
    }
}
