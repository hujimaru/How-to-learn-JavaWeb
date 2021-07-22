# 购物车的简单使用

// 1 获取商品的信息  
String name = request.getParameter("name");
// 2 需要保存商品信息到session
HttpSession session = request.getSession();


方法一  
//sessio.setAttribute("name",name);
上述只能保存一件物品，多个就会被覆盖掉。

￥使用集合list，存储多个商品。   


方法二  
//List list = new ArrayList();  
//list.add(name);  

//session.setAttritube("list",list);  
//这样同样也会覆盖掉之前的内容    

方法三 
将之前的商品和现在的商品一起放在购物车中

List list = (list)session.getAttribute("list"); 

//第一次访问的时候list不存在，需要创建一个list
if(list == null){  
  list=new ArrayList();  
}  
list.add(name);  
session.setAttribute("list",list);  

//session持久化,也就是持久化JSESSIONID
Cookie cookie = new Cookie("JSESSIONID",session.getId());  
cookie.setAgeMax(60*60*10);  
cookie.setPath("/hello");
response.addCookie(cookie);

