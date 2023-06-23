package listaempresa;

public class Lista {
    private Nodo cabeza;
    private int tamano;

    public Lista() {
        cabeza = null; // Inicializa
        tamano = 0; // Inicializa
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamano() {
        return tamano; // Devuelve el tamaño
    }


    public void IngresarEmpleado(String cedula, String nombre, double salario_basico, int estrato, String direccion, String telefono) {
        Nodo nuevoNodo = new Nodo(); // Crea un nuevo nodo para el empleado
        //establece los nodos
        nuevoNodo.setcedula(cedula);
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setSalario_basico(salario_basico);
        nuevoNodo.setEstrato(estrato);
        nuevoNodo.setDireccion(direccion);
        nuevoNodo.setTelefono(telefono);

        if (estaVacia()) {
            cabeza = nuevoNodo; //el nuevo nodo se convierte en la cabeza
            cabeza.setSiguiente(cabeza); // Establece la referencia siguiente de la cabeza hacia sí misma
            cabeza.setAnterior(cabeza); // Establece la referencia anterior de la cabeza hacia sí misma
        } else {
            nuevoNodo.setSiguiente(cabeza); // Establece el siguiente del nuevo nodo como la cabeza
            nuevoNodo.setAnterior(cabeza.getAnterior()); // Establece el anterior del nuevo nodo como el anterior de la cabeza
            cabeza.getAnterior().setSiguiente(nuevoNodo); // Establece el siguiente del nodo anterior a la cabeza como el nuevo nodo
            cabeza.setAnterior(nuevoNodo); // Establece el anterior de la cabeza como el nuevo nodo
        }

        tamano++; // Incrementa el tamaño de la lista
    }


    public String buscarEmpleado(String cedula) {
        String listaInfo = ""; // Variable para almacenar la información del empleado encontrado
        if (!estaVacia()) {
            Nodo nodoActual = cabeza; // Establece el nodo actual como la cabeza de la lista
            do {
                //listaInfo = nodoActual.toString();
                if(nodoActual.getcedula().equals(cedula)){
                    listaInfo += nodoActual.getAnterior().toString(); // Agrega información del nodo anterior a la variable listaInfo
                    listaInfo += nodoActual.toString(); // Agrega información del nodo actual a la variable listaInfo
                    listaInfo += nodoActual.getSiguiente().toString(); // Agrega información del nodo siguiente a la variable listaInfo
                }
                nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo en la lista
            } while (nodoActual != cabeza); // Repite el ciclo mientras no se llegue nuevamente a la cabeza
        }
        return listaInfo; // Devuelve la información del empleado encontrado
    }


    public String promedioSalario() {
        double[] contSalario = new double[7]; // Arreglo para almacenar los salarios acumulados por estrato
        int[] contEstrato = new int[7]; // Arreglo para contar la cantidad de empleados por estrato

        if (!estaVacia()) {
            Nodo nodoActual = cabeza; // Establece el nodo actual como la cabeza de la lista
            do {
                int estrato = nodoActual.getEstrato(); // Obtiene el estrato del empleado actual
                contSalario[estrato] += nodoActual.getSalario_basico(); // Acumula el salario básico del empleado en el estrato correspondiente
                contEstrato[estrato]++; // Incrementa el contador de empleados para el estrato correspondiente
                nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo en la lista
            } while (nodoActual != cabeza); // Repite el ciclo mientras no se llegue nuevamente a la cabeza
        }

        StringBuilder promedio_salario = new StringBuilder(); // StringBuilder para construir el resultado del promedio de salarios por estrato
        for (int i = 0; i < 7; i++) {
            if (contEstrato[i] != 0) {
                double promedio = contSalario[i] / contEstrato[i]; // Calcula el promedio de salarios para el estrato actual
                promedio_salario.append("Promedio salario estrato ")
                        .append(i)
                        .append(": ")
                        .append(promedio)
                        .append("\n"); // Agrega la información del promedio de salarios para el estrato actual al StringBuilder
            }
        }

        return promedio_salario.toString(); // Devuelve el resultado del promedio de salarios por estrato
    }


    public void eliminarPorCedula(String cedula) {
        if (!estaVacia()) {
            Nodo nodoActual = cabeza; // Establece el nodo actual como la cabeza de la lista            
            do {
                if(nodoActual.getcedula().equals(cedula)){
                    if(nodoActual == cabeza){
                        cabeza = nodoActual.getSiguiente(); // Si el nodo actual es la cabeza, la cabeza se actualiza al siguiente nodo
                    }
                    nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior()); // Establece el anterior del siguiente nodo al nodo anterior del nodo actual
                    nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente()); // Establece el siguiente del nodo anterior al siguiente nodo del nodo actual
                    tamano--; // Reduce el tamaño de la lista
                }
                nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo en la lista
            } while (nodoActual != cabeza); // Repite el ciclo mientras no se llegue nuevamente a la cabeza           
        }
    }


    public void aumentoSalarial(double porcnt) {
        if (!estaVacia()) {
            Nodo nodoActual = cabeza; // Establece el nodo actual como la cabeza de la lista
            do {
                double aumento = nodoActual.getSalario_basico() * (porcnt / 100.0); // Calcula el aumento basado en el porcentaje
                nodoActual.setSalario_basico(nodoActual.getSalario_basico() + aumento); // Incrementa el salario actual con el aumento
                nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo en la lista
            } while (nodoActual != cabeza); // Repite el ciclo mientras no se llegue nuevamente a la cabeza
        }
    }



    public String imprimirLista() {
        String listaInfo = ""; // Variable para almacenar la información de los empleados en la lista       
        if (!estaVacia()) {
            Nodo nodoActual = cabeza; // Establece el nodo actual como la cabeza de la lista            
            do {
                listaInfo += nodoActual.toString(); // Agrega la información del nodo actual a la variable listaInfo                
                nodoActual = nodoActual.getSiguiente(); // Avanza al siguiente nodo en la lista
            } while (nodoActual != cabeza); // Repite el ciclo mientras no se llegue nuevamente a la cabeza           
        }
        return listaInfo; // Devuelve la información de los empleados en la lista        
    }

}