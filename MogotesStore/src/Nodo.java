public class Nodo {
    private Nodo liga;
    private String nombre;
    private String genero;
    private String campana;
    private int horas;
    private boolean estado;

    //--------------------------------------------------------------
    public Nodo(){

    }

    public Nodo(String nombre, String genero, String campana, int horas, boolean estado) {
        this.nombre = nombre;
        this.genero = genero;
        this.campana = campana;
        this.horas = horas;
        this.estado = estado;
    }
    public Nodo(Nodo liga){
        this.liga = liga;
    }

    //------------------------------------------------------------------

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}
