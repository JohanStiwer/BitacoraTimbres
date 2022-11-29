/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ReparacionVO;
import Util.Conexion;
import Util.Crud;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

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
    private String fotoReparacion;
    private String piso = "", habitacion = "", nombre = "", apellidos = "";

    //Definimos que tipo de archivos se pueden subir 
    private String[] extensiones = {".png", ".jpg", ".jpeg"};
    //Definimos ruta donde se encuentran las imagenes 
    private String rutaCarpeta = "C:\\xampp\\htdocs\\IMAGENES";
    //Se usa metodo upload para subir el archivo
    private File uploads = new File(rutaCarpeta);

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
            piso = RepVO.getPiso();
            habitacion = RepVO.getHabitacion();
            nombre = RepVO.getNombre();
            apellidos = RepVO.getApellidos();
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
            puente.setString(7, fotoReparacion);
            puente.setString(8, estadoSolicitud);

            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        return operacion;

    }

    //Metodo para guardar archivo 
    public String guardarArchivo(Part part) {
        //Creamos la ruta absoluta vacia
        String pathAbsolute = "";

        //Crear copia de la carpeta 
        try {
            Path path = Paths.get(part.getSubmittedFileName());
            String fileName = path.getFileName().toString();
            InputStream input = part.getInputStream();
            if (input != null) {
                //Esta es la ruta 
                pathAbsolute = "http://localhost/IMAGENES/" + fileName;
                File file = new File(uploads, fileName);
                Files.copy(input, file.toPath());
            }
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return pathAbsolute;
    }

    //Definir extensiones validas 
    public boolean idExtension(String fileName) {
        for (String et : extensiones) {
            if (fileName.toLowerCase().endsWith(et)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<ReparacionVO> listarReparacion() {
        //Creamos una array list con el objeto de reparacion VO 
        ArrayList<ReparacionVO> listaReparciones = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from reparacion";
            //cargamos query 
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                ReparacionVO repVO = new ReparacionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                listaReparciones.add(repVO);
            }
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return listaReparciones;
    }

    public ArrayList<ReparacionVO> listarSolicitud() {
        //Creamos una array list con el objeto de reparacion VO 
        ArrayList<ReparacionVO> listaSolicitudes = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT idReparacion, reparacion.idTimbre, piso, habitacion, numeroSolicitud, motivoDeArreglo, fechaReparacion, fechaReporte, fotoReparacion, nombre, apellidos, estadoSolicitud "
                    + " FROM reparacion INNER JOIN timbre ON reparacion.idTimbre = timbre.idTimbre INNER JOIN"
                    + " empleado ON empleado.idEmpleado = reparacion.idEmpleado";
            //cargamos query 
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            listaSolicitudes = new ArrayList<ReparacionVO>();

            while (mensajero.next()) {
                ReparacionVO repVO = new ReparacionVO();

                repVO.setIdReparacion(mensajero.getString("idReparacion"));
                repVO.setIdTimbre(mensajero.getString("reparacion.idTimbre"));
                repVO.setPiso(mensajero.getString("piso"));
                repVO.setHabitacion(mensajero.getString("habitacion"));
                repVO.setNumeroSolicitud(mensajero.getString("numeroSolicitud"));
                repVO.setMotivoArreglo(mensajero.getString("motivoDeArreglo"));
                repVO.setFechaReparacion(mensajero.getString("fechaReparacion"));
                repVO.setFechaReporte(mensajero.getString("fechaReporte"));
                repVO.setFotoReparacion(mensajero.getString("fotoReparacion"));
                repVO.setNombre(mensajero.getString("nombre"));
                repVO.setApellidos(mensajero.getString("apellidos"));
                repVO.setEstadoSolicitud(mensajero.getString("estadoSolicitud"));

                listaSolicitudes.add(repVO);
            }
        } catch (Exception e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaSolicitudes;
    }

    public ReparacionVO consultarReparacion(String id) {

        //Creamos objeto vacio
        ReparacionVO repVO = null;
        //Insertamos la sentencia dentro de un try catch 
        try {
            //obtenemos conexion
            conexion = this.obtenerConexion();
            //Insertamos query
            sql = "SELECT idReparacion, reparacion.idTimbre, reparacion.idempleado, piso, habitacion, numeroSolicitud, motivoDeArreglo, fechaReparacion, fechaReporte, fotoReparacion, nombre, apellidos, estadoSolicitud "
                    + " FROM reparacion INNER JOIN timbre ON reparacion.idTimbre = timbre.idTimbre INNER JOIN"
                    + " empleado ON empleado.idEmpleado = reparacion.idEmpleado where idReparacion=?";
            //Cargamos query
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                repVO = new ReparacionVO();
                repVO.setIdReparacion(mensajero.getString("idReparacion"));
                repVO.setIdTimbre(mensajero.getString("reparacion.idTimbre"));
                repVO.setIdEmpleado(mensajero.getString("reparacion.idempleado"));
                repVO.setPiso(mensajero.getString("piso"));
                repVO.setHabitacion(mensajero.getString("habitacion"));
                repVO.setNumeroSolicitud(mensajero.getString("numeroSolicitud"));
                repVO.setMotivoArreglo(mensajero.getString("motivoDeArreglo"));
                repVO.setFechaReparacion(mensajero.getString("fechaReparacion"));
                repVO.setFechaReporte(mensajero.getString("fechaReporte"));
                repVO.setFotoReparacion(mensajero.getString("fotoReparacion"));
                repVO.setNombre(mensajero.getString("nombre"));
                repVO.setApellidos(mensajero.getString("apellidos"));
                repVO.setEstadoSolicitud(mensajero.getString("estadoSolicitud"));
                repVO.setIdReparacion(mensajero.getString("idReparacion"));
            }
        } catch (SQLException e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return repVO;
    }

    public ReparacionVO consultarId(String id) {

        //Creamos objeto vacio
        ReparacionVO repVO = null;
        //Insertamos la sentencia dentro de un try catch 
        try {
            //obtenemos conexion
            conexion = this.obtenerConexion();
            //Insertamos query
            sql = "SELECT * FROM REPARACION WHERE IDREPARACION = ?";
            //Cargamos query
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                repVO = new ReparacionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
            }
        } catch (SQLException e) {
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return repVO;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //Declaramos la consulta SQL
            sql = "UPDATE REPARACION SET  idtimbre=?, idEmpleado=?, numeroSolicitud=?, motivoDeArreglo=?, fechaReparacion=?, fechaReporte=?,  estadoSolicitud=? WHERE reparacion.idReparacion = ?  ";

            puente = conexion.prepareStatement(sql);

            puente.setString(1, idTimbre);
            puente.setString(2, idEmpleado);
            puente.setString(3, numeroSolicitud);
            puente.setString(4, motivoArreglo);
            puente.setString(5, fechaReparacion);
            puente.setString(6, fechaReporte);
            puente.setString(7, estadoSolicitud);
            puente.setString(8, idReparacion);
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

}
