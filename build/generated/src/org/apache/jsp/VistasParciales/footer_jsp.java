package org.apache.jsp.VistasParciales;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- Remove the container if you want to extend the Footer to full width. -->\n");
      out.write("<div class=\"container my-5\">\n");
      out.write("\n");
      out.write("  <footer class=\"text-center text-lg-start\" style=\"background-color: #f1f1;\">\n");
      out.write("    <div class=\"container d-flex justify-content-center py-5\">\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary btn-lg btn-floating mx-2\" style=\"background-color: #54456b;\">\n");
      out.write("        <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("      </button>\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary btn-lg btn-floating mx-2\" style=\"background-color: #54456b;\">\n");
      out.write("        <i class=\"fab fa-youtube\"></i>\n");
      out.write("      </button>\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary btn-lg btn-floating mx-2\" style=\"background-color: #54456b;\">\n");
      out.write("        <i class=\"fab fa-instagram\"></i>\n");
      out.write("      </button>\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary btn-lg btn-floating mx-2\" style=\"background-color: #54456b;\">\n");
      out.write("        <i class=\"fab fa-twitter\"></i>\n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Copyright -->\n");
      out.write("    <div class=\"text-center text-white p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("      © 2020 Copyright:\n");
      out.write("      <a class=\"text-white\" href=\"https://mdbootstrap.com/\">MDBootstrap.com</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Copyright -->\n");
      out.write("  </footer>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<!-- End of .container -->");
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
}
