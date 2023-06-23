public class PolinomioF3 {
    private NodoTermino punta;

    public PolinomioF3() {
        punta = null;
    }

    public void setPunta(NodoTermino punta) {
        this.punta = punta;
    }

    public NodoTermino getPunta() {
        return punta;
    }
    //-----------------------------------------------------------------------
    public boolean polinomioVacio() {
        if (punta == null) {
            return (true);
        } else {
            return (false);
        }
    }

    public void insertarTermino(float coef, int exp){

        NodoTermino p = new NodoTermino();
        NodoTermino ant = new NodoTermino();

        float suma;
        ant = null;

        NodoTermino nuevo1 = new NodoTermino(coef,exp);
        if(polinomioVacio()){
            punta = nuevo1;

        }
        else {
            p = punta;
            NodoTermino q = new NodoTermino(coef,exp);
            while( p != null  && p.getExponente() > exp){
                ant = p;
                p = p.getLiga();
            }

            if((p != null && p.getExponente() < exp) && ant != null){

                ant.setLiga(q);
                q.setLiga(p);
            }

            else {
                if(p != null && p.getExponente() == exp){
                    suma  = p.getCoeficiente() + coef ;
                    if (suma != 0){
                        p.setCoeficiente(suma);
                    }
                    else{
                        ant.setLiga( p.getLiga() );
                    }
                }
                else {
                    if( p == punta){
                        q.setLiga(punta);
                        punta = q;
                    }
                    else {
                        if(p == null && ant != null){
                            ant.setLiga(q);
                        }
                    }
                }
            }
            mostrarPolinomio();
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
    }

    public boolean eliminarTermino( int exp){


        NodoTermino p = new NodoTermino();
        NodoTermino ant = new NodoTermino();
        boolean ban = true;

        ant = null;
        p = punta;

        while( p != null && p.getExponente() < exp){
            ant = p;
            p = p.getLiga();
        }
        if(p != null && p.getExponente() == exp ){
            ban = true;
            if(p == punta) {
                punta = p.getLiga();
            }
            else {
                ant.setLiga(p.getLiga());
            }


        }
        return(ban);
    }

    public PolinomioF3 sumar( PolinomioF3 b){
        int expA, expB;
        float coefA, coefB;
        NodoTermino p = new NodoTermino();
        NodoTermino q = new NodoTermino();
        PolinomioF3  c = new PolinomioF3();
        p = punta;  //para polinomio Yo
        q = b.getPunta();   // para el otro polinomio a sumar

        while (p != null  && q != null) {

            expA  =  p.getExponente();
            expB =   q.getExponente();
            coefA =  p.getCoeficiente();
            coefB =  q.getCoeficiente();
            if(expA == expB) {
                c.insertarTermino(coefA + coefB, expA);
                p = p.getLiga();
                q = q.getLiga();
            }
            else {
                if(expA > expB){
                    c.insertarTermino (coefA, expA);
                    p = p.getLiga();
                }
                else {
                    c.insertarTermino (coefB, expB );
                    q = q.getLiga();
                }

            }

        }

        while ( p != null){
            c.insertarTermino( p.getCoeficiente(), p.getExponente());
            p = p.getLiga();
        }

        while ( q != null){

            c. insertarTermino( q.getCoeficiente(), q.getExponente());
            q = q.getLiga();
        }

        return(c);
    }

    public void mostrarPolinomio(){
        NodoTermino p ;
        p = punta;
        while( p != null ){
            System.out.println(p.getCoeficiente() + "X^" + p.getExponente() + " + ");
            p = p.getLiga();
        }

        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }
}
