
package listaempresa;
public class Nodo {
 
    private String cedula;
    private String nombre;
    private double salario_basico;   
    private int estrato;
    private String direccion;
    private String telefono;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo() {        
        this.siguiente = null;
        this.anterior = null;
    }
    
    public String getcedula() {
        return cedula;
    }
    
    public void setcedula(String cedula) {
        this.cedula = cedula;
    }
        
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario_basico() {
        return salario_basico;
    }

    public void setSalario_basico(double salario_basico) {
        this.salario_basico = salario_basico;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }
    
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public String toString() {                      
        return " Cedula: " + cedula + "\n Nombre " + nombre + "\n Salario basico " + salario_basico + "\n Estrato " + estrato + "\n Direccion " + direccion + "\n Telefono " + telefono + "\n\n\n";
    }
    
}
