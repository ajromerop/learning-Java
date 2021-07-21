//package views;
//import model.Client;
public class VistaUser {
    public static void main(String[] args) {
        Cliente customer1 = new Cliente("marco");
        Cliente customer2 = new Cliente("Armando");
        String response = customer1.getNombre();
        String response1 = customer2.getNombre();
        // System.out.println(response);
        // System.out.println(response1);
        System.out.println(customer1.getWallet().saveMoney(15000));
        System.out.println(customer1.getWallet().breakLimite());
        System.out.println(customer1.getWallet().saveMoney(15000));
        System.out.println(customer1.getWallet().takeMoney(20000));
        
        customer1.getWallet().displayMovimientos();

    }
}
