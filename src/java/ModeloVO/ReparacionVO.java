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
public class ReparacionVO {

    private String idReparacion, idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte, estadoSolicitud, fotoReparacion;
    
    //Para constructor del inner 
    private String piso, habitacion, nombre, apellidos;

    

    public ReparacionVO(String motivoArreglo, String fechaReparacion, String fechaReporte, String fotoReparacion, String piso, String habitacion, String nombre, String apellidos) {
        this.motivoArreglo = motivoArreglo;
        this.fechaReparacion = fechaReparacion;
        this.fechaReporte = fechaReporte;
        this.fotoReparacion = fotoReparacion;
        this.piso = piso;
        this.habitacion = habitacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    //Creando constructor con 10 variables para listar las solicitudes 

    public ReparacionVO(String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, String estadoSolicitud, String fotoReparacion, String piso, String habitacion, String nombre, String apellidos) {
        this.numeroSolicitud = numeroSolicitud;
        this.motivoArreglo = motivoArreglo;
        this.fechaReparacion = fechaReparacion;
        this.fechaReporte = fechaReporte;
        this.estadoSolicitud = estadoSolicitud;
        this.fotoReparacion = fotoReparacion;
        this.piso = piso;
        this.habitacion = habitacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    
    //SELECT piso, habitacion, numeroSolicitud, motivoDeArreglo, fechaReparacion, fechaReporte, fotoReparacion, nombre, apellidos"
    //         + " FROM reparacion INNER JOIN timbre ON reparacion.idTimbre = timbre.idTimbre INNER JOIN"
    //       + " empleado ON empleado.idEmpleado = reparacion.idEmpleado";
    public ReparacionVO() {
    }

    public ReparacionVO(String idReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, String estadoSolicitud, String fotoReparacion) {
        this.idReparacion = idReparacion;
        this.idTimbre = idTimbre;
        this.idEmpleado = idEmpleado;
        this.numeroSolicitud = numeroSolicitud;
        this.motivoArreglo = motivoArreglo;
        this.fechaReparacion = fechaReparacion;
        this.fechaReporte = fechaReporte;
        this.estadoSolicitud = estadoSolicitud;
        this.fotoReparacion = fotoReparacion;
    }
    
    
    
      public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
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
    
    
    
    
    
    

    public String getFotoReparacion() {
        return fotoReparacion;
    }

    public void setFotoReparacion(String fotoReparacion) {
        this.fotoReparacion = fotoReparacion;
    }

    public String getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(String idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getIdTimbre() {
        return idTimbre;
    }

    public void setIdTimbre(String idTimbre) {
        this.idTimbre = idTimbre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getMotivoArreglo() {
        return motivoArreglo;
    }

    public void setMotivoArreglo(String motivoArreglo) {
        this.motivoArreglo = motivoArreglo;
    }

    public String getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(String fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

}
