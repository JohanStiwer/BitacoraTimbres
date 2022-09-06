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

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
