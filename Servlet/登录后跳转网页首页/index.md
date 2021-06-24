
## ■根据之前的错误界面来判断，正确的情况下跳转到正确的网页

**输入密码正确的情况下利用请求重定向的方法**

#### 方法1 设置一个请求头，告诉浏览器即将跳转的地址
- response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);//设置响应行
- response.setHeader("Location","https://www.baidu.com/");//设置响应头

#### 方法2 通过下述方法将上述两个方法全部集合在一起（sendRedirect方法）
- response.sendRedirect("/hello/home.html");

**具体参考下发图片，关于请求重定向内容**  

<img width="942" alt="截屏2021-06-24 12 51 54" src="https://user-images.githubusercontent.com/86137350/123200101-10d91f80-d4eb-11eb-8308-8a5c5f3c2f9d.png">

**需要注意的是在请求转发中请求重定向的地址需要加上项目名称　→　「/hello/home.html」

        String userName = "xiaoming";
        String userPass = "123456";

        String name = request.getParameter("name");
        String passWord = request.getParameter("passWord");

        if (!name.equals(userName)) {
            //账户不存在
            request.setAttribute("errorMessage", "账户不存在");
            request.getRequestDispatcher("/loginError.jsp").forward(request, response);
        } else if (!passWord.equals(userPass)) {
            //密码错误

            request.setAttribute("errorMessage", "密码错误");
            request.getRequestDispatcher("/loginError.jsp").forward(request, response);
        } else {
            // response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
            // response.setHeader("Location","https://www.baidu.com/");

            response.sendRedirect("/hello/home.html");
        }
# 关于请求重定向和请求转发的区别  

<img width="802" alt="截屏2021-06-24 15 56 02" src="https://user-images.githubusercontent.com/86137350/123217114-32470500-d505-11eb-802a-426ca3dfda39.png">






