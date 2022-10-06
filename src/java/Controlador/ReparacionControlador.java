/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ReparacionDAO;
import ModeloVO.ReparacionVO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
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
@WebServlet(name = "ReparacionControlador", urlPatterns = {"/Reparacion"})
@MultipartConfig
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
        String idTimbre = request.getParameter("txtidTimbre");
        String idEmpleado = request.getParameter("txtidEmpleado");
        String numeroSolicitud = request.getParameter("txtnumeroSolicitud");
        String motivoArreglo = request.getParameter("txtmotivoArreglo");
        String fechaReparacion = request.getParameter("txtfechaReparacion");
        String fechaReporte = request.getParameter("txtfechaReporte");
        Part fotoReparacion = request.getPart("txtfotoReparacion");             
        InputStream inputStream = fotoReparacion.getInputStream();        
        String estadoSolicitud = request.getParameter("txtestadoSolicitud");

        ReparacionVO RepVO = new  ReparacionVO(fechaReparacion, idTimbre, idEmpleado, numeroSolicitud, motivoArreglo, fechaReparacion, fechaReporte,  inputStream, estadoSolicitud);
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
