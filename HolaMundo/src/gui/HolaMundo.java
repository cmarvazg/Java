/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Martín Vázquez González
 * @version 23/08/2022
 * @param "Nombre(s)" ApellidoPaterno ApellidoMaterno
 */
/*public class HolaMundo {
    public static void main(String args[])
    {
        switch(args.length)
        {
            case 0 -> JOptionPane.showMessageDialog(null, "No has ingresado ningun parámetro.", "Error", JOptionPane.INFORMATION_MESSAGE);
            
            case 1 -> JOptionPane.showMessageDialog(null, "Hola mundo " + args[0], "Saludo", JOptionPane.INFORMATION_MESSAGE);
            
            case 2 -> JOptionPane.showMessageDialog(null, "Hola mundo " + args[0] + " " + args[1], "Saludo", JOptionPane.INFORMATION_MESSAGE);
            
            case 3 -> JOptionPane.showMessageDialog(null, "Hola mundo " + args[0] + " " + args[1] + " " + args[2], "Saludo", JOptionPane.INFORMATION_MESSAGE);
            
            default -> JOptionPane.showMessageDialog(null, "Número de parametros no aceptado.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
*/

public class HolaMundo
{
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    
    public HolaMundo(String nombre, String aPaterno, String aMaterno)
    {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }
    
    public HolaMundo()
    {
    }
    
    public static void main(String args[])
    {
        HolaMundo Saludo1 = new HolaMundo("Cristian Martín", "Vázquez", "González");
        HolaMundo Saludo2 = new HolaMundo();
        
        JOptionPane.showMessageDialog(null,
                                    Saludo1.nombre + " " + Saludo1.aPaterno + " " + Saludo1.aMaterno,
                                    "Hola Mundo!", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                                    Saludo2.nombre + " " + Saludo2.aPaterno + " " + Saludo2.aMaterno,
                                    "Hola Mundo!", JOptionPane.INFORMATION_MESSAGE);
    }
}