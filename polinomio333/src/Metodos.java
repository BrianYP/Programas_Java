public class Metodos {
    Polinomio poli = new Polinomio();
    public boolean polinomioVacio(){
        if(poli.getPunta() == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertarTermino(float coef, int exp){
        NodoTermino p = new NodoTermino();
        NodoTermino ant = new NodoTermino();

        float suma;
        ant = null;

        NodoTermino nuevo1 = new NodoTermino(coef, exp);
        if(polinomioVacio()){
            poli.setPunta(nuevo1);
        }
        else{
            p = poli.getPunta();
            NodoTermino q = new NodoTermino(coef, exp);
            while(p != null && p.getExponente() > exp){
                ant = p;
                p = p.getLiga();
            }
            if((p != null && p.getExponente() < exp) && ant != null){
                ant.setLiga(q);
                q.setLiga(p);
            }
            else{
                if(p != null && p.getExponente() == exp){
                    suma = p.getCoeficiente() + coef;
                    if(suma != 0){
                        p.setCoeficiente(suma);
                    }
                    else{
                        ant.setLiga(p.getLiga());
                    }
                }
                else{
                    if(p == poli.getPunta()){
                        q.setLiga(poli.getPunta());
                        poli.setPunta(q);
                    }
                    else{
                        if(p == null && ant != null){
                            ant.setLiga(q);
                        }
                    }
                }
            }
            mostrarPolinomio();
        }
    }

    public void mostrarPolinomio(){
        NodoTermino p;
        p = poli.getPunta();
        while(p != null){
            System.out.println(p.getCoeficiente() + "X^" + p.getExponente()+" + ");
            p = p.getLiga();
        }
    }

    public boolean eliminarTermino(int exp){
        NodoTermino p = new NodoTermino();
        NodoTermino ant = new NodoTermino();
        boolean ban = true;

        ant = null;
        p = poli.getPunta();

        while(p != null && p.getExponente() < exp){
            ban = true;
            if(p == poli.getPunta()){
                poli.setPunta(p.getLiga());
            }
            else{
                ant.setLiga(p.getLiga());
            }
        }
        return ban;
    }

    public Metodos sumar(Metodos b){
        int expA, expB;
        float coefA, coefB;
        NodoTermino p = new NodoTermino();
        NodoTermino q = new NodoTermino();
        Metodos c = new Metodos();
        p = poli.getPunta();
        q = b.poli.getPunta();

        while(p != null && q !=null){
            expA = p.getExponente();
            expB = q.getExponente();
            coefA = p.getCoeficiente();
            coefB = q.getCoeficiente();
            if(expA == expB){
                c.insertarTermino(coefA + coefB, expA);
                p = p.getLiga();
                q = q.getLiga();
            }
            else{
                if(expA > expB){
                    c.insertarTermino(coefA, expA);
                    p = p.getLiga();
                }
                else{
                    c.insertarTermino(coefB, expB);
                    q = q.getLiga();
                }
            }
        }
        while(p !=null){
            c.insertarTermino(p.getCoeficiente(), p.getExponente());
            p = p.getLiga();
        }

        while(q !=null){
            c.insertarTermino(q.getCoeficiente(), q.getExponente());
            q = q.getLiga();
        }
        return(c);
    }

}
