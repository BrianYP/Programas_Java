package e_listalse;

public class Estudiante {

    private String Dni;
    private String nombre;
    private String apellido;
    private String fecha_nac;
    private String materia;
    private int num_notas;
    private float vect_p[] = new float[10];
    private float vect_notas[] = new float[10];
    private Estudiante liga;

    public Estudiante() {
        this.Dni = "";
        this.nombre = "";
        this.apellido = "";
        this.fecha_nac = "01/01/1996";
        this.materia = "Depas_2";
        this.num_notas = 2;
        for (int i = 0; i < 10; i++) {
            vect_p[i] = 0;
            vect_notas[i] = 0;
        }
        this.liga = liga;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNum_notas(int num_notas) {
        this.num_notas = num_notas;
    }

    public void setVect_p(float[] vect_p) {
        this.vect_p = vect_p;
    }

    public void setVect_notas(float[] vect_notas) {
        this.vect_notas = vect_notas;
    }

    public void setLiga(Estudiante liga) {
        this.liga = liga;
    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getMateria() {
        return materia;
    }

    public int getNum_notas() {
        return num_notas;
    }

    public float[] getVect_p() {
        return vect_p;
    }

    public float[] getVect_notas() {
        return vect_notas;
    }

    public Estudiante getLiga() {
        return liga;
    }

    public float definitiva() {
        float def = 0;
        for (int i = 0; i < 10; i++) {
            def = def + vect_notas[i] * vect_p[i];
        }
        return def;
    }
    
    public void mostrar_datos_est() {
        String mostr_not = "";
        String porcen = "";
        for (int i = 0; i < 10; i++) {
            mostr_not = mostr_not + vect_notas[i] + " " ;
            porcen = porcen + vect_p[i] + " ";
        }
        
        System.out.println(Dni + " " + nombre + " " + apellido + " " + fecha_nac + " " +
                materia + " " + num_notas + " " + mostr_not + " " + porcen);
    }
    public int edad(){
        
    }
}
