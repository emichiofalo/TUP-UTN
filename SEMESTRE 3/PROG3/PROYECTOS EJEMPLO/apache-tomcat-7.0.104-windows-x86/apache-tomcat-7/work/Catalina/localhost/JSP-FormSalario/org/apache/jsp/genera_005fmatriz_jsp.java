/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2022-11-22 20:57:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class genera_005fmatriz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Genera Matriz</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            margin-left: 1%;\n");
      out.write("            margin-top: 1%;\n");
      out.write("        }\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

        int num = Integer.parseInt(request.getParameter("num"));
        int[][] matriz = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        
        out.println("<table>");
            for (int i = 0; i < matriz.length; i++) {
                out.println("<tr>");
                for (int j = 0; j < matriz.length; j++) {
                    out.println("<td>"+matriz[i][j]+"</td>");
                }
                out.println("</tr>");
            }
        out.println("</table>");
        
        int fila = 0; 
        int columna = 0; 
        int[][] matriz2 = new int[2][num]; 
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                columna += matriz[j][i];
                fila += matriz[i][j];
            }
            matriz2[0][i] = columna; 
            matriz2[1][i] = fila; 
            columna = 0; 
            fila = 0; 
        }
        
        out.println("<table>");
            for (int i = 0; i < matriz2.length; i++) {
                out.println("<tr>");
                for (int j = 0; j < num; j++) {
                    out.println("<td>"+matriz2[i][j]+"</td>");
                }
                out.println("</tr>");
            }
        out.println("</table>");
        
        for (int i = 0; i < num; i++) {
            columna += matriz2[0][i];
            fila += matriz2[1][i];
        }
        out.println("<br>La suma de las columnas es "+ columna + ", la suma de las filas es "+ fila);
        
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
