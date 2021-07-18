### 获取多个Cookie
#### 1 创建多个Cookie
#### 2 在别的Servlet中获取Cookie
*上述1已经在上期中讲过，略。

* 通过request获取到创建的cookie，如下所示。  
###### request.getCookie() 通过该方法获取到浏览器中的cookie  
###### 因为可能是多个Cookie，因此通过数组来接受。  
###### Cookie cookie[] = request.getCookie();  
 
