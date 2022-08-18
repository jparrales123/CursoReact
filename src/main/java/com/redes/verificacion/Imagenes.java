/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redes.verificacion;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Imagenes {
    public ImageIcon redimensionPicture(String imagenPath, byte [] IMGBLOB, int ancho,int alto){
        ImageIcon imagen;
        if(imagenPath!=null){
            imagen=new ImageIcon(imagenPath);
            }else{
            imagen =new ImageIcon(IMGBLOB);
        }
        
    Image imagenRedimension=imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    ImageIcon imagenFinal=new ImageIcon(imagenRedimension);
    return imagenFinal;
    }
    public String buscarImagen(JLabel JLImagen){
        String imagenPath= "";
        JFileChooser file=new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fileFilter=new FileNameExtensionFilter("*.Images","jpg","png","gif");
        file.addChoosableFileFilter(fileFilter);
        int fileState=file.showSaveDialog(null);
        if(fileState==JFileChooser.APPROVE_OPTION){
            File selectedFile=file.getSelectedFile();
            imagenPath=selectedFile.getAbsolutePath();
            JLImagen.setIcon (redimensionPicture(imagenPath, null, JLImagen.getWidth(), JLImagen.getHeight()));
        }else if(fileState==JFileChooser.CANCEL_OPTION){
            System.out.println("No se ha selecciondo la imagen");
        }
        return imagenPath;
    }
}
