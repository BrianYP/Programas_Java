package Clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ClienteDAO {
    Cliente cl = new Cliente();
    
    public void guardarPersona() {
        String nombre = cl.getNombre();
        int cedula = cl.getId();
        String apellido = cl.getApellido();
        String correo = cl.getCorreo();

        Cliente persona = new Cliente();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cedula + ".dat"))) {
            oos.writeObject(persona);
            JOptionPane.showMessageDialog(null, "La persona se ha guardado correctamente.");
            limpiarCampos();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar la persona.");
        }
    }
    
    private void limpiarCampos() {
        cl.setNombre("");
        cl.setApellido("");
        cl.setId(0);
        cl.setCorreo("");
    }
    
    public void eliminarPersona() {
        int cedula = cl.getId();
        File file = new File(cedula + ".dat");

        if (file.exists()) {
            if (file.delete()) {
                JOptionPane.showMessageDialog(null, "La persona se ha eliminado correctamente.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la persona.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la persona con la cédula especificada.");
        }
    }
    
    public void buscarPersona() {
        int cedula = cl.getId();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cedula + ".dat"))) {
            Cliente persona = (Cliente) ois.readObject();
            mostrarPersona(persona);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encontró la persona con la cédula especificada.");
        }
    }
    
    public void mostrarPersona(Cliente persona) {
        cl.setNombre(persona.getNombre());
        cl.setApellido(persona.getApellido());
        cl.setId(persona.getId());
        cl.setCorreo(persona.getCorreo());
    }
}
