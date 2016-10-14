
package pe.edu.ulima.creditosulima;

public class ULimaValidador {
    // Metodo que nos dice si se le realiza el prestamo a un alumno.
    // La funcionalidad de esta clase debe ser independiente de la central
    // de riesgo utilizada.
    private static ULimaValidador singleton = null;
    
    public static ULimaValidador getInstance(){
        if(singleton == null){
            singleton = new ULimaValidador();
        }
        return singleton;
    }
    
    private ULimaValidador(){}
    
    public boolean esSujetoCredito(Alumno alumno){
        return false;
    }
}
