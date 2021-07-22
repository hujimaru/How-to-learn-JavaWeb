### Session域对象存取数据   

#### 设置两个Servlet  

##### SaveServlet  

HttpSession session = request.getSession();  
session.setAttrute("goods","cup");  

#### GetServlet
HttpSession session = request.getSession();  
String goodsValue = (String)session.getAttribute("goods");  
response.getWrite().write("goods:"+goods);  

（String）
// 上述强转还是不会，代码写的多了，自然就会有感觉了。

# 怎样向Session中存储数据（session也是一个域对象）  
## 什么是域对象？？？

Session也是存储数据的区域对象，所以session对象也具有如下三个方法：  
session.setAttribute(String name,Object obj);  
session.getAttribute(String name);  
session.removeAttribute(String name);  

## 实现Session持久化

Cookie默认是不会有持久化的，因此设置Cookie持久化
