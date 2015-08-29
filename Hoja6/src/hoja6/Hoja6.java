/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja6;

import java.util.HashSet;
import javax.swing.JFrame;


/**
 *
 * @author Ma. Belen
 */
public class Hoja6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //se inicializa la interfaz grafica
       JFrame frame = new JFrame(); //se crea un JFrame
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //el frame para que se cierre normalmente
       frame.getContentPane().add(new SETGUI()); //se agrega el contenido del panel
       frame.pack(); //empaqueta
       frame.setVisible(true); //se hace visible
       
       
        
    }
    
}
