### 网站登陆时间

#### 1 获取时间  
#### 2 将获取到的时间添加到cookie
#### 3 将时间反映到页面上


这里最重要的就是SimpleDateFormat,这里怎么去认识

Date date = new Date();
SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyymmdd-hh:mm:ss");
simpleDateFormat.format(date);




## 具体参考如下

public class SimpleDateFormat extends DateFormat
SimpleDateFormat 是一个以国别敏感的方式格式化和分析数据的具体类。 它允许格式化 (date -> text)、语法分析 (text -> date)和标准化。

SimpleDateFormat 允许以为日期-时间格式化选择任何用户指定的方式启动。 但是，希望用 DateFormat 中的 getTimeInstance、 getDateInstance 或 getDateTimeInstance 创建一个日期-时间格式化程序。 每个类方法返回一个以缺省格式化方式初始化的日期／时间格式化程序。 可以根据需要用 applyPattern 方法修改格式化方式。

SimpleDateFormat函数的继承关系：
java.lang.Object
   |
   +----java.text.Format
           |
           +----java.text.DateFormat
                   |
                   +----java.text.SimpleDateFormat
下面是个小例子：
import java.text.*;
import java.util.Date;

/**
  SimpleDateFormat函数语法：
 
  G 年代标志符
  y 年
  M 月
  d 日
  h 时 在上午或下午 (1~12)
  H 时 在一天中 (0~23)
  m 分
  s 秒
  S 毫秒
  E 星期
  D 一年中的第几天
  F 一月中第几个星期几
  w 一年中第几个星期
  W 一月中第几个星期
  a 上午 / 下午 标记符
  k 时 在一天中 (1~24)
  K 时 在上午或下午 (0~11)
  z 时区
 */
public class FormatDateTime {
    public static void main(String[] args) {
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");  
        SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm");  
        SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//等价于now.toLocaleString()  
        SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");  
        SimpleDateFormat myFmt4=new SimpleDateFormat(  
                "一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区");  
        Date now=new Date();  
        System.out.println(myFmt.format(now));  
        System.out.println(myFmt1.format(now));  
        System.out.println(myFmt2.format(now));  
        System.out.println(myFmt3.format(now));  
        System.out.println(myFmt4.format(now));  
        System.out.println(now.toGMTString());  
        System.out.println(now.toLocaleString());  
        System.out.println(now.toString());  
    }     
   
}

效果：
2004年12月16日 17时24分27秒
04/12/16 17:24
2004-12-16 17:24:27
2004年12月16日 17时24分27秒 星期四
一年中的第 351 天 一年中第51个星期 一月中第3个星期 在一天中17时 CST时区
16 Dec 2004 09:24:27 GMT
2004-12-16 17:24:27
Thu Dec 16 17:24:27 CST 2004

下面是个JavaBean:
public class FormatDateTime {
   
    public static String toLongDateString(Date dt){
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");       
        return myFmt.format(dt);
    }
   
    public static String toShortDateString(Date dt){
        SimpleDateFormat myFmt=new SimpleDateFormat("yy年MM月dd日 HH时mm分");       
        return myFmt.format(dt);
    }   
   
    public static String toLongTimeString(Date dt){
        SimpleDateFormat myFmt=new SimpleDateFormat("HH mm ss SSSS");       
        return myFmt.format(dt);
    }
    public static String toShortTimeString(Date dt){
        SimpleDateFormat myFmt=new SimpleDateFormat("yy/MM/dd HH:mm");       
        return myFmt.format(dt);
    }
   
    public static void main(String[] args) {
        Date now=new Date();

        System.out.println(FormatDateTime.toLongDateString(now));
        System.out.println(FormatDateTime.toShortDateString(now));
        System.out.println(FormatDateTime.toLongTimeString(now));
        System.out.println(FormatDateTime.toShortTimeString(now));
    }   
   
}
调用的main 测试结果：
2004年12月16日 17时38分26秒 星期四
04年12月16日 17时38分
17 38 26 0965
04/12/16 17:38
————————————————
版权声明：本文为CSDN博主「gubaohua」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/gubaohua/article/details/575488　
