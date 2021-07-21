//package model;
//import model.Wallet;

public class Cliente extends User { // Cliente hereda de ser
    private Wallet wallet;

    public Cliente(String pNombre) {
        super();
        wallet = new Wallet();
        setNombre(pNombre);
    }
    public Wallet getWallet() {
        return wallet;
    }
    
}
