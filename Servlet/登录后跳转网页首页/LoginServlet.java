package niponi.tokyo.jp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = "xiaoming";
        String userPass = "123456";

        String name = request.getParameter("name");
        String passWord = request.getParameter("passWord");

        if (!name.equals(userName)) {
            //账户不存在
            request.setAttribute("errorMessage", "账户不存在");
            request.getRequestDispatcher("/loginError.jsp").forward(request, response);
        } else if (!passWord.equals(userPass)) {
            //密码错误

            request.setAttribute("errorMessage", "密码错误");
            request.getRequestDispatcher("/loginError.jsp").forward(request, response);
        } else {
//                  response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
//                  response.setHeader("Location","https://www.baidu.com/");

            response.sendRedirect("/hello/home.html");
        }
    }
}
