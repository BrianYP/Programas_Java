public class Metodos {
    ListaCDE LDE = new ListaCDE();
    Nodo nod = new Nodo(p.getCodigo(), p.getNombre());
    public boolean conjuntoVacio(){
        if(LDE.getPunta() == null){
            return true;
        }
        else{
            return false;
        }
    }


}
