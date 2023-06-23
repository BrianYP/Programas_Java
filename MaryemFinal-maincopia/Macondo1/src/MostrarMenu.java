import javax.swing.JOptionPane;

public class MostrarMenu {
    public void Mostrar(){
        Metodos M = new Metodos();
        int opcion = 0;
        do{
            String menu = "----- MENU -----\n"
                    + "1. Registrar paciente en la cola\n"
                    + "2. Retirar paciente de la cola\n"
                    + "3. Partir la cola\n"
                    + "4. Unir colas\n"
                    + "5. Mostrar estado de la cola\n"
                    + "6. Salir";
            String input = JOptionPane.showInputDialog(null, menu + "\n\nIngrese una opción:");
            opcion = Integer.parseInt(input);
            switch (opcion){
                case 1:
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente:");
                    M.registrarPaciente(nombre);
                    break;
                case 2:
                    M.retirarPaciente();
                    break;
                case 3:
                    int numPacientes1 = M.contarPacientes() / 2;
                    M.partirColaGuardarAuxiliar(numPacientes1);
                    break;
                case 4:
                    M.unirColas();
                    break;
                case 5:
                    M.mostrar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
}
