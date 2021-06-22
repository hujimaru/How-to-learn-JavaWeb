
### 1.登录错误时显示错误界面

###### 关于介绍登录错误时显示错误界面的编程步骤

###### 包含三个文件
 - login.html
 - LoginServlet.java
 - loginError.jsp
 
### LoginServlet.java
###### 1.定义正确的账户和密码
- String name = "andy"
- String password = "1234"
###### 2.获取登录界面用户所登录的账户和密码
- String userName = request.getParameter("name");
- String userPassword = request.getParameter("password");

###### 3.获取登录界面用户所输入的账户密码后，对其进行判断，二者进行判断
- if(userName.equal(name)){
- // 用户账户不存在
- }else if(userPassword.equal(password)) {
- // 用户密码错误
- }
##### 4.当登录错误时如何转发到错误的界面  
#### 背景介绍
**请求转发的相关方法：**
- RequestDispatcher对象，可以通过request.getRequestDispatcher()方法获取调用这个对象的foward方法就可以实现请求转发
**转发过程中携带数据：**
- requ本身也是一个域对象，request可以携带数据传递给其他Web资源
- setAttribute方法；
- getAttribute方法；
- removeAttribute方法；
- getAttributeNames方法；

**具体实现如下**
- if(userName.equal(name)){
- // 用户账户不存在
- // 通过该方法获得请求转发,getRequestDispatcher内传入请求转发的页面，注意要加”/“;
- request.getRequestDispatcher("/loginError.jsp").forward(request,response);
- // 通过setAttribute方法来设定用户错误
- request.setAttribute("errorMessage", "用户账户不存在");
- }else if(userPassword.equal(password)) {
- // 用户密码错误
- request.getRequestDispatcher("/loginError.jsp").forward(request,response);
- request.setAttribute("errorMessage", "用户密码错误");
- }
### loginError.jsp
- 上述设置了错误内容，需要再JSP页面传递出来
- request.getAttribute("errorMessage");
### 总结：整个程序流程
- 1 设定用户密码以及获取用户输入账户和密码
- 2 通过RequstDispatcher对象的forward方法请求转发到错误页面
- 3 通过request.setAttribute方法携带数据传递给页面  
- 4 
##### **注意 思考感悟**
- 1.纯记事本编程是否对提高编程能力有所帮助
- 2.怎样制定科学有效的学习工作健身指南
- 3.看似很愚蠢很笨拙的方法其实是最快速的捷径
