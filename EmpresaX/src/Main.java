import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion, cantidad1, cantidad2;
        Departamento vectDepa[] = new Departamento[10];
        Empleado vectEmple[] = new Empleado[100];
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvendo a Inversiones Otraparte\n"+
                    "1.Ingrese Departamentos\n"+
                    "2.Agregar Departamento\n"+
                    "3.Borrar Departamento\n"+
                    "4.Modificar Departamento\n"+
                    "5.Mostrar Departamentos\n"+
                    "6.Ingresar Empleados\n"+
                    "7.Agregar Empleado\n"+
                    "8.Borrar Empleado\n"+
                    "9.Promedio Empleados\n"+
                    "10.Mostrar Empleados\n"+
                    "11.Mostrar Datos Empresa\n"+
                    "12.Salir\n"+
                    "Seleccione una opción"));
            switch(opcion){
                case 1:
                    int cantidadDepa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de departamentos"));
                    if(cantidadDepa>10){
                        JOptionPane.showMessageDialog(null, "NO PUEDES PASAR EL LIMITE DE DEPARTAMENTOS (10)", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        vectDepa = new Departamento[cantidadDepa];
                        for(int i=0; i<vectDepa.length; i++){
                            Departamento depa1 = new Departamento();
                            depa1.setNombreDepart(JOptionPane.showInputDialog("Ingrese el nombre del departamento #"+(i+1)+": "));
                            depa1.setNumeroPer(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas para el departamento #"+(i+1)+": ")));
                            vectDepa[i] = depa1;
                        }
                    }
                    break;
                case 2:
                    cantidad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de departamentos a registrar"));
                    int cantidadTotal = vectDepa.length + cantidad1;
                    if (cantidadTotal > 10) {
                        JOptionPane.showMessageDialog(null, "LÍMITE DE DEPARTAMENTOS (10)", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        for (int i = 0; i < cantidad1; i++) {
                            String nombreDep = JOptionPane.showInputDialog("Ingrese el nombre del departamento #" + (i+1));
                            int cantidadPer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas para el departamento #" + (i+1)));
                            // Buscamos la primera posición vacía en el arreglo
                            int pos = -1;
                            for (int j = 0; j < vectDepa.length; j++) {
                                if (vectDepa[j] == null) {
                                    pos = j;
                                    break;
                                }
                            }
                            if (pos != -1) {
                                // Creamos un nuevo objeto Departamento y lo agrega al arreglo en la posición vacía
                                Departamento nuevoDep = new Departamento();
                                nuevoDep.setNombreDepart(nombreDep);
                                nuevoDep.setNumeroPer(cantidadPer);
                                vectDepa[pos] = nuevoDep;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "DEPARTAMENTOS AGREGADOS", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;


                case 3:
                    Departamento d2 = new Departamento();
                    String nombreDepa = JOptionPane.showInputDialog("Ingrese el nombre del departamento");
                    d2.borarDepart(vectDepa, nombreDepa);
                    break;
                case 4:
                    Departamento d3 = new Departamento();
                    String nombreDepa1 = JOptionPane.showInputDialog("Ingrese el nombre del departamento");
                    d3.modificarDepart(vectDepa, nombreDepa1);
                    break;
                case 5:
                    Departamento d4 = new Departamento();
                    d4.verDepartaments(vectDepa);
                    break;
                case 6:
                    int cantidadEmple = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Empleados"));
                    if(cantidadEmple > 100) {
                        JOptionPane.showMessageDialog(null, "NO PUEDES PASAR EL LIMITE DE Empleados (100)", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        vectEmple = new Empleado[cantidadEmple];
                        for(int i = 0; i < cantidadEmple; i++) {
                            Empleado emple1 = new Empleado();
                            emple1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Empleado #" + (i + 1) + ": "));
                            emple1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
                            emple1.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")));
                            emple1.setNombreDepart(JOptionPane.showInputDialog("Ingrese el el departamento en el que está"));
                            vectEmple[i] = emple1;
                        }
                        JOptionPane.showMessageDialog(null, "Datos de empleados agregados exitosamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 7:
                    cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Empleados a registrar"));
                    int cantidadTotal1 = vectDepa.length + cantidad2;
                    if (cantidadTotal1 > 100) {
                        JOptionPane.showMessageDialog(null, "LÍMITE DE EMPLEADOS (100)", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        for (int i = 0; i < cantidad2; i++) {
                            String nombreEmple = JOptionPane.showInputDialog("Ingrese el nombre del Empleado #" + (i+1));
                            int edadEmple = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Empleado"));
                            Double sueldoEmple = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo"));
                            String depart = JOptionPane.showInputDialog("Ingrese el departamento en el que esta");
                            // Buscamos la primera posición vacía en el arreglo
                            int pos = -1;
                            for (int j = 0; j < vectEmple.length; j++) {
                                if (vectEmple[j] == null) {
                                    pos = j;
                                    break;
                                }
                            }
                            if (pos != -1) {
                                // Creamos un nuevo objeto Departamento y lo agrega al arreglo en la posición vacía
                                Empleado nuevoEmple1 = new Empleado();
                                nuevoEmple1.setNombre(nombreEmple);
                                nuevoEmple1.setEdad(edadEmple);
                                nuevoEmple1.setSueldo(sueldoEmple);
                                nuevoEmple1.setNombreDepart(depart);
                                vectEmple[pos] = nuevoEmple1;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "EMPLEADO AGREGADOS", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 8:
                    Empleado emple1 = new Empleado();
                    String nombreEmple = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    emple1.borarEmple(vectEmple, nombreEmple);
                    break;
                case 9:
                    Empleado emple2 = new Empleado();
                    emple2.promedioSueldo(vectEmple);
                    break;
                case 10:
                    Empleado emple3 = new Empleado();
                    emple3.verEmpleados(vectEmple);
                    break;
                case 11:
                    Empresa empre = new Empresa();
                    empre.datosEmpresa();
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Mesaje", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Eliga una opción que este contemplada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(opcion !=12);
    }
}