public class ListaCDE {
    Nodo punta;
    Nodo cola;
    //---------------------------------------------------------------
    public ListaCDE(){

    }
    public ListaCDE(Nodo punta, Nodo cola) {
        this.punta = punta;
        this.cola = cola;
    }
    //--------------------------------------------------------------

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }
    //----------------------------------------------------------
    public boolean conjuntoVacio(){
        if(punta == null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean conjuntIguales(ListaCDE B){
        if(conjuntoVacio()){
            return false;
        }
        else{
            if(B.conjuntoVacio()){
                return false;
            }
            else{
                Nodo p = punta;
                Nodo q = B.getPunta();
                while(p.getLigaSig() != punta){
                   if(p.getCodigo().equals(q.getCodigo()) || p.getNombre().equals(q.getNombre())){
                       p = p.getLigaSig();
                       q.getLigaSig();
                   }
                   else{
                       return false;
                   }
                }
                if(p.getCodigo().equals(q.getCodigo()) || p.getNombre().equals(q.getNombre())){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    public boolean conjuntosEquivalent(ListaCDE B){
        if(conjuntoVacio()){
            return false;
        }
        else{
            if(B.conjuntoVacio()){
                return false;
            }
            else{
                Nodo p = punta;
                Nodo q = B.getPunta();
                int contador = 1;
                int contador1 = 1;
                while(p.getLigaSig() != punta){
                    contador++;
                    p = p.getLigaSig();
                }
                while(q.getLigaSig() != q.getPunta()){
                    contador1++;
                    q = q.getLigaSig();
                }
                if(contador == contador1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    public Nodo pertenenciaMem(String codigo) {
        if (conjuntoVacio()) {
            return null;
        } else {
            Nodo p = punta;
            while (p.getLigaSig() != punta) {
                if (codigo.equals(p.getCodigo())) {
                    return p;
                } else {
                    p = p.getLigaSig();
                }
            }
            if (codigo.equals(p.getCodigo())) {
                return p;
            } else {
                return null;
            }
        }
    }
    public boolean conjuntoUnitario(){
        if(conjuntoVacio()){
            return false;
        }
        else{
            Nodo p = punta;
            if(p.getLigaSig() == punta || p.getLigaAnt() == punta){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean insertarFinal(Nodo nuevo) {
        Nodo p, q;
        if (conjuntoVacio()) {
            punta = nuevo;
            punta.setLigaAnt(nuevo);
            punta.setLigaSig(nuevo);
        } else {
            q = pertenenciaMem(nuevo.getCodigo());
            if (q == null) {
                nuevo.setLigaSig(punta);
                nuevo.setLigaAnt(punta.getLigaAnt());
                cola = punta.getLigaAnt();
                cola.setLigaSig(nuevo);
                punta.setLigaAnt(nuevo);
            }
        }
        return true;
    }
    public ListaCDE intersepcion(ListaCDE B) {
        ListaCDE resultado = new ListaCDE();

        if (conjuntoVacio() || B.conjuntoVacio()) {
            return resultado;
        }

        Nodo p = punta;
        do {
            if (B.pertenenciaMem(p.getCodigo()) != null) {
                resultado.insertarFinal(new Nodo(p.getCodigo(), p.getNombre()));
            }
            p = p.getLigaSig();
        } while (p != punta);

        return resultado;
    }
    public ListaCDE union(ListaCDE B) {
        ListaCDE resultado = new ListaCDE();

        Nodo p = punta;
        do {
            resultado.insertarFinal(new Nodo(p.getCodigo(), p.getNombre()));
            p = p.getLigaSig();
        } while (p != punta);

        p = B.getPunta();
        do {
            if (resultado.pertenenciaMem(p.getCodigo()) == null) {
                resultado.insertarFinal(new Nodo(p.getCodigo(), p.getNombre()));
            }
            p = p.getLigaSig();
        } while (p != B.getPunta());

        return resultado;
    }
    public ListaCDE complemento(ListaCDE B) {
        ListaCDE resultado = new ListaCDE();

        if (conjuntoVacio()) {
            return resultado;
        }

        Nodo p = punta;
        do {
            if (B.pertenenciaMem(p.getCodigo()) == null) {
                resultado.insertarFinal(new Nodo(p.getCodigo(), p.getNombre()));
            }
            p = p.getLigaSig();
        } while (p != punta);

        return resultado;
    }
    public ListaCDE diferencia(ListaCDE B) {
        ListaCDE resultado = new ListaCDE();

        if (conjuntoVacio()) {
            return resultado;
        }

        Nodo p = punta;
        do {
            if (B.pertenenciaMem(p.getCodigo()) == null) {
                resultado.insertarFinal(new Nodo(p.getCodigo(), p.getNombre()));
            }
            p = p.getLigaSig();
        } while (p != punta);

        return resultado;
    }

}
