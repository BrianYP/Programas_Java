public class mascota {
    /*En este objeto mascota mostramos otra manera de usar el constructor*/
    String nombreM;
    int edadM;

    public mascota(String nombreM, int edadM){
        this.nombreM = nombreM;
        this.edadM = edadM;
    }
    public void mostrarDatoss(String nombreM, int edadM){
        System.out.println("El nombre de tu mascota es: "+nombreM);
        System.out.println("La edad de tu mascota es: "+edadM);
    }
}
