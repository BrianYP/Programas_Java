public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //------------------------------------------------Metodos
    public double consulSaldo(int indice){//N es la posicion del arreglo cuentas
        return cuentas[indice].getSaldo();//dependiendo de la posicion de la cuenta y retorno saldo cuenta
    }
    public void ingreDinero(int indice, double cantidad){//Metodo para ingresar dinero
        cuentas[indice].depositarDinero(cantidad);
        //Del metodo ingresar dinero de la clase cuenta llama al arreglo y suma
    }
    public void retirarDinero(int indice, double cantidad){
        cuentas[indice].retirarDinero(cantidad);//Misma logica pero para retirar dinero
    }
}
