JSP脚本有三种表达式

1.<%java代码%>  
内部的java代码翻译到service方法的内部  

2.<%=java变量或表达式%>  
会被翻译成service方法内部out.print()  

3.<%!java代码%>  
会被翻译成servlet的成员的内容  
