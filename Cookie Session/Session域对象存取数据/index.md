### Session域对象存取数据 

#### 设置两个Servlet

##### SaveServlet

HttpSession session = request.getSession();
session.setAttrute("goods","cup");

#### GetServlet
HttpSession session = request.getSession();
String goodsValue = session.getAttrute("goods");
response.getWrite().write("goods:"+goods);
