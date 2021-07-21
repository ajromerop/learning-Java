import java.util.ArrayList;

//package model;

public class Wallet {

    public static final int CAPACIDAD_MAXIMA = 1000000; // POR CONVENCIÓN ES UNA CONSTANTE Y POR TANTO VA EN MAYUSCULA

    private int saldo;
    private boolean tieneLimite;
    private int meta;

    /**
     *Listas
     */

    private ArrayList<Transaction> movimientos;


    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
        movimientos = new ArrayList<>();
    }

    public int getSaldo() {// los metos de accesibilidad traen valores y se haven con get
        return saldo;
    }

    public boolean getTieneLimite() {
        return tieneLimite;
    }

    public boolean establecerMeta(int value) {
        if (value == 0) {
            meta = value;
            return true;
        }
        if (value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)) {
            return false;
        }
        meta = value;
        return true;
    }

    public boolean verificarMeta() {
        if (meta == 0 || meta > saldo) {
            return false;
        }
        return true;
    }

    // cambiar los valores de un atributo con set
    public void setTieneLimite(boolean newTieneLimite) {
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value) {
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
            return "no se puede superar el límite " + CAPACIDAD_MAXIMA;
        }
        saldo += value;// saldo = saldo + value
        Transaction ingreso = new Transaction(value, "hoy", 1, "Ingreso de dinero");
        movimientos.add(ingreso);
        if (verificarMeta()) {
            System.out.println("Has cumplido la meta");
        }
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value) {
        if (saldo >= value) {
            saldo -= value;
            Transaction retiro = new Transaction(value, "hoy", 2, "Egreso de dinero");
            movimientos.add(retiro);
            return "Transacción exitosa, nuevo saldo " + saldo;
        }
        return "Saldo insuficiente";
    }

    public String breakLimite() {
        if (!tieneLimite) {
            return "Tu cuenta no tiene limites!";
        }
        if (saldo >= 10000) {
            saldo -= 10000;
            setTieneLimite(false);
            Transaction limite = new Transaction(10000, "hoy", 2, "romperlimites");
            movimientos.add(limite);
            return "Has roto los limites!";

        }
        return "No tienes saldos suficiente:(";
    }

    public String compararCuenta(Wallet otraWallet) {
        if (saldo == otraWallet.getSaldo()) {
            return "las cuentas tienen el mismo saldo";
        }
        if (saldo > otraWallet.getSaldo()) {
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
    }
    public void displayMovimientos(){
        for (Transaction movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }
}
