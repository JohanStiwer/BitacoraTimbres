/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ReparacionVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damian
 */
public class ReparacionDAO extends Conexion implements Crud {

    //1. Declaramos la variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idReparacion = "", idTimbre = "", idEmpleado = "", numeroSolicitud = "", motivoArreglo = "", fechaReparacion = "", fechaReporte = "", fotoReparacion = "", estadoSolicitud = "";

    public ReparacionDAO() {
    }

    public ReparacionDAO(ReparacionVO RepVO) {
        super();
        try {
            conexion = this.obtenerConexion();

            idReparacion = RepVO.getIdReparacion();
            idTimbre = RepVO.getIdTimbre();
            idEmpleado = RepVO.getIdEmpleado();
            numeroSolicitud = RepVO.getNumeroSolicitud();
            motivoArreglo = RepVO.getMotivoArreglo();
            fechaReparacion = RepVO.getFechaReparacion();
            fechaReporte = RepVO.getFechaReporte();
            fotoReparacion = RepVO.getFotoReparacion();
            estadoSolicitud = RepVO.getEstadoSolicitud();
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO reparacion ( idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte,fotoReparacion, estadoSolicitud ) VALUES (?, ?, ?, ?, ?, ?, ?,? );";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idTimbre);
            puente.setString(2, idEmpleado);
            puente.setString(3, numeroSolicitud);
            puente.setString(4, motivoArreglo);
            puente.setString(5, fechaReparacion);
            puente.setString(6, fechaReporte);
            puente.setString(7, fotoReparacion);
            puente.setString(8, estadoSolicitud);

            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
