

//import model.Wallet;

public class Transaction {
    private int amount;
    private String fecha;
    private String description;

    /**
     * Tipo de transacción 1 Ingreso de dinero 2 Retiro de dinero
     */
    private int type;

    /**
     * Método que construye un objeto de la clase Transaction <br>
     * 
     * @param amount valor del movimiento
     * @param fecha en la cual se realiza el movimiento
     * @param type 1 == Ingreso, 2 == retiro
     * @param description
     */
    public Transaction(int amount, String fecha, int type, String description) {
        super();
        this.amount = amount;
        this.fecha = fecha;
        this.type = type;
        this.description = description;
        
    }

    /**
     * Retorna el valor del movimiento
     * @return
     */
    public int getAmount() {
        return amount;
    }
    public String getFecha() {
        return fecha;
    }
    public int getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
    public String toString(){
        return "Monto: $"+amount+ ", Fecha: "+fecha+ ", Tipo: "+((type == 1)?"Ingreso":"Egreso")+", Descripcion: "+description;

    }
    
    


}