
package com.redes.estudiantes;

public class Estudiante {
    int idEstudiante;
    String nombre;
    String apellido;
    String nivel;
    int telefono;
    String correo;
    String direccion;
    byte [] imagen;
    int usuarioId;
    
    public Estudiante(){
        
    }

    public Estudiante(int idEstudiante, String nombre,String apellido, String nivel, int telefono, String correo, String direccion, byte[] imagen, int usuarioId) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.imagen = imagen;
        this.usuarioId = usuarioId;
    }

     

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public Estudiante(String apellido) {
        this.apellido = apellido;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    
    
}
