package server;

//import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
public class SimpleServlet{

}


//public class SimpleServlet implements Servlet {
//    ServletConfig config = null;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        this.config = config;
//        System.out.println("Servlet is initialized");
//    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        res.setContentType("text/html");
//
//        PrintWriter out = res.getWriter();
//        out.print("<html><body>");
//        out.print("<h1>Hello Simple Servlet</h1>");
//        out.print("</body></html>");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("Servlet is destroyed");
//    }
//
//    @Override
//    public ServletConfig getServletConfig() {
//        return config;
//    }
//
//    @Override
//    public String getServletInfo() {
//        return "This is a simple servlet";
//    }