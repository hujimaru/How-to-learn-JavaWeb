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
