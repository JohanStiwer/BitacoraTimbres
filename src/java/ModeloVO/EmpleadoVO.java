/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Johan Stiwer
 */
public class EmpleadoVO {
    
    //Definimos variables 
    private String idEmpleado, nombre, apellidos, estado, numeroDocumento, correo, clave;
    
    //Se crea constructor vacio 

    public EmpleadoVO() {
    }
    //Se crea constructor con todas las variables definidas

    public EmpleadoVO(String idEmpleado, String nombre, String apellidos, String estado, String numeroDocumento, String correo, String clave) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.clave = clave;
    }
    
    //Se crean getter and setter

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public EmpleadoVO(String clave) {
        this.clave = clave;
    }
    
}
