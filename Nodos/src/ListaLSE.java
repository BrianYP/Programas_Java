import static java.nio.file.Files.delete;

public class ListaLSE {
    private Nodo punta;

    //-------------------------------------------------------CONSTRUCTOR
    public ListaLSE(){
        Nodo punta = null;
    }

    //-------------------------------------------------------SETTERS AND GETTERS

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }

    //------------------------------------------------------METODOS
    public boolean ListaVacia(){//Metodo para la lista vacia
        if(punta == null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean InsertarAPrincipio(Nodo nuevo){//Insertar al principio de la lista
        nuevo.setLiga(punta);

        if(ListaVacia()){
            punta = nuevo;
        }
        else{
            nuevo.setLiga(punta);
            punta = nuevo;
        }
        return true;
    }

    public boolean InsertarAFinal(Nodo nuevo){//metodo para insertar al final de la lista
        if(ListaVacia()){
            punta = nuevo;
        }
        else{
            Nodo p = punta;
            while(p.getLiga() !=null){
                p = p.getLiga();
            }
            p.setLiga(nuevo);
        }
        return true;
    }

    public Nodo buscarListaDesordenada(String info) {//Buscar en la lista desordenada
        if (ListaVacia()) {
            return null;
        }
        else {
            Nodo ant = null;
            Nodo p = punta;
            while (p != null && !p.getContenido().equals(info)) {
                ant = p;
                p = p.getLiga();
            }

            if (p != null) {
                return p;
            } else {
                return null;
            }
        }
    }

    public boolean buscarListaOrdenada(String info) {//Metodo para buscar lista ordenada
        if (ListaVacia()) {
            return false;
        } else {
            Nodo ant = null;
            Nodo p = punta;
            while (p != null && p.getContenido().compareTo(info) < 0) {
                ant = p;
                p = p.getLiga();
            }

            if (p != null && p.getContenido().equals(info)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean InsertarPorRefe(Nodo nuevo, String infoRefe) {//Metodo para insertar por referencia
        Nodo ant = new Nodo();

        if (ListaVacia()) {
            punta = nuevo;
        } else {
            ant = buscarListaDesordenada(infoRefe);
            if (ant == null) {
                return false;
            } else {
                nuevo.setLiga(ant.getLiga());
                ant.setLiga(nuevo);
            }
        }
        return true;
    }

    public int contarNodos() {//Contar numero de nodos dentro de la lista
        int contador = 0;
        Nodo p = punta;
        while (p != null) {
            contador++;
            p = p.getLiga();
        }
        return contador;
    }

    public void imprimirLista() {//Mostrar la lista (imprimir)
        Nodo p = punta;
        while (ListaVacia()) {
            System.out.print(p.getContenido() + " ");
            p = p.getLiga();
        }
    }

    public boolean borrarPorReferencia(String infoRefe) {
        Nodo ant = null;
        Nodo p = punta;


        while (p != null && !p.getContenido().equals(infoRefe)) {
            ant = p;
            p = p.getLiga();
        }

        if (p == null) {
            return false;
        } else if (ant == null) {
            punta = punta.getLiga();
        } else {
            ant.setLiga(p.getLiga());
        }

        return true;
    }

    //--------------------------------------------------------------Nuevos metodos agregados

    public boolean borrarListaLSEPunta() {
        Nodo aux;

        if (ListaVacia()) {
            return false;
        } else {
            aux = punta;
            punta = punta.getLiga();
            aux.setLiga(null);
        }
        return true;
    }

    public boolean borrarListaLSEUltimo() {
        Nodo aux = null, p = punta;

        if (ListaVacia()) {
            return false;
        } else {
            while (p.getLiga() != null) {
                aux = p;
                p = p.getLiga();
            }
            if (aux == null) {
                punta = null;
            } else {
                aux.setLiga(null);
            }
            p.setLiga(null);
            return true;
        }
    }

    public boolean borrarPorPosicion(int pos) {
        Nodo aux, p;
        int contador = 1;

        if (ListaVacia()) {
            return false;
        } else {
            if (pos == 0) {
                aux = punta;
                punta = punta.getLiga();
                delete(aux);
            } else {
                p = punta;
                aux = null;
                while (contador < pos && p.getLiga() != null) {
                    aux = p;
                    p = p.getLiga();
                    contador++;
                }
                if (contador == pos) {
                    aux.setLiga(p.getLiga());
                    delete(p);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public void delete(Nodo nodo) {
        nodo.setContenido(null);
        nodo.setLiga(null);
    }

}
