package niponi.tokyo.jp.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieServlet",urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1 要发送一个cookie，创建该对象
        Cookie cookie = new Cookie("goods","cup"); //cookie 不能使用中文

        Cookie cookie1 = new Cookie("userName", "xiaowu");

        // 2 通过下面的方法持久化
        cookie.setMaxAge(60*10);

        // 3 设置cookie的携带路径
        cookie.setPath("/hello/getCookie");

        // 4 创建好cookie后，要将其加入response的响应头中。
        response.addCookie(cookie);
        response.addCookie(cookie1);

        // 上述即可将一个cookie传入给浏览器。
        // 只会在该项目下显示cookie信息。其他地方不会显示。

        // 5 删除客户端的cookie 使用同名同路径的持久化时间为0的cookie覆盖即可
        // cookie.setMaxAge(0);
    }
}
