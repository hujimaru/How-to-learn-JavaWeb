package niponi.tokyo.jp;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "VerifyCodeServlet", urlPatterns = "/code")
public class VerifyCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 定义图片的宽高
        int width = 100;
        int height = 30;

        // 字符串的集合
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890あいうえおかきくけこさしすせそなりぬれのはひふへほ";

        // 获取随机字符 只要取得了随机的位置，就能取得随机的字符串
        Random random = new Random();
        // 生成一张验证码图片
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        // 更换验证码图片颜色
        // 取得验证码图片的绘图对象
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.gray);

        // 调用绘制矩形方法
        // 将整个灰色绘制到整个矩形上
        graphics.fillRect(0,0,width,height);

        // 在灰色的图片上绘制四个字符
        graphics.setColor(Color.blue);

        for(int i=0;i<4;i++){

            // 获取字符串的位置，把整个程序掰开了揉碎了学习
            int position = random.nextInt(data.length());

            // 分割字符串 获得随机的字符串    通过subString方法
            String randomStr = data.substring(position, position + 1);

            graphics.drawString(randomStr,width/5*(i+1),15);
        }


        // 可以通过思维导图画出详细思路
        // 如何输出给浏览器
        // 使用ImageIo.write方法将图片转化成OutputStream类型输出
        //ImageIo.write(图片，图片类型，转化成输出流） 各种流是怎么操作的？？？？
        ImageIO.write(image,"jpg",response.getOutputStream());
    }
}
