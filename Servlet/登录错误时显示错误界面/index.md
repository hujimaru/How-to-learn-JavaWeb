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
- String userName = request.getParameter("name");
- String userPassword = request.getParameter("password");

###### 获取登录界面用户所输入的账户密码后，对其进行判断，二者进行判断
- if(userName.equal(name)){
- // 用户账户不存在
- }else if(userPassword.equal(password)) {
- // 用户密码错误
- }
- 1
- 1
- 1
- 1
- 1
- 1
- 1
- 1
- 1
- 1
##### *注意 自己的一些思考
- 1.纯记事本编程是否对提高编程能力有所帮助
- 2.怎样制定科学有效的学习工作健身指南
- 3.看似很愚蠢很笨拙的方法其实是最快速的捷径
