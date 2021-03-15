import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    UserList userList = UserList.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("registration.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        if(password != null || name != null){
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            User user = new User(name, password);
            userList.addUser(user);
            response.sendRedirect("/login");

        } else{
            out.print("Username or password field is empty");
        }

        out.close();
    }

}  