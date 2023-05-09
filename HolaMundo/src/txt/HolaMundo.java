/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package txt;

/**
 *
 * @author Cristian Martín Vázquez González
 * @version 23/08/2022
 * @param "Nombre(s)" ApellidoPaterno ApellidoMaterno
 */
/*
public class HolaMundo
{
    public static void main(String args[])
    {
        switch(args.length)
        {
            case 0 -> System.out.println("No has ingresado ningun parámetro.");
            
            case 1 -> System.out.println("Hola mundo " + args[0]);
            
            case 2 -> System.out.println("Hola mundo " + args[0] + " " + args[1]);
            
            case 3 -> System.out.println("Hola mundo " + args[0] + " " + args[1] + " " + args[2]);
            
            default -> System.out.println("Número de parametros no aceptado.");
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
        
        System.out.println("Hola Mundo! " + Saludo1.nombre + " " + Saludo1.aPaterno + " " + Saludo1.aMaterno);
        System.out.println("Hola Mundo! " + Saludo2.nombre + " " + Saludo2.aPaterno + " " + Saludo2.aMaterno);
    }
}