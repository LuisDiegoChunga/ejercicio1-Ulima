package pe.edu.ulima.creditosulima;

public class EquitelULAdapter implements ULAdapter {

    @Override
    public void selLibreria(String tipo) {
        String dni = "";
        float deuda = 0.0f;
        
        if(tipo.equals("Equitel")){
            if(dni.equals("43454543")){
                deuda = 50000.0f;
            }else{
                deuda = 0.0f;
            }
        }
        
    }
    
}
