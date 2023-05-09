/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
//PAQUETES IMPORTADOS
import java.awt.event.WindowAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * @author Vázquez González Cristian Martín
 */
public class OtraVentana extends WindowAdapter implements ActionListener {
    //DECLARACIÓN DE OBJETOS
    JFrame ov;
    JButton btnOprimir;
    JButton btnSalir;
    ImageIcon iconSalir,iconNuevo,iconAbrir;
    ImageIcon iconCerrar,iconEditar,iconCopiar;
    ImageIcon iconPegar, iconSeleccionar, iconInformacion,iconAcercaDe;
    JMenuBar jmb;
    JMenu jmArchivo, jmEdicion, jmAyuda;
    JMenuItem jmiNuevo, jmiAbrir, jmiCerrar, jmiSalir;
    JMenuItem jmiCopiar, jmiPegar, jmiSeleccionar;
    JMenuItem jmiAcercaDe;
    
    //MÉTODO CONSTRUCTOR
    public OtraVentana(){
        //JFrame
        ov = new JFrame("Ejercicio");
        ov.setLayout(null);
        ov.getContentPane().setBackground(new Color(150,150,150));
        ov.setResizable(true);
        ov.setSize(600,300);
        ov.addWindowListener(this);
        ov.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        //JMenuBar
        jmb = new JMenuBar();
        
        //JMenu Archivo
        jmArchivo = new JMenu("Archivo");
        jmArchivo.setMnemonic('A');
        iconAbrir = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Abrir.png");
        jmArchivo.setIcon(iconAbrir);
        
            //JMenuItem's de Archivo
            iconNuevo = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Nuevo.png");
            jmiNuevo = new JMenuItem("Nuevo...",iconNuevo);
            jmiNuevo.setMnemonic('N');
            
            iconAbrir = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Abrir.png");
            jmiAbrir = new JMenuItem("Abrir...",iconAbrir);
            jmiAbrir.setMnemonic('B');
            
            iconCerrar = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Cerrar.png");
            jmiCerrar = new JMenuItem("Cerrar",iconCerrar);
            jmiCerrar.setMnemonic('C');
            
            iconSalir = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Salir.png");
            jmiSalir = new JMenuItem("Salir",iconSalir);
            jmiSalir.setMnemonic('S');
            
        //JMenu Edicion
        jmEdicion = new JMenu("Edición");
        jmEdicion.setMnemonic('C');
        iconEditar = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Editar.png");
        jmEdicion.setIcon(iconEditar);
            
            //JMenuItem's de Edicion
            iconCopiar = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Copiar.png");
            jmiCopiar = new JMenuItem("Copiar",iconCopiar);
            jmiCopiar.setMnemonic('O');
            
            iconPegar = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Pegar.png");
            jmiPegar = new JMenuItem("Pegar",iconPegar);
            jmiPegar.setMnemonic('P');
            
            iconSeleccionar = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Seleccionar.png");
            jmiSeleccionar = new JMenuItem("Seleccionar...",iconSeleccionar);
            jmiSeleccionar.setMnemonic('L');
        
        //JMenu Ayuda
        jmAyuda = new JMenu("Ayuda");
        jmAyuda.setMnemonic('Y');
        iconInformacion = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "Informacion.png");
        jmAyuda.setIcon(iconInformacion);
        
            //JMenuItem de Ayuda
            iconAcercaDe = new ImageIcon("Images" + File.separator + "16Pixeles" + File.separator + "AcercaDe.png");
            jmiAcercaDe = new JMenuItem("Acerca de...",iconAcercaDe);
            jmiAcercaDe.setMnemonic('D');
            
        //Añadiendo los JMenuItems's del JMenu Archivo
        jmArchivo.add(jmiNuevo);
        jmArchivo.add(jmiAbrir);
        jmArchivo.add(jmiCerrar);
        jmArchivo.addSeparator();
        jmArchivo.add(jmiSalir);
        
        //Añadiendo actionListener a el JMenuItem Salir
        jmiSalir.addActionListener(
                new ActionListener(){         
                @Override
                 public void actionPerformed(ActionEvent e){
                    if (JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?",
                                                            "Salir", JOptionPane.YES_NO_OPTION, 
                                                            JOptionPane.QUESTION_MESSAGE,
                                                            iconSalir) == JOptionPane.YES_OPTION){
                        ov.dispose();
                        System.exit(0);
                    }
                }
            }
        );
        
        //Añadiendo los JMenuItem's del JMenu Edicion
        jmEdicion.add(jmiCopiar);
        jmEdicion.add(jmiPegar);
        jmEdicion.add(jmiSeleccionar);
        
        //Añadiendo el JMEnuItem del JMenu Ayuda
        jmAyuda.add(jmiAcercaDe);
        
        //Añadiendo los JMenu's del JMenuBar
        jmb.add(jmArchivo);
        jmb.add(jmEdicion);
        jmb.add(jmAyuda);
        
        //Agregando el JMenuBar al JFrame ov
        ov.setJMenuBar(jmb);
        
        //JButton's
        btnOprimir = new JButton("Oprimir");
        btnOprimir.setBounds(10, 50, 100, 30);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10, 100, 100, 30);
        
        //Añadiendo actionListener al Boton "Oprimir"
        btnOprimir.addActionListener(
            new ActionListener(){//Sobreescritura de método, NO DE OBJETO
                @Override
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null, "Me acabas de oprimir.", 
                                                        "Mensaje", 
                                                        JOptionPane.INFORMATION_MESSAGE);                
                }
            }                
        );
        
        //Añadiendo actionListener al Boton "Salir"
        btnSalir.addActionListener(
            new ActionListener(){         
                @Override
                 public void actionPerformed(ActionEvent e){
                    if (JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?",
                                                            "Salir", JOptionPane.YES_NO_OPTION, 
                                                            JOptionPane.QUESTION_MESSAGE,
                                                            iconSalir) == JOptionPane.YES_OPTION){
                        ov.dispose();
                        System.exit(0);
                    }
                }
            }                
        );
        
        //Añadiendo JButton's al JFrame ov
        ov.add(btnOprimir);
        ov.add(btnSalir);
        
        //EscuchadorDeAccion eda = new EscuchadorDeAccion();
        //btn.addActionListener(btn);
        //btn.addActionListener(this);
        //btn.addActionListener(new EscuchadorDeAccion());//Este método le dice al botón quién es su escucha, es un objeto anónimo
        
        //Mostrando el frame
        ov.setVisible(true);
        ov.setLocationRelativeTo(null);
    }
    
    public static void main(String args[]){
        new OtraVentana();
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        System.out.print("Cerrando la ventana");
        if(JOptionPane.showConfirmDialog(null,"¿Desea salir?","Confirmación",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconSalir)==JOptionPane.YES_OPTION){
            ov.dispose();
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
