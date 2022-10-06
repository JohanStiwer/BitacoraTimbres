/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

import java.io.InputStream;
import java.sql.Blob;

/**
 *
 * @author Johan Stiwer
 */
public class ReparacionVO {
    
    private String idReparacion, idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte,  estadoSolicitud;
    private Blob fotoReparacion;

    public ReparacionVO() {
    }

    
    public ReparacionVO(String idReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, Blob fotoReparacion, String estadoSolicitud) {
        this.idReparacion = idReparacion;
        this.idTimbre = idTimbre;
        this.idEmpleado = idEmpleado;
        this.numeroSolicitud = numeroSolicitud;
        this.motivoArreglo = motivoArreglo;
        this.fechaReparacion = fechaReparacion;
        this.fechaReporte = fechaReporte;
        this.fotoReparacion = fotoReparacion;
        this.estadoSolicitud = estadoSolicitud;
    }

    public ReparacionVO(String fotoReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, String fotoReparacion0, String estadoSolicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ReparacionVO(String fechaReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion0, String fechaReporte, InputStream inputStream, String estadoSolicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Blob getFotoReparacion() {
        return fotoReparacion;
    }

    public void setFotoReparacion(Blob fotoReparacion) {
        this.fotoReparacion = fotoReparacion;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
 
        
    
    
}
