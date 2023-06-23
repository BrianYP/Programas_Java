import javax.swing.*;

public class Departamento {
    private String nombreDepart;
    private int cantidadDepart;
    private int numeroPer;
    Departamento vecDepa[];
    //------------------------------------CONSTRUCTORES

    public Departamento() {
    }

    public Departamento(String nombreDepart, int cantidadDepart, int numeroPer) {
        this.nombreDepart = nombreDepart;
        this.cantidadDepart = cantidadDepart;
        this.numeroPer = numeroPer;
    }
    public Departamento(String nombreDepart){
        this.nombreDepart=nombreDepart;
    }
    //------------------------------------USO DE SETTERS AND GETTERS

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public int getCantidadDepart() {
        return cantidadDepart;
    }

    public void setCantidadDepart(int cantidadDepart) {
        this.cantidadDepart = cantidadDepart;
    }

    public int getNumeroPer() {
        return numeroPer;
    }

    public void setNumeroPer(int numeroPer) {
        this.numeroPer = numeroPer;
    }

    public Departamento[] getVecDepa() {
        return vecDepa;
    }

    public void setVecDepa(Departamento[] vecDepa) {
        this.vecDepa = vecDepa;
    }

    //----------------------------------------------------------------METODOS
    public void borarDepart(Departamento vectDepa[], String nombreDepart){
        int posAElim = -1;
        for(int i=0; i< vectDepa.length;i++){
            if(vectDepa[i] !=null && vectDepa[i].getNombreDepart().equals(nombreDepart)){
                posAElim = i;
                break;
            }
        }

        if(posAElim !=-1){
            for(int i=posAElim+1; i<vectDepa.length;i++){
                vectDepa[i-1] = vectDepa[i];
            }
            vectDepa[vectDepa.length-1] = null;
            JOptionPane.showMessageDialog(null, "DEPARTAMENTO ELIMINADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "EL DEPARTAMENTO NO SE HA ENCONTRADO", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void modificarDepart(Departamento vectDepa[], String nombreDepart){
        int posACambiar = -1;
        for(int i=0; i< vectDepa.length;i++){
            if(vectDepa[i] !=null && vectDepa[i].getNombreDepart().equals(nombreDepart));
            posACambiar = i;
            break;
        }

        if(posACambiar !=-1){
            Departamento depar = new Departamento();
            depar.setNombreDepart(JOptionPane.showInputDialog("Ingrese el nombre del departamento: "));
            depar.setNumeroPer(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas en el departamento: ")));
            vectDepa[posACambiar] = depar;
            JOptionPane.showMessageDialog(null, "DEPARTAMENTO MODIFICADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "DEPARTAMENTO NO ENCONTRADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void verDepartaments(Departamento vectDepa[]) {
        String departamentos = "";
        boolean departamentosBorrados = false;
        for(int i = 0; i < vectDepa.length; i++) {
            if(vectDepa[i] != null) {
                departamentos += "Nombre: " + vectDepa[i].getNombreDepart() + "\nPersonas ED: " + vectDepa[i].getNumeroPer() + "\n\n";
            } else {
                departamentosBorrados = true;
            }
        }
        if(!departamentosBorrados) {
            JOptionPane.showMessageDialog(null, departamentos, "DEPARTAMENTOS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, departamentos + "\n(NO SE MOSTRARAN DEPARTAMENTOS BORRADOS)", "DEPARTAMENTOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
