package niponi.tokyo.jp.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "TimeServlet", urlPatterns = "/time")
public class TimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 创建一个Date对象
        Date date = new Date();

        // 通过SimpleDateFormat 格式化成我们需要的对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-hh:mm:ss");
        String time = simpleDateFormat.format(date);

        Cookie cookie = new Cookie("time", time);

        cookie.setMaxAge(60*60*24);

        response.addCookie(cookie);

        response.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = request.getCookies();


        String timeValue = null;
        for (Cookie cookie1 : cookies) {

            if (cookie1.getName().equals("time")) {

                timeValue = cookie1.getValue();

            }
        }
        if (timeValue == null) {
            response.getWriter().write("欢迎光临");
        } else {

            response.getWriter().write("上次的访问时间：" + timeValue);

        }
    }
}
