# JSP脚本有三种表达式

1.<%java代码%>  
内部的java代码翻译到service方法的内部  

2.<%=java变量或表达式%>  
会被翻译成service方法内部out.print()  

3.<%!java代码%>  
会被翻译成servlet的成员的内容  
上述方法会有线程安全问题不建议使用。


# JSP注释
HTML注释：<!-- 注释内容 --> jsp源码，翻译后的servlet，页面显示html源码  
Java注释：//单行注释         /*多行注释*/     JSP源码翻译后的servlet  
jsp注释： <%-- 注释内容 --%>                JSP源码可见  
上述jsp注释最好最安全
