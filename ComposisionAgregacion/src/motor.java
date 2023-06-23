public class motor {
    private String serie;
    private int velocidad;

    public motor(String serie, int velocidad) {
        this.serie = serie;
        this.velocidad = velocidad;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void encendido(){//Motor encendido
        System.out.println("Motor encendido");
    }
    public void apagado(){//Motor apagado
        System.out.println("Motor apagado");
    }
    public void mostrar(){
        System.out.println("La serie del la licuadora es: "+serie+
                "\nLa velocidad de la licuadora es: "+velocidad);
    }
}