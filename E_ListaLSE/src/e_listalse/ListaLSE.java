
package e_listalse;

public class ListaLSE {
    
    private Estudiante punta;

    public ListaLSE(Estudiante punta) {
        punta = null;
    }

    public void setPunta(Estudiante punta) {
        this.punta = punta;
    }

    public Estudiante getPunta() {
        return punta;
    }
    
    public float prome_notas(){
        
    }
    
    public int Total_gana(){
        
    }

    public int Total_perde() {
        if(listaVacia()){
            return 0;
        }
        else{
            int contador = 0;
            float promedio = prome_notas();

            Estudiante actual = punta;
            while(actual !=null){
                float definitiva = actual.definitiva();
                if(definitiva < promedio){
                    contador++;
                }
                actual = actual.getLiga();
            }
            return contador;
        }
    }

    public int mayor_edad(){
        
    }
    
    public boolean Insertar_archi(){
        
    }
    
    public boolean Insertar_orde(){
        
    }
    
    public boolean Ordenar_nom(){
        
    }
    
    public void mostrarlista(){
        
    }
    public boolean cancelar_cur() {
        if(listaVacia()){
            return false;
        }
        else{
            boolean eliminado = false;
            float promedio = prome_notas();
            Estudiante actual = punta;
            Estudiante previo = null;
            int posicion = 1;

            while(actual != null){
                float definitiva = actual.definitiva();
                if(definitiva < promedio){
                    if(previo == null){
                        punta = actual.getLiga();
                    }
                    else{
                        previo.setLiga(actual.getLiga());
                    }
                    System.out.println("Estudiante eliminado por no ponerse las pilas en la pos "+posicion+" :");
                    actual.mostrar_datos_est();
                    eliminado = true;
                }
                previo = actual;
                actual = actual.getLiga();
                posicion++;
            }
            if(!eliminado){
                System.out.println("No se encontraron estudiantes con nota inferior al promedio");
                return false;
            }
            return true;
        }
    }


    public boolean listaVacia(){
        if(punta == null){
            return true;
        }
        else{
            return false;
        }
    }
}
