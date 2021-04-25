package servlet;

import entity.PostBean;
import entity.UserBean;
import model.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addPost")
public class AddPostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserBean currentUser = (UserBean) request.getSession().getAttribute("USER");

        if(currentUser!=null){

            request.setCharacterEncoding("utf8");

            String title = request.getParameter("title");
            String description = request.getParameter("description");

            PostBean postBean = new PostBean(null, title, currentUser, description, null);
            if(DB.addPost(postBean)){
                response.sendRedirect("/addPost?success");
            }else{
                response.sendRedirect("/addPost?error");
            }

        }else{
            response.sendRedirect("/login");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserBean currentUser = (UserBean) request.getSession().getAttribute("USER");
        if(currentUser!=null){
            request.getRequestDispatcher("/addPost.jsp").forward(request, response);
        }else{
            response.sendRedirect("/login");
        }

    }
}
