import javax.swing.*;
import java.util.Comparator;
import java.util.Arrays;

public class videoJuego {
    private String titulo;
    private int horas;
    private boolean estado;
    private String genero;
    private String campana;//campaña
    videoJuego vect[];

    //---------------------------------------------Constructores solicitados
    public videoJuego(){//Estados por defecto
        this.horas = 10;
        this.estado = false;
    }
    public videoJuego(String titulo ,int horas){//Constructor con tutulo y horas
        this.titulo = titulo;
        this.horas = 10;
    }

    public videoJuego(String titulo, int horas, String genero, String campana) {
        //Un constructor con todos los atributos menos el del estado
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.campana = campana;
    }

    //------------------------------------Uso de setters and getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCampana() {
        return campana;
    }

    public void setCampana(String campana) {
        this.campana = campana;
    }

    public videoJuego[] getVect() {
        return vect;
    }

    public void setVect(videoJuego[] vect) {
        this.vect = vect;
    }

    //------------------------Metodos
    public void eliminarJuego(videoJuego []vect, String juegoAElim){
        int posAElim = -1;
        for(int i=0; i< vect.length;i++){//recorremos el vector buscando al objeto
            if(vect[i] != null && vect[i].getTitulo().equals(juegoAElim)){
                //EL metodo toString() es una funcion de java para obtener una representacion de una cadena
                posAElim = i;
                break;
            }
        }

        if(posAElim !=-1){//Lo encontró
            for(int i=posAElim +1; i< vect.length; i++){
                vect[i-1] = vect[i];
            }
            vect[vect.length-1] = null;
            vect = Arrays.copyOf(vect, vect.length -1);
            JOptionPane.showMessageDialog(null, "El juego ha sido eliminado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El juego no ha sido eliminado porque no se ha encontrado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void modificarGame(videoJuego[] vect, String juegoACambiar) {
        //Asi como en el metodo eliminar buscamos el objeto dentro del vector
        int posACambiar = -1;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] != null && vect[i].getTitulo().equals(juegoACambiar)) {
                posACambiar = i;
                break;
            }
        }

        if(posACambiar != -1) {
            // Creamos un nuevo objeto y actualizamos sus atributos y asi poder insertarlos :)
            videoJuego game = new videoJuego();
            game.setTitulo(JOptionPane.showInputDialog("Ingrese el nuevo titulo del juego"));
            game.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las nuevas horas del juego")));
            game.setGenero(JOptionPane.showInputDialog("Ingrese el nuevo genero del juego"));
            game.setCampana(JOptionPane.showInputDialog("Ingrese la nueva compañia del juego"));
            boolean nuevoEstado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el nuevo estado del juego\n(true para prestado, false para no prestado): "));
            game.cambiarEstado(nuevoEstado);

            // Reemplazamos el objeto deseado
            vect[posACambiar] = game;
            JOptionPane.showMessageDialog(null, "El juego ha sido modificado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "El juego no ha sido encontrado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cambiarEstado(boolean estado) {
        this.estado = estado;
    }

    public void verJuegos(videoJuego[] vect) {
        String listaJuegos = "";//Esta la usamos para concatenar y poder mostrarla
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] !=null){//Evaluamos que el elemento no sea nulo
                listaJuegos += "Titulo: "+vect[i].getTitulo()+"\nHoras: "+vect[i].getHoras()+"\nGenero: "+vect[i].getGenero()+"\nCampaña: "+vect[i].getCampana()+"\nEstado del juego: "+(vect[i].isEstado() ? "Prestado\n\n" : "Disponible\n\n");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se mostraran juegos Borrados", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, listaJuegos, "Lista de Juegos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void rankingPorHoras(videoJuego[] vect) {
        // Creamos una copia del vector original
        videoJuego[] copiaVect = Arrays.copyOf(vect, vect.length);

        // Ordenamos la copia del vector por horas en forma descendente
       Arrays.sort(copiaVect, new Comparator<videoJuego>() {
           @Override
           public int compare(videoJuego juego1, videoJuego juego2) {
               if(juego1 == null || juego2 == null){
                   return 0;
               }
               return juego2.getHoras() - juego1.getHoras();
           }
       });

        // Mostramos en pantalla el ranking de juegos por horas
        String listaJuegos = "";
        for (int i = 0; i < copiaVect.length; i++) {
            if(copiaVect[i] != null) {
                listaJuegos += "Puesto "+(i +1) + " Titulo :"+copiaVect[i].getTitulo()+"\nHoras: "+copiaVect[i].getHoras()+"\n\n";
            } else {
                JOptionPane.showMessageDialog(null, "No se mostraran juegos Borrados", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, listaJuegos, "RANKING DE VIDDEO JUEGOS", JOptionPane.INFORMATION_MESSAGE);
    }

}