package niponi.tokyo.jp.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "SaveSessionServlet",urlPatterns = "/save")
public class SaveSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 创建session 对象
        HttpSession session = request.getSession();

        // 创建cookie将其覆盖JSESSIONID 通过对它的持久化而实现对session的持久化。
        Cookie cookie = new Cookie("JSESSIONID", session.getId());

        // 设置时间
        cookie.setMaxAge(60*60*24);
        // 添加到cookie中
        response.addCookie(cookie);

        // 获取对象后，在对象内存储一些数据
        session.setAttribute("goods","cup");
    }
}
