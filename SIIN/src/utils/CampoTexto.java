/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Vázquez González Cristian Martín
 */
public class CampoTexto extends JTextField{//Herencia
        public static final int SOLO_NUMEROS = 1;
        public static final int SOLO_LETRAS_MAY = 2;
        public static final int SOLO_LETRAS_MIN = 3;
        public static final int SOLO_LETRAS_ACENTUADAS = 4;
        public static final int SOLO_LETRAS_ACENTUADAS_MAY = 5;
        public static final int SOLO_LETRAS_ACENTUADAS_MIN = 6;
        public static final int SOLO_CARACTERES_ESPECIALES = 7;
        
        public CampoTexto(){
            
        }
        
        public CampoTexto(int valorMax,Color focusGanado,Color focusPerdido, int caracter){
            addFocusListener(new FocusListener(){//Esto es una clase anónima
                @Override
                public void focusGained(FocusEvent e) {
                    setBackground(focusGanado);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    setBackground(focusPerdido);
                }
            });
            
            addKeyListener(new KeyAdapter(){                
                public void keyTyped(KeyEvent e){
                    int k = e.getKeyChar();
                    char c = e.getKeyChar();
                    
                    System.out.println("Teclado" + k);
                    System.out.println("Teclado" + c);
                    
                    int opcion = caracter;
                    
                    switch(opcion){
                        case 1: 
                            System.out.println("Solo números " + caracter);
                            if (k>=32 && k<=47 || k>=58 && k<=255){
                            e.setKeyChar((char) KeyEvent.VK_CLEAR);                            
                        }
                        break;
                        
                        case 4:
                            System.out.println("Solo letras acentuadas " + caracter);
                            if(!(c=='\u00E1' || c=='\u00C1' || c=='\u00E9' || c=='\u00C9'
                              || c=='\u00ED' || c=='\u00CD' || c=='\u00F3' || c=='\u00D3'
                              || c=='\u00FA' || c=='\u00DA' || c=='\u00F1' || c=='\u00D1'
                              || c=='\u00DC' || c=='\u00FC' || c==' ')){
                                e.consume();
                            }
                        break;
                        
                        default:
                            System.out.println("Cualquier tecla.");
                    }
                    
                    if(getText().length() >= valorMax){
                        e.consume();
                    }
                }
                
            });
        }  
}
