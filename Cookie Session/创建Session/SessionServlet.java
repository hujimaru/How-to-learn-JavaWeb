package niponi.tokyo.jp.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet",urlPatterns = "/session")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 每次都写注释，知道自己写的是什么
        // 通过getSession方法来获取
        HttpSession session = request.getSession();
        
        // 获取ID
        String sessionId = session.getId();

        // 打印sessionID显示在浏览器上
        // 必须健康才能学习，或者工作，处理事务，健康是第一要素，没有健康其他的无从谈起。
        response.getWriter().write(sessionId);

    }
}
