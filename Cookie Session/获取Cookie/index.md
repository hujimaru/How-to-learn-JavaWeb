### 获取多个Cookie
#### 1 创建多个Cookie
#### 2 在别的Servlet中获取Cookie
*上述1已经在上期中讲过，略。

#### 通过request获取到创建的cookie，如下所示。  
###### request.getCookie() 通过该方法获取到浏览器中的cookie  
###### 因为可能是多个Cookie，因此通过数组来接受。  
###### Cookie cookie[] = request.getCookie();  

// 拿到cookie对象
for(Cookie[] cookie: cookies){

// 如果拿到的cookie名称等于设定的名称，执行下一步
if(cookie.equal("goods")){
   
   // 获取cookie的value
  String cookieValue = cookie.getValue();
   
   // 将该value显示在网页上面
  response.getWriter().write("userName:"+cookValue);
  
 }

}
