public class Main {
    public static void main(String[] args) {
        String sexo="Hombre";
        int edad = 18;
        //USO DE OPERADOR AND

        if(sexo.equalsIgnoreCase("hombre") && edad ==18){
            System.out.println("La persona es un hombre adulto legal con 18 años");
        }
        else{
            System.out.println("La persona no es un hombre o no tiene 18 años");
        }

        //USO DEL OPERADOR OR ( || )
        if(sexo.equalsIgnoreCase("hombre") || edad==20){
            System.out.println("La persona es un hombre o tiene 20 años");
        }else{
            System.out.println("La perona no es un hombre o no tiene 20 años");
        }

        //USO DEL OPERADOR NO ( ! )
        if(!sexo.equalsIgnoreCase("hombre")){
            System.out.println("El personaje es un hombre");
        }

        //CONDICIONALES COMPLETAS DE IF

        String resultado = (edad>=10)? "Mayor de edad":"Menor de edad";//Esto de aca es un if resumido
        if(edad>=18){
            System.out.println("Eres una persona mayor de edad, ya puedes votar");
        }
        else {
            System.err.println("No eres una persona mayor de edad, no pedes votar");
        }
    }
}