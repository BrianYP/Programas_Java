import java.util.*;
public class datosG {

    public static void datoss(){
        int cantidad = 1;
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese los datos de Usted para el registro en la aplicación");

        //VECTOR DE OBJETO PERSONA
        persona[] per= new persona[cantidad];

        //RECORREMOS EL VECTOR PERSONA
        for(int i = 0; i < cantidad; i++) {
            System.out.print("Introduzca su nombre: ");
            String nombreC = entrada2.nextLine();
            System.out.print("Introduzca su apellido: ");
            String apellidoC = entrada2.nextLine();
            System.out.print("Introduzca su cedula: ");
            String cedulaC = entrada2.nextLine();
            System.out.print("Introduzca su telefono: ");
            String telefonoC = entrada2.nextLine();
            System.out.print("Introduzca su direccion: ");
            String direccionC = entrada2.nextLine();
            per[i] = new persona(nombreC, apellidoC, cedulaC, telefonoC, direccionC);
            // Crear un nuevo objeto de la clase persona
        }

        System.out.println("Ingrese los datos de su mascota");

        //VECTOR DE OBJETO MASCOTA
        animal[] ani = new animal[cantidad];

        //RECORREMOS EL VECTOR ANIMAL
        for(int i=0;i<cantidad;i++){
            //CREAMOS NUEVO OBJETOUUU
            System.out.print("Introduzca el nombre de su mascota: ");
            String nombreM = entrada2.nextLine();
            System.out.print("Introduzca la raza de su mascota: ");
            String razaM = entrada2.nextLine();
            System.out.print("Introduzca la edad de su mascota: ");
            String edadM = entrada2.nextLine();
            System.out.print("Introduzca el peso de su mascota: ");
            String pesoM = entrada2.nextLine();
            System.out.print("Introduzca la identificación de su mascota: ");
            String identificacionM = entrada2.nextLine();
            ani[i] = new animal(nombreM, razaM, edadM, pesoM, identificacionM);
        }

        //VECTOR DE OBJETO MEDICAMENTOS
        medicamentos[] medi = new medicamentos[cantidad];

        //RRECORREMOS EL VECTOR DE MEDICAMENTOS
        for(int i=0; i<cantidad;i++){
            System.out.print("Introduzca el nombre del medicamento: ");
            String nombreD = entrada2.nextLine();
            System.out.print("Introduzca la descripción del mediacamento: ");
            String descripcionD = entrada2.nextLine();
            System.out.print("Ingrese la cantidad de dosis del medicamento: ");
            String cantidadD = entrada2.nextLine();
            medi[i] = new medicamentos(nombreD, descripcionD, cantidadD);
        }

        //MOSTRAMOS EN PANTALLA EL VECTOR PERSONA
        System.out.println("Datos registrados de usuario");
        for (int i=0;i<cantidad;i++){
            System.out.println("Nombre: "+per[i].getNombreC()+"\n"+"Apellido: "+per[i].getApellidoC()+"\n"+"Cedula: "+per[i].getCedulaC()+"\n"+"Telefono: "+per[i].getTelefonoC()+"\n"+"Dirección: "+per[i].getDireccionC());
        }
        System.out.println();

        //MOSTRAMOS EN CONSOLA EL VECTOR DE MASCOTA
        System.out.println("Datos registrados de la mascota");
        for(int i=0;i<cantidad;i++){
            System.out.println("Nombre: "+ani[i].getNombre()+"\n"+"Raza: "+ani[i].getRaza()+"\n"+"Edad: "+ani[i].getEdad()+"\n"+"Peso: "+ani[i].getPeso()+"\n"+"Identificación: "+ani[i].getIdentificacion());
        }
        System.out.println();

        //MOSTRAMOS EN CONSOLA EL VECTOR DE MEDICAMENTOS
        System.out.println("Datos registrados de medicamentos");
        for(int i=0;i<cantidad;i++){
            System.out.println("Nombre :"+medi[i].getNombreDisis()+"\n"+"Descripción: "+medi[i].getDescripcionDosis()+"\n"+"Dosis: "+medi[i].getDosis());
        }

    }
}
