
## 根据之前的错误界面来判断

**输入密码正确的情况下利用请求重定向的方法**

- 设置一个请求头，告诉浏览器即将跳转的地址
- response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);//设置响应行
- response.setHeader("Location","https://www.baidu.com/");//设置响应头

- 通过下述方法将上述两个方法全部集合在一起（sendRedirect方法）
- response.sendRedirect("/hello/home.html");
