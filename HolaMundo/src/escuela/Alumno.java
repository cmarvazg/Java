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
public class Alumno
{    
    private int x;//RETIRAR LA X EN LA NUEVA CLASE
    private String numCuenta;
    private String nombre;
    private String fechaNacimiento;
    private int edad;

    public int getX() 
    {
        return x;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public String getNumCuenta() 
    {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) 
    {
        this.numCuenta = numCuenta;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() 
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) 
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
    
    

    public Alumno(int x, String numCuenta, String nombre, String fechaNacimiento, int edad) 
    {
        this.x = x;
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public Alumno() 
    {    
    }
    
    public static void main(String args[])
    {
        /*Alumno a1 = new Alumno(0,"318352392","Martín","27 de marzo de 2002",20);
        Alumno a2 = new Alumno();
        
        JOptionPane.showMessageDialog(null, 
                                    "Número de cuenta: " + a1.numCuenta + "\n" +
                                    "Nombre: " + a1.nombre + "\n" +
                                    "Fecha de nacimiento: " + a1.fechaNacimiento + "\n" +
                                    "Edad: " + a1.edad + "\n",
                                    "Valores del alumno 1: ",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                                    "Número de cuenta: " + a2.numCuenta + "\n" +
                                    "Nombre: " + a2.nombre + "\n" +
                                    "Fecha de nacimiento: " + a2.fechaNacimiento + "\n" +
                                    "Edad: " + a2.edad + "\n",
                                    "Valores del alumno 2: ",JOptionPane.INFORMATION_MESSAGE);*/
        
        AlumnoFactory af = new AlumnoFactory();
        af.alcanzarNunca();//Acceso por medio del objeo cuando no es static
        AlumnoFactory.alcanzarSiempre();//Acceso por medio de la clase cuando es static = alcance de clase

    }  
   @Override
    public String toString(){
        JOptionPane.showMessageDialog(null, "Numero de cuenta: " + getNumCuenta() + "\n" + 
                                                    "Nombre: " + getNombre() + "\n" + 
                                                    "Fecha de nacimiento: " + getFechaNacimiento() + "\n" +  
                                                    "Edad: " + getEdad(), 
                                                    "Valores alumno " + getClass().getName() + "@" + Integer.toHexString(hashCode()), JOptionPane.INFORMATION_MESSAGE);
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
