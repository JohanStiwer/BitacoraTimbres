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

    private String idReparacion, idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte, estadoSolicitud;
    private InputStream fotoReparacion;

    private String streamToString = fotoReparacion.toString();

    public ReparacionVO() {
    }

    public ReparacionVO(String idReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, InputStream fotoReparacion, String estadoSolicitud) {
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

    public ReparacionVO(String idReparacion, String idTimbre, String idEmpleado, String numeroSolicitud, String motivoArreglo, String fechaReparacion, String fechaReporte, String estadoSolicitud, String streamToString) {
        this.idReparacion = idReparacion;
        this.idTimbre = idTimbre;
        this.idEmpleado = idEmpleado;
        this.numeroSolicitud = numeroSolicitud;
        this.motivoArreglo = motivoArreglo;
        this.fechaReparacion = fechaReparacion;
        this.fechaReporte = fechaReporte;
        this.streamToString = streamToString;
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getStreamToString() {
        return streamToString;
    }

    public void setStreamToString(String streamToString) {
        this.streamToString = streamToString;
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

    public InputStream getFotoReparacion() {
        return fotoReparacion;
    }

    public void setFotoReparacion(InputStream fotoReparacion) {
        this.fotoReparacion = fotoReparacion;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

}
