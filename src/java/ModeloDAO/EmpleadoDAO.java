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

    //Metodo para listar empleados
    public ArrayList<EmpleadoVO> obtenerEmpleados() {
        //Creamos un Array list para listar todos los empleados registrados 
        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList<>();
        //Generamos la consulta dentro de un try catch 
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT nombre, apellidos, numeroDocumento, estado, correo FROM empleado order by idEmpleado ASC";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            listaEmpleados = new ArrayList<EmpleadoVO>();

            //Creamos un ciclo while para que se imprima un empleado
            while (mensajero.next()) {
                EmpleadoVO empVO = new EmpleadoVO();

                empVO.setNombre(mensajero.getString("nombre"));
                empVO.setApellidos(mensajero.getString("apellidos"));
                empVO.setNumeroDocumento(mensajero.getString("numeroDocumento"));
                empVO.setEstado(mensajero.getString("estado"));
                empVO.setCorreo(mensajero.getString("correo"));

                listaEmpleados.add(empVO);
            }

            listaEmpleados = new ArrayList<EmpleadoVO>();
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
            return listaEmpleados;
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

}
