package model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/RegistrationFilter")
public class RegistrationFilter extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Fname = request.getParameter("firstname");
        String Lname = request.getParameter("lastname");
        String Email = request.getParameter("email");
        String PhoneNumber = request.getParameter("phoneNumber");
        String Password = request.getParameter("password");
        request.getRequestDispatcher("link.html").include(request, response);
        if (Fname.isEmpty() || Lname.isEmpty() || PhoneNumber.isEmpty() || Email.isEmpty() || Password.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("/userRegister.jsp");
            out.println("<font color=red>Please fill all the fields!! Please try again</font>");
            rd.include(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/userDetails.jsp");
            rd.forward(request, response);
        }
    }
}
