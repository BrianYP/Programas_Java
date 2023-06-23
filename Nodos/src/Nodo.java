public class Nodo {
    private Nodo liga;
    private String contenido;

    //------------------------------------------------------------CONSTRUCTORES
    public Nodo(){//constructor por defecto
        setLiga(null);
        setContenido(null);
    }
    public Nodo(String c){//constructor parametros de contenido
        setLiga(null);
        setContenido(c);
    }
    public Nodo(String c, Nodo n){//constructor con los dos parametros de contenido y nodo siguiente
        setLiga(n);
        setContenido(c);
    }

    //-----------------------------------------------------------GETTERS AND SETTERS

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
