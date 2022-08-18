
package com.redes.estudiantes;

import com.redes.conexion.Conexion;
import static com.redes.estudiantes.StudentsForm.idUserLog;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstudiantesQuery {
    Estudiante est=new Estudiante();
    public boolean insetertarEstudiante(Estudiante est) {
        boolean bandera =false;
        Conexion conexion=new Conexion();
        try {
            Connection conn=conexion.getConnection();
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO estudiantes (nombre, apellido, nivel, telefono,correo,direccion, imagen, usuario_id) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, est.getNombre());
            stmt.setString(2, est.getApellido());
            stmt.setString(3, est.getNivel());
            stmt.setInt(4, est.getTelefono());
            stmt.setString(5, est.getCorreo());
            stmt.setString(6, est.getDireccion());
            stmt.setBytes(7, est.getImagen());
            stmt.setInt(8, est.getUsuarioId());
            
            
            if(stmt.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                bandera=true;
            }else{
                JOptionPane.showMessageDialog(null, "ERROR NO SE PUDO REGISTRAR LOS DATOS");            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return bandera;
    }
    public ArrayList<Estudiante> listarEstudiante(int idUser){
        ArrayList<Estudiante> estudiantes=new ArrayList();
        Conexion conexion=new Conexion ();
        try {
            Connection conn=conexion.getConnection();
            PreparedStatement stmt=conn.prepareStatement("SELECT * FROM estudiantes WHERE usuario_id="+idUser);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                int idEstudiante=rs.getInt(1);
                String nombre=rs.getString(2);
                String apellido=rs.getString(3);
                String nivel=rs.getString(4);
                int telefono=rs.getInt(5);
                String correo=rs.getString(6);
                String direccion=rs.getString(7);
                byte[] imagen = rs.getBytes(8);
                Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido, nivel, telefono, correo, direccion, imagen, idUserLog);
                
                estudiantes.add(estudiante);
        }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return estudiantes;
        
    }
}
