
package com.redes.verificacion;

import java.awt.event.KeyEvent;

public class Verificacion {
    
    public void validarNumeros (KeyEvent evt){
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            evt.consume();
            
        }
    }
    public void validarLetras(KeyEvent evt){
        char validar=evt.getKeyChar();
        if(validar >=33 && validar <=64
                || validar >=91 && validar <= 96
                || validar >=91 && validar <= 96){
            evt.consume();
        }
            
    }
    public void validarLetrasNumeros (KeyEvent evt){
    char validar =evt.getKeyChar();
    if (!Character.isLetterOrDigit(validar)){
        evt.consume();
    }
    
    }
}