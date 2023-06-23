import javax.swing.JOptionPane;

public class Metodos {
    Cola col = new Cola();

    public void registrarPaciente(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre); // Crea un nuevo nodo con el nombre del paciente
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola
        Nodo C = col.getCola(); // Obtiene el nodo de la cola de la cola

        if (P == null) { // Comprueba si la cola está vacía
            col.setCabeza(nuevoNodo); // Establece el nuevo nodo como la cabeza de la cola
            col.setCola(nuevoNodo); // Establece el nuevo nodo como la cola de la cola
        } else {
            C.setSiguiente(nuevoNodo); // Establece el nuevo nodo como el siguiente nodo después del último nodo de la cola
            col.setCola(nuevoNodo); // Establece el nuevo nodo como la cola de la cola
        }

        JOptionPane.showMessageDialog(null, "Paciente '" + nombre + "' registrado correctamente."); // Muestra un mensaje de confirmación
    }

    public void retirarPaciente() {
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola

        if (P == null) { // Comprueba si la cola está vacía
            JOptionPane.showMessageDialog(null, "La cola está vacía."); // Muestra un mensaje de que la cola está vacía
            return;
        }

        col.setCabeza(P.getSiguiente()); // Establece el siguiente nodo como la nueva cabeza de la cola

        if (col.getCabeza() == null) { // Comprueba si la nueva cabeza es nula, es decir, si solo había un nodo en la cola
            col.setCola(null); // Establece la cola de la cola como nula
        }

        JOptionPane.showMessageDialog(null, "Paciente retirado correctamente."); // Muestra un mensaje de confirmación
    }

    public void partirColaGuardarAuxiliar(int numPacientes1) {
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola
        Nodo CabezaAux = null; // Cabeza de la cola auxiliar
        Nodo ColaAux = null; // Cola de la cola auxiliar

        if (P == null || numPacientes1 >= contarPacientes()) { // Comprueba si la cola está vacía o si el número de pacientes para la primera cola es mayor o igual que el tamaño de la cola actual
            JOptionPane.showMessageDialog(null, "El número de pacientes para la primera cola es mayor o igual que el tamaño de la cola actual.");
            return;
        }

        Nodo nodoActual = P;
        int contador = 1;
        while (contador < numPacientes1) { // Recorre la cola hasta llegar al número de pacientes para la primera cola
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }

        CabezaAux = nodoActual.getSiguiente(); // Establece el siguiente nodo como la cabeza de la cola auxiliar
        ColaAux = col.getCola(); // Obtiene el nodo de la cola de la cola
        nodoActual.setSiguiente(null); // Establece el siguiente nodo como nulo para truncar la cola original

        col.setCabezaAux(CabezaAux); // Establece la cabeza de la cola auxiliar
        col.setColazaAux(ColaAux); // Establece la cola de la cola auxiliar

        JOptionPane.showMessageDialog(null, "Cola original:\n" + obtenerCola(P)); // Muestra la cola original
        JOptionPane.showMessageDialog(null, "Cola auxiliar:\n" + obtenerCola(CabezaAux)); // Muestra la cola auxiliar
    }

    public void unirColas() {
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola
        Nodo aux = col.getCabezaAux(); // Obtiene el nodo de la cabeza de la cola auxiliar

        if (aux == null) { // Comprueba si la cola auxiliar está vacía
            JOptionPane.showMessageDialog(null, "No hay cola auxiliar para unir."); // Muestra un mensaje de que no hay cola auxiliar para unir
            return;
        }

        Nodo nodoActual = P;
        while (nodoActual.getSiguiente() != null) { // Recorre la cola hasta llegar al último nodo
            nodoActual = nodoActual.getSiguiente();
        }

        nodoActual.setSiguiente(aux); // Une la cola auxiliar al final de la cola original

        JOptionPane.showMessageDialog(null, "Colas unidas:\n" + obtenerCola(P)); // Muestra las colas unidas

        col.setCabezaAux(null); // Restablece la cabeza de la cola auxiliar a nulo
        col.setColazaAux(null); // Restablece la cola de la cola auxiliar a nulo
    }

    public int contarPacientes() {
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola
        int contador = 0; // Inicializa el contador en 0

        Nodo nodoActual = P;
        while (nodoActual != null) { // Recorre la cola hasta llegar al último nodo
            contador++; // Incrementa el contador
            nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo de la cola
        }

        return contador; // Devuelve el número de pacientes contados
    }

    public String obtenerCola(Nodo cabeza) {
        if (cabeza == null) { // Comprueba si la cabeza de la cola está vacía
            return "La cola está vacía."; // Devuelve un mensaje de que la cola está vacía
        }

        StringBuilder cola = new StringBuilder();
        Nodo nodoActual = cabeza;
        while (nodoActual != null) { // Recorre la cola hasta llegar al último nodo
            cola.append("Paciente: ").append(nodoActual.getNombre()).append("\n"); // Agrega el nombre del paciente a la cadena
            nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo de la cola
        }

        return cola.toString(); // Devuelve la cadena con la cola
    }

    public void mostrar() {
        Nodo P = col.getCabeza(); // Obtiene el nodo de la cabeza de la cola
        Nodo aux = col.getCabezaAux(); // Obtiene el nodo de la cabeza de la cola auxiliar

        JOptionPane.showMessageDialog(null, "Cola original:\n" + obtenerCola(P)); // Muestra la cola original
        JOptionPane.showMessageDialog(null, "Cola auxiliar:\n" + obtenerCola(aux)); // Muestra la cola auxiliar
    }
}
