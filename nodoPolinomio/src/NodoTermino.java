public class NodoTermino {
    private NodoTermino liga;
    private int exponente;
    private  float coeficiente;
    //-----------------------------------------------------------------------
    public NodoTermino(float coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        liga = null;
    }

    public NodoTermino() {
        this.coeficiente = 0;
        this.exponente = 0;
        this.liga = null;
    }
    //------------------------------------------------------------------------

    public NodoTermino getLiga() {
        return liga;
    }

    public void setLiga(NodoTermino liga) {
        this.liga = liga;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(float coeficiente) {
        this.coeficiente = coeficiente;
    }
}
