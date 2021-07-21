//package test;
//import model.Client;

public class Test {

    public static void main(String[] args) {
        
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();

    }

    public void escenarioClient(){
        Cliente cliente1 = new Client("Armando");
        boolean test1 = assertEquals("Armando", cliente1.getNombre());
        // operador ternario de java: (condition)? responseTrue: responseFalse
        System.out.println((test1)? "Pasó la prueba de nombre": "Error en el nombre, no es igual");
        
    }

    public boolean assertEquals(String expected, String received){
        if (expected.equalsIgnoreCase(received)) {
            return true;
        }
        return false;
    }

    public boolean assertNotNull (object object ){
        if (object != null){
            return true;
    }
    return false;
    }
    
}
