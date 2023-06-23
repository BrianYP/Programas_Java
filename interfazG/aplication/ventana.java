package aplication;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {
    public ventana(){
        this.setSize(900, 600);//Establecer el tamaño de la ventana
        this.setTitle("DisVent");//Titulo de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Esto nos permite cerrar el prorama y que deje de ejecutar

        //this.setLocation(250, 80);Para dar la hubicación donde aparezce la ventana al ejecutar
        //this.setBounds(250, 80, 900, 66);Hace las dos al mismo tiempo, tamaño y posición
        //this.getContentPane().setBackground(Color.orange);//Colores de fondo de toda la ventana

        this.setLocationRelativeTo(null);//De esta manera al ejecutarse se ponga en el centro
        this.setMinimumSize(new Dimension(600, 300));//Dimension minima de la ventana

        //----------------------------------------------------------------------------------------Metodos
        iniciarComponentes();//Llamamos al metodo
    }

    private void iniciarComponentes(){//para los botnes y etiquetas
        JPanel panel = new JPanel();//creamos el panel es como un cuadro para ubicar en la ventana
        panel.setLayout(null);//Desactivamos el diseño por defecto
        //panel.setBackground(Color.GREEN);//Establecemos el color del panel
        this.getContentPane().add(panel);//De esta manera agregamos el panel a la ventana

        //JLabel etiqueta = new JLabel();
        //etiqueta.setText("Registrate para ingresar");//Esta es otra manera de poner una etiqueta

        JLabel etiqueta = new JLabel("INGRESE AL APLICATIVO!", SwingConstants.LEFT);//INstanciamos una etiqueta para que sea texto o una imagen y cener para la posicion de texto
        //etiqueta.setText("Registrate para registrarte");otra manera de poner el texto que llevara
        //etiqueta.setHorizontalAlignment(SwingConstants.HORIZONTAL);otra manera de centrar o posicionar el texto
        etiqueta.setBounds(10, 110, 400, 30);
        etiqueta.setForeground(Color.black);//Este es para el color del texto
        etiqueta.setOpaque(true);//Quitamos los permisos por defecto
        //etiqueta.setBackground(Color.orange);//Cambiamod el fondo de la letra

        etiqueta.setFont(new Font("arial", Font.BOLD, 20));//Establecemos la fuente del texto
        panel.add(etiqueta);//Agregamos la etiqueta al panel

        JLabel text1 = new JLabel("Bienvenido al aplicativo DisVent", SwingConstants.LEFT);
        text1.setBounds(10, 140, 400, 30);
        text1.setForeground(Color.black);
        text1.setOpaque(true);
        text1.setFont(new Font("arial", Font.BOLD, 15));
        panel.add(text1);

        //-------------------------------------------Imagen en un label
        /*ImageIcon imagen = new ImageIcon("imagenes/logo_PPI1.png");
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(50, 10, 1125, 595);
        panel.add(etiqueta2);---MANERA NUMERO 1 DE PONER UNA IMAGEN EN UN LABEL*/

        /*JLabel etiqueta2 = new JLabel(new ImageIcon("imagenes/logo_PPI1.png"));
        etiqueta2.setBounds(50, 10, 100, 100);
        panel.add(etiqueta2);---MANERA DE HACERLO N2*/

        //-----------------Crear la imagen y ajustarla al tamaño que deseemos
        ImageIcon imagen = new ImageIcon("imagenes/logo_PPI1.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(-50, -50, 300, 200);//Los valores del setBouns y de setIcon deben ser el mismo
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));
        //Esta es la manera en la que podemos ajustar la imagen al tamaño de la etiqueta
        panel.add(etiqueta2);
    }
}
