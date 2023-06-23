public class Nodo {
    String codigo;
    String nombre;
    Nodo ligaSig;
    Nodo ligaAnt;
    Nodo punta;

    //-------------------------------------------------------------
    public Nodo(String codigo, String nombre){

    }

    public Nodo(String codigo, String nombre, Nodo ligaSig, Nodo ligaAnt, Nodo punta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ligaSig = ligaSig;
        this.ligaAnt = ligaAnt;
        this.punta = punta;
    }
    //---------------------------------------------------------------

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String datos) {
        this.codigo = datos;
    }

    public Nodo getLigaSig() {
        return ligaSig;
    }

    public void setLigaSig(Nodo ligaSig) {
        this.ligaSig = ligaSig;
    }

    public Nodo getLigaAnt() {
        return ligaAnt;
    }

    public void setLigaAnt(Nodo ligaAnt) {
        this.ligaAnt = ligaAnt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }
}
