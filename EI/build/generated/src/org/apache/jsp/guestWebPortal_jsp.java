package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guestWebPortal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function hide() {\r\n");
      out.write("                document.getElementById('div1').style.display = 'none';\r\n");
      out.write("            }\r\n");
      out.write("            function show() {\r\n");
      out.write("                document.getElementById('div1').style.display = 'block';\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <title>Guest Web Portal</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Booking table</h1>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <form action=\"BookingServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            Table Number:\r\n");
      out.write("            <select name=\"tableNum\">\r\n");
      out.write("                <option value=\"1\">1</option>\r\n");
      out.write("                <option value=\"2\">2</option>\r\n");
      out.write("                <option value=\"3\">3</option>\r\n");
      out.write("                <option value=\"4\">4</option>\r\n");
      out.write("                <option value=\"5\">5</option>\r\n");
      out.write("                <option value=\"6\">6</option>\r\n");
      out.write("                <option value=\"7\">7</option>\r\n");
      out.write("                <option value=\"8\">8</option>\r\n");
      out.write("                <option value=\"9\">9</option>\r\n");
      out.write("                <option value=\"10\">10</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <br/>\r\n");
      out.write("            Liquor:\r\n");
      out.write("            <input type=\"text\" name=\"liquor\" placeholder=\"E.g Volka\" required>\r\n");
      out.write("            <br/>\r\n");
      out.write("\r\n");
      out.write("            Start Date time:\r\n");
      out.write("            <input type=\"datetime-local\" name=\"startDatetime\" required>\r\n");
      out.write("\r\n");
      out.write("            End Date time:\r\n");
      out.write("            <input type=\"datetime-local\" name=\"startDatetime\" required>\r\n");
      out.write("            <br/>\r\n");
      out.write("\r\n");
      out.write("            Do you want to book a host?\r\n");
      out.write("            <input type=\"radio\" name=\"option\" value=\"yes\" onclick=\"show()\"> yes\r\n");
      out.write("            <input type=\"radio\" name=\"option\" value=\"no\" onclick=\"hide()\"> no<br>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"hostInfo\" style=\"display: none;\">\r\n");
      out.write("                Host Preference:\r\n");
      out.write("                <br/>\r\n");
      out.write("\r\n");
      out.write("                Name:\r\n");
      out.write("                <input type=\"text\" name=\"hostName\" required>\r\n");
      out.write("\r\n");
      out.write("                Age:\r\n");
      out.write("                <input type=\"text\" name=\"hostAge\" required>\r\n");
      out.write("                <br/>\r\n");
      out.write("\r\n");
      out.write("                Gender:\r\n");
      out.write("                <input type=\"text\" name=\"hostGender\" required>\r\n");
      out.write("\r\n");
      out.write("                Race:\r\n");
      out.write("                <input type=\"text\" name=\"hostRace\" placeholder=\"E.g Chinese, Malay, Indian...etc\" required>\r\n");
      out.write("\r\n");
      out.write("                Cost:\r\n");
      out.write("                <input type=\"text\" name=\"hostCost\" required>\r\n");
      out.write("                <br/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\">Submit</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
