/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ReparacionVO;
import Util.Conexion;
import Util.Crud;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import sun.misc.IOUtils;

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

    private String idReparacion = "", idTimbre = "", idEmpleado = "", numeroSolicitud = "", motivoArreglo = "", fechaReparacion = "", fechaReporte = "", estadoSolicitud = "";
    private InputStream fotoReparacion;

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
            sql = "INSERT INTO reparacion ( idTimbre, idEmpleado, numeroSolicitud, motivoDeArreglo, fechaReparacion, fechaReporte,fotoReparacion, estadoSolicitud ) VALUES (?, ?, ?, ?, ?, ?, ?,?);";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idTimbre);
            puente.setString(2, idEmpleado);
            puente.setString(3, numeroSolicitud);
            puente.setString(4, motivoArreglo);
            puente.setString(5, fechaReparacion);
            puente.setString(6, fechaReporte);
            puente.setBlob(7, fotoReparacion);
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

    public ArrayList<ReparacionVO> listarReparacion() {

        ArrayList<ReparacionVO> listaReparaciones = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from reparacion";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            //Parseando el input Stream

            while (mensajero.next()) {
                ReparacionVO repVO = new ReparacionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                listaReparaciones.add(repVO);
            }
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return listaReparaciones;
    }

    public void getImg() {

        try {

        } catch (Exception e) {
        }
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
