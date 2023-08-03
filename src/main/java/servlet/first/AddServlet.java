package servlet.first;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        ServletConfig cg = getServletConfig();     // getServletContext implemented in HttpServlet
        String str = cg.getInitParameter("name");

        PrintWriter out = res.getWriter();
        out.print("Hi " + str);
    }

    /*
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        PrintWriter out = res.getWriter();
        out.println("result is " + k);
    }
*/

}
