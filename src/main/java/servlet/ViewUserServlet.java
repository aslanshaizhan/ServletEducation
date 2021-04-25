package servlet;

import dao.UserDao;
import entity.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewUserServlet")
public class ViewUserServlet extends HttpServlet{
protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<a href=\"index.html\">Go to Home page</a>");
        out.println("<div class='container'>");
        List<UserBean> list=UserDao.view();
        out.println("<table class='table table-bordered table-striped'>");
        out.println("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Phone Number</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");
        for(UserBean userBean:list){
        out.println("<tr><td>"+userBean.getId()+"</td><td>"+userBean.getFirstName()+"</td><td>"+userBean.getLastName()
        +"</td><td>"+userBean.getEmail()+"</td><td>"+userBean.getPhoneNumber()+"</td><td>"+userBean.getPassword()+
        "</td><td><a href='EditUserForm?id="+userBean.getId()+"'>Edit</a></td><td><a href='DeleteUser?id="
        +userBean.getId()+"'>Delete</a></td></tr>");
        }
        out.println("</table>");
        out.println("</div>");
        out.close();
        }
}

