public class Vector{
    private String nombre;
    private String apllido;
    private String dni;
    Cuenta vect[];

    public Vector(String nombre, String apllido, String dni, Cuenta[] vect) {
        this.nombre = nombre;
        this.apllido = apllido;
        this.dni = dni;
        this.vect = vect;
    }

    //USO DE SETTERS AND GETTERS TAMBIEN
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getVect() {
        return vect;
    }

    public void setVect(Cuenta[] vect) {
        this.vect = vect;
    }

    //-----------------------------------------------METODOS
    public double consultarSaldo(int indice){
        return vect[indice].getSaldo();
        //De esta manera obtenemos el saldo de la cuenta
    }
    public void  ingresarDinero(int indice, double cantidad){
        vect[indice].depositarDinero(cantidad);
        //Depositamos el dinero en la cuenta
    }
    public void retirarDinero(int indice, double cantidad){
        vect[indice].retirarDinero(cantidad);
    }
}
