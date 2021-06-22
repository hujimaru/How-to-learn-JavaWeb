### 1.登录错误时显示错误界面

###### 关于介绍登录错误时显示错误界面的编程步骤

###### 包含两个文件
 - Login.html
 - LoginServlet.java
 
### LoginServlet.java
###### 定义正确的账户和密码
- String name = "andy"
- String password = "1234"
###### 获取登录界面用户所登录的账户和密码
- String userName = request.getParameter("userName");
- String userPassword = request.getParameter("password");
