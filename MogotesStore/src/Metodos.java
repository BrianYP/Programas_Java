import javax.swing.*;

public class Metodos {
    ListaLSE lse = new ListaLSE();
    public boolean listaVacia() {
        if (lse.getPunta() == null) {
            return true;
        } else {
            return false;
        }
    }
    public void delete(Nodo n){
        n.setLiga(null);
        n.setNombre(null);
        n.setGenero(null);
        n.setCampana(null);
        n.setHoras(0);
        n.setEstado(false);
    }

    public int contarNodo(){
        int contador = 0;
        Nodo p = lse.getPunta();
        while(p !=null){
            contador++;
            p = p.getLiga();
        }
        return contador;
    }

    public void imprimirLista() {
        Nodo p = lse.getPunta();
        if (p == null) {
            JOptionPane.showMessageDialog(null, "No hay juegos en la lista", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            while (p != null) {
                JOptionPane.showMessageDialog(null, "Nombre: " + p.getNombre() + "\nGenero: " + p.getGenero() +
                        "\nHoras: " + p.getHoras() + "\nEstado: " + (p.isEstado() ? "Prestado\n" : "Disponible\n") + "Campaña: " + p.getCampana());
                p = p.getLiga();
            }
        }
    }

    public boolean insertarPrincipio(Nodo nuevo){
        nuevo.setLiga(lse.getPunta());

        if(listaVacia()){
            lse.setPunta(nuevo);
        }
        else{
            nuevo.setLiga(lse.getPunta());
            lse.setPunta(nuevo);
        }
        return true;
    }

    public boolean insertarFinal(Nodo nuevo){
        if(listaVacia()){
            lse.setPunta(nuevo);
        }
        else{
            Nodo p = lse.getPunta();
            while(p.getLiga() !=null){
                p = p.getLiga();
            }
            p.setLiga(nuevo);
        }
        return true;
    }

    public Nodo buscarListaDesordenada(String info){
        if(listaVacia()){
            return null;
        }
        else{
            Nodo ant = null;
            Nodo p = lse.getPunta();
            while(p != null && !p.getNombre().equals(info)){
                ant = p;
                p = p.getLiga();
            }
            if(p != null){
                return p;
            }
            else{
                return null;
            }
        }
    }

    public boolean buscarListaOrdenada(String info){
        if(listaVacia()){
            return false;
        }
        else{
            Nodo ant = null;
            Nodo p = lse.getPunta();
            while(p !=null && p.getNombre().compareTo(info) <0){
                ant = p;
                p = p.getLiga();
            }
            if(p != null && p.getNombre().equals(info)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public boolean borarPorRefe(String infoRefe){
        Nodo ant = null;
        Nodo p = lse.getPunta();

        while(p != null && !p.getNombre().equals(infoRefe)){
            ant = p;
            p = p.getLiga();
        }
        if(p == null){
            return false;
        }
        else if(ant == null){
            lse.setPunta(p.getLiga());
        }
        else{
            ant.setLiga(p.getLiga());
        }
        return true;
    }

    public void modificarGame(String name) {
        Nodo p = lse.getPunta();
        while (p != null) {
            if (p.getNombre().equals(name)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que aspectos desea cambiar del juego?\n"+
                        "1. Cambiar nombre\n"+
                        "2. Cambiar genero\n" +
                        "3. Cambiar la compañia\n"+
                        "4. Cambiar horas\n"+
                        "5. Cambiar estado\n"+
                        "0. Cancelar modificación\n"+
                        "Seleccione una opción"));
                switch (opcion) {
                    case 1:
                        p.setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre del juego"));
                        break;
                    case 2:
                        p.setGenero(JOptionPane.showInputDialog("Ingrese el nuevo género del juego"));
                        break;
                    case 3:
                        p.setCampana(JOptionPane.showInputDialog("Ingrese la nueva campaña del juego"));
                        break;
                    case 4:
                        p.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las nuevas horas de juego")));
                        break;
                    case 5:
                        p.setEstado(Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el nuevo estado del juego\n(true para prestado, false para no prestado)")));
                        break;
                    case 0:
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                        break;
                }
                break;
            }
            p = p.getLiga();
        }
        if (p == null) {
            JOptionPane.showMessageDialog(null, "El juego no se encontró");
        }
    }

    public void ranking(){
        if(listaVacia()){
            JOptionPane.showMessageDialog(null, "La lista está vacía.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int n = contarNodo();
            Nodo[] juegos = new Nodo[n];
            Nodo p = lse.getPunta();

            for (int i = 0; i < n; i++) {
                juegos[i] = p;
                p = p.getLiga();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (juegos[j].getHoras() < juegos[j+1].getHoras()) {
                        Nodo temp = juegos[j];
                        juegos[j] = juegos[j+1];
                        juegos[j+1] = temp;
                    }
                }
            }

            String mensaje = "";
            for (int i = 0; i < n; i++) {
                mensaje += "Nombre: " + juegos[i].getNombre() + "\n";
                mensaje += "Genero: " + juegos[i].getGenero() + "\n";
                mensaje += "Compañia: " + juegos[i].getCampana() + "\n";
                mensaje += "Horas: " + juegos[i].getHoras() + "\n";
                mensaje += "Estado: " + (juegos[i].isEstado() ? "Prestado\n\n" : "Disponible\n\n") + "\n";
                mensaje += "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Ranking de juegos por horas", JOptionPane.INFORMATION_MESSAGE);

        }
    }

}
