/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;
import utils.CampoTexto;

/**
 *
 * @author Vázquez González Critian Martín
 */
public class VentanaPrueba {
    JFrame jf;
    CampoTexto cajita01, cajita02,cajita03;
    
    public VentanaPrueba(){
        jf = new JFrame("Ventana de prueba");
        jf.setLayout(null);
        jf.getContentPane().setBackground(new Color(150,150,150));
        jf.setResizable(true);
        jf.setSize(600, 700);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        cajita01 = new CampoTexto(10, Color.WHITE, Color.LIGHT_GRAY, CampoTexto.SOLO_LETRAS_MAY);
        cajita02 = new CampoTexto(20, Color.WHITE, Color.LIGHT_GRAY, CampoTexto.SOLO_LETRAS_ACENTUADAS);
        cajita03 = new CampoTexto(30, Color.WHITE, Color.LIGHT_GRAY, CampoTexto.SOLO_NUMEROS);
        
        cajita01.setBounds(10, 100, 150, 30);
        cajita02.setBounds(10, 150, 150, 30);
        cajita03.setBounds(10, 200, 150, 30);
        
        jf.add(cajita01);
        jf.add(cajita02);
        jf.add(cajita03);
        
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
    
    public static void main(String args[]){
        new VentanaPrueba();
    }
}
