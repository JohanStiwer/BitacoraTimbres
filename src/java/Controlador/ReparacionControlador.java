/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ReparacionDAO;
import ModeloVO.ReparacionVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
/**
 *
 * @author Damian
 */
@MultipartConfig
@WebServlet(name = "ReparacionControlador", urlPatterns = {"/Reparacion"})

public class ReparacionControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ReparacionDAO rDAO = new ReparacionDAO();
        String idReparacion = request.getParameter("txtIdReparacion");
        String idTimbre = request.getParameter("txtidTimbre");
        String idEmpleado = request.getParameter("txtidEmpleado");
        String numeroSolicitud = request.getParameter("txtnumeroSolicitud");
        String motivoArreglo = request.getParameter("txtmotivoArreglo");
        String fechaReparacion = request.getParameter("txtfechaReparacion");
        String fechaReporte = request.getParameter("txtfechaReporte");
        String estadoSolicitud = request.getParameter("txtestadoSolicitud");
        String fotoReparacion = "txtFotoReparacion";
        //Imagen
        Part part = request.getPart("fileReparacion");
        if (part != null) {
            if (rDAO.idExtension(part.getSubmittedFileName())) {
                fotoReparacion = rDAO.guardarArchivo(part);
            } else {
                request.setAttribute("MensajeError", "Esa extension no es permitida.\\Solamente archivos .jpg, .jpeg o .png");
                //El request redirecciona para el registro del empleado
                request.getRequestDispatcher("RegistrarReparacion.jsp").forward(request, response);
            }
        }
        ReparacionVO RepVO = new ReparacionVO(idReparacion, idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte, estadoSolicitud, fotoReparacion);
        ReparacionDAO RepDAO = new ReparacionDAO(RepVO);

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //Administrar las variables
        switch (opcion) {
            case 1: //Agregar registro                            
                //Se crea if para entrar al metodo de agregar registro
                if (RepDAO.agregarRegistro()) {
                    //Se imprime mensaje de exito
                    request.setAttribute("MensajeExito", "La reparacion se registró correctamente");
                    //El request redirecciona para el registro del empleado
                    request.getRequestDispatcher("RegistrarReparacion.jsp").forward(request, response);
                } else {
                    //Se crea atributo cuando hay un error
                    request.setAttribute("MensajeError", "La reparacion no fue registrado correctamente");
                    //Se redirecciona al JSP del empleado
                    request.getRequestDispatcher("RegistrarReparacion.jsp").forward(request, response);
                }
                break;
            case 2: //Consultar por Id de Reparacion 

                //Creando VO para que se pasen los id 
                ReparacionVO numeroId = RepVO;
                //numeroId = RepDAO.consultarId(idReparacion);
                //Se crea if para entrar al metodo de actualizar registro
                RepVO = RepDAO.consultarReparacion(idReparacion);
                if (RepVO != null) {
                    //Se imprime mensaje de exito
                    request.setAttribute("datosReparacion", RepVO);
                    //Se parcea el dato que trae el id 
                    request.setAttribute("obtenerIds", numeroId);
                    request.getRequestDispatcher("ActualizarReparacion.jsp").forward(request, response);

                } else {
                    request.setAttribute("MensajeError", "Ese numero de reparacion no existe. Verifique de nuevo");
                    request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                }
                break;

            case 3:
                //Condicional que entra al metodo de actualizar de registro 
                if (RepDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "Se ha actualizado con exito");                    
                    request.getRequestDispatcher("ActualizarReparacion.jsp").forward(request, response);
                    System.out.println("Esta en el iiiiiiiiiiiif");
                } else {
                    
                    request.setAttribute("MensajeError", "No se pudo actualizar con exito. Vuelva a intentarlo");
                    request.getRequestDispatcher("ActualizarReparacion.jsp").forward(request, response);
                        System.out.println("Esta en el elseeeeeeeeeeeeeeeeeeeee");
                }
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
