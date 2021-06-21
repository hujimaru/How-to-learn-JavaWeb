package niponi.tokyo.jp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = "abc";
        String userPass = "123456";

        String user = request.getParameter("name");
        String pass = request.getParameter("passWord");

        if(!user.equals(userName)){
            System.out.println("用户名不正确");

            // 请求转发的相关方法
            // requestDispatcher 对象 通过其方法获取调用这个对象的format方法就可以实现请求转发
            request.setAttribute("errorMessage","用户名不正确");
            request.getRequestDispatcher("/loginError.jsp").forward(request,response);

        }else if(!pass.equals(userPass)){

            System.out.println("密码不正确");
            request.setAttribute("errorMessage","密码不正确");
            request.getRequestDispatcher("/loginError.jsp").forward(request,response);

        }else{
            System.out.println("登陆正确");
//            response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
//            response.setHeader("Location","https://www.xmaru.net/");
            response.sendRedirect("/HelloJapan/home.html");
        }
    }
}
