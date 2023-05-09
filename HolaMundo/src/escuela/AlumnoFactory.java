/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;
import javax.swing.JOptionPane;

/**
 *
 * @author marvaz
 */
public class AlumnoFactory
{
    public static void main(String args[])
    {
        Alumno a1 = new Alumno(0,"318352392","Cristian Martín Vázquez González","27 de marzo de 2002",20);
        Alumno a2 = new Alumno();

        JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a1.getNumCuenta() + "\n" 
                                          + "Nombre: " + a1.getNombre() + "\n" 
                                          + "Fecha nacimiento: " + a1.getFechaNacimiento() + "\n" 
                                          + "edad: " + a1.getEdad(), 
                                            "Valores alumno 1", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a2.getNumCuenta() + "\n" 
                                          + "Nombre: " + a2.getNombre() + "\n" 
                                          + "Fecha nacimiento: " + a2.getFechaNacimiento() + "\n" 
                                          + "edad: " + a2.getEdad(), 
                                            "Valores alumno 2", JOptionPane.INFORMATION_MESSAGE);
       
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
    
    public void alcanzarNunca()
    {
        
    }
    
    public static void alcanzarSiempre()
    {
        
    }
}
