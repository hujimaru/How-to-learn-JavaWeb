
## 根据之前的错误界面来判断，正确的情况下跳转到正确的网页

**输入密码正确的情况下利用请求重定向的方法**

- 1 设置一个请求头，告诉浏览器即将跳转的地址
- response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);//设置响应行
- response.setHeader("Location","https://www.baidu.com/");//设置响应头

- 2 通过下述方法将上述两个方法全部集合在一起（sendRedirect方法）
- response.sendRedirect("/hello/home.html");

具体参考下发图片，关于请求重定向内容
<img width="942" alt="截屏2021-06-24 12 51 54" src="https://user-images.githubusercontent.com/86137350/123200101-10d91f80-d4eb-11eb-8308-8a5c5f3c2f9d.png">
