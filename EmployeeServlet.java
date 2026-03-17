import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EmployeeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
                       throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("ename");
        String phone = request.getParameter("phone");

        out.println("<html><body>");
        out.println("<h2>Employee Details</h2>");
        out.println("Employee Name: " + name + "<br>");
        out.println("Phone Number: " + phone);
        out.println("</body></html>");
    }
}