package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.TimbreDAO;
import ModeloVO.TimbreVO;

public final class RegistrarReparacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Reparacion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario de registro</h1>\n");
      out.write("        <form action=\"Reparacion\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <div>\n");
      out.write("                <label>Numero de timbre</label>\n");
      out.write("                <select name=\"txtidTimbre\">      \n");
      out.write("                    <option selected disabled>Seleccione un horario</option>\n");
      out.write("                    ");

                        TimbreDAO timbreDAO = new TimbreDAO();
                        for (TimbreVO timbreVO : timbreDAO.Listar()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( timbreVO.getIdTimbre());
      out.write('"');
      out.write('>');
      out.print( timbreVO.getHabitacion());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Empleado</label>\n");
      out.write("                <select name=\"txtidEmpleado\">      \n");
      out.write("                    <option selected disabled>Seleccione un horario</option>\n");
      out.write("                    ");

                        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
                        for (EmpleadoVO empleadoVO : empleadoDAO.Listar()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( empleadoVO.getIdEmpleado());
      out.write('"');
      out.write('>');
      out.print(empleadoVO.getNombre());
      out.write(' ');
      out.print(empleadoVO.getApellidos());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Numero de solicitud</label>\n");
      out.write("                <input name=\"txtnumeroSolicitud\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Motivo arreglo</label>\n");
      out.write("                <input name=\"txtmotivoArreglo\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reparacion</label>\n");
      out.write("                <input name=\"txtfechaReparacion\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reporte</label>\n");
      out.write("                <input name=\"txtfechaReporte\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Evidencia de daño</label>\n");
      out.write("                <input name=\"txtfotoReparacion\" type=\"file\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Estado de solicitud</label>\n");
      out.write("                <select name=\"txtestadoSolicitud\">\n");
      out.write("                    <option value=\"Pendiente\">Pendiente</option>\n");
      out.write("                    <option value=\"Completa\">Completada</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("            <button> Registrar </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>id</th>\n");
      out.write("                        <th>IdTimbre</th>\n");
      out.write("                        <th>IdEmpleado</th>\n");
      out.write("                        <th>Numero de solicitud</th>\n");
      out.write("                        <th>Motivo de arreglo</th>\n");
      out.write("                        <th>Fecha Reparacion</th>\n");
      out.write("                        <th>Fecha reporte</th>\n");
      out.write("                        <th>Foto reparacion</th>\n");
      out.write("                        <th>Estaado solicitud</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>      \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reparacion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                        \n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.idReparacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.idTimbre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.idEmpleado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.numeroSolicitud}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.motivoDeArreglo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.fechaReparacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.fechaReporte}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.fotoReparacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.EstadoSolicitud}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${RepVO.ruta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"100\" width=\"100\" ></td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
