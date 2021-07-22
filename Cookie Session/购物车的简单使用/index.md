# 购物车的简单使用

// 1 获取商品的信息
String name = request.getParameter("name");
// 2 需要保存商品信息到session
HttpSession session = request.getSession();

sessio.setAttribute("name",name);
上述只能添加一个物品，多个就会被 
