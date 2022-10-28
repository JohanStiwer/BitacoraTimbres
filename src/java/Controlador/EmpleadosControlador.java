/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.EmpleadoDAO;
import ModeloVO.EmpleadoVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stiwer
 */
@WebServlet(name = "EmpleadoControlador", urlPatterns = {"/Empleados"})
public class EmpleadosControlador extends HttpServlet {

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

        String idEmpleado = request.getParameter("txtIdEmpleado");
        String nombre = request.getParameter("txtNombre");
        String Apellidos = request.getParameter("txtApellidos");
        String estado = request.getParameter("txtEstado");
        String numeroDocumento = request.getParameter("txtNumeroDocumento");
        String correo = request.getParameter("txtEmail");
        String clave = request.getParameter("txtClave");
        String claveConfirmacion = request.getParameter("claveConfirmacion");

        EmpleadoVO EmpVo = new EmpleadoVO(idEmpleado, nombre, Apellidos, estado, numeroDocumento, correo, clave);
        EmpleadoDAO EmpDAO = new EmpleadoDAO(EmpVo);

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //Administrar las variables
        switch (opcion) {
            case 1: //Agregar registro

                //Dentro de un if comparamos si las claves coinciden
                if (clave.equals(claveConfirmacion)) {
                    //Se crea if para entrar al metodo de agregar registro
                    if (EmpDAO.agregarRegistro()) {
                        //Se imprime mensaje de exito
                        request.setAttribute("MensajeExito", "El empleado se registró correctamente");
                        //El request redirecciona para el registro del empleado
                        request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                    } else {
                        //Se crea atributo cuando hay un error
                        request.setAttribute("MensajeError", "El empleado no fue registrado correctamente");
                        //Se redirecciona al JSP del empleado
                        request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                    }
                } else {
                    //Si las contraseñas no coinciden se redirecciona 
                    request.setAttribute("claveIncorrecta", "Las contraseñas no coinciden, porfavor intente de nuevo");
                    request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                }
                break;

            case 2://Metodo de actualizar registro
                if (EmpDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "El Empleado se actualizó correctamente");
                    System.out.println("El empleado se registró correctamente");
                } else {
                    request.setAttribute("MensajeError", "El Empleado no se actualizó correctamente");
                    System.out.println("El Empleado no se actualizo correctamente");
                }
                request.getRequestDispatcher("consultarEmpleado.jsp").forward(request, response);
                break;
            case 3: //Consultar por numero de documento
                EmpVo = EmpDAO.consultarEmpleado(numeroDocumento);
                if (EmpVo != null) {
                    request.setAttribute("EmpleadoConsultado", EmpVo);
                    request.getRequestDispatcher("ActualizarEmpleado.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "El empleado No existe, verifique el número de documento");
                    request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                }

                break;
            case 4:
                EmpVo = EmpDAO.actualizarDatos(numeroDocumento);
                EmpleadoVO numeroId = EmpVo;
                numeroId = EmpDAO.consultarEmpleado(numeroDocumento);

                if (EmpVo != null) {
                    request.setAttribute("obtenerDatos", EmpVo);
                    request.setAttribute("obtenerIds", numeroId);
                    request.getRequestDispatcher("ActualizarEmpleado.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "El empleado No existe, verifique el número de documento");
                    request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                }
                break;
            case 5://Iniciar sesion
                EmpVo = EmpDAO.iniciarSesion(numeroDocumento, clave);
                //
                if (EmpVo != null) {
                    //Implementar sesion
                    HttpSession miSesion = request.getSession(true);
                    miSesion.setAttribute("datosEmpleado", EmpVo);
                    System.out.println("Esta por aca :)");
                    request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "El empleado No existe");
                    System.out.println("El empleado no está registrado");
                    request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
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
