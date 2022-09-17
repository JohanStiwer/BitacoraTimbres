/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.EmpleadoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stiwer
 */
public class EmpleadoDAO extends Conexion implements Crud {

    public static EmpleadoDAO create(EmpleadoVO EmpVO) {
        return new EmpleadoDAO(EmpVO);
    }

    //1. Declaramos la variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idEmpleado = "", nombre = "", apellidos = "", estado = "", numeroDocumento = "", correo = "", clave = "";

    public EmpleadoDAO() {
    }

    //Se reciben datos del VO
    public EmpleadoDAO(EmpleadoVO EmpVO) {
        super();
        try {

            conexion = this.obtenerConexion();

            idEmpleado = EmpVO.getIdEmpleado();
            nombre = EmpVO.getNombre();
            apellidos = EmpVO.getApellidos();
            estado = EmpVO.getEstado();
            numeroDocumento = EmpVO.getNumeroDocumento();
            correo = EmpVO.getCorreo();

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO empleado ( nombre, apellidos, estado, numeroDocumento, correo, clave) VALUES (?, ?, ?, ?, ?, ?);";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, apellidos);
            puente.setString(3, estado);
            puente.setString(4, numeroDocumento);
            puente.setString(5, correo);
            puente.setString(6, clave);
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

    public EmpleadoVO consultarEmpleado(String numeroDocumento) {

        //Creamos objeto vacio
        EmpleadoVO empVO = null;
        //Insertamos la sentencia dentro de un try catch 
        try {
            //obtenemos conexion
            conexion = this.obtenerConexion();
            //Insertamos query
            sql = "SELECT * FROM EMPLEADO WHERE NumeroDocumento=?";
            //Cargamos query
            puente.setString(1, numeroDocumento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                empVO = new EmpleadoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));
            }
        } catch (SQLException e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return empVO;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //Declaramos la consulta SQL
            sql = "UPDATE EMPLEADO SET nombre = ?, apellidos = ?, estado = ?, numeroDocumento = ?, correo = ?    WHERE numeroDocumento = ? ";
            
            puente = conexion.prepareStatement(sql);
            
            puente.setString(1, nombre);
            puente.setString(2, apellidos);
            puente.setString(3, estado);
            puente.setString(4, numeroDocumento);
            puente.setString(5, correo);
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
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmpleadoVO actualizarDatos(String documento) {

        EmpleadoVO empVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select nombre, apellidos, estado, numeroDocumento, correo NumeroDocumento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, documento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                empVO = new EmpleadoVO(mensajero.getString(1), mensajero.getString("nombre"), mensajero.getString("apellidos"), mensajero.getString("estado"), mensajero.getString("numeroDocumento"), mensajero.getString("correo"));
            }

        } catch (SQLException e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return empVO;
    }

    public ArrayList<EmpleadoVO> listar() {
        ArrayList<EmpleadoVO> listaEmpleado = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from empleado";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                EmpleadoVO empVO = new EmpleadoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));

                listaEmpleado.add(empVO);
            }
        } catch (Exception e) {
        }

        return listaEmpleado;
    }

}
