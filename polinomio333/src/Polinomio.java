public class Polinomio {
    private NodoTermino punta;

    public Polinomio() {
        punta = null;
    }
    //------------------------------------------------------------------
    public void setPunta(NodoTermino punta) {
        this.punta = punta;
    }

    public NodoTermino getPunta() {
        return punta;
    }
}
