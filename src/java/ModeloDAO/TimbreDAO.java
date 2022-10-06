/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.TimbreVO;
import java.sql.Connection;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damian
 */
public class TimbreDAO extends Conexion {

    //1. Declarar variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idTimbre = "", piso = "", fase = "", habitacion = "";

    public TimbreDAO() {
    }

    public TimbreDAO(TimbreVO timbreVO) {
        super();
        try {
            conexion = this.obtenerConexion();

            idTimbre = timbreVO.getIdTimbre();
            piso = timbreVO.getPiso();
            fase = timbreVO.getFase();
            habitacion = timbreVO.getHabitacion();
        } catch (Exception e) {
            Logger.getLogger(TimbreDAO.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public ArrayList<TimbreVO> Listar() {
        ArrayList<TimbreVO> listaTimbres = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from timbre";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                TimbreVO timbreVO = new TimbreVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));
                listaTimbres.add(timbreVO);
            }
        } catch (Exception e) {
            Logger.getLogger(TimbreDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(TimbreDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaTimbres;
    }
}
