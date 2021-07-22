### 创建Session

#### 当客户端访问服务器时会自动创建一个Session，并且携带SessionID，当它访问其他网页时也会携带Session  
#### 简单来说当客户访问网页上的商品添加到购物车，服务器自动会创建一个只属于该客户的Session，包含SessionID
#### 当客户要进入另一个界面购物车页面，服务器会通过SessionID来识别


#### 如何获取Session对象
//获取Session对象，通过request请求
HttpSession session = request.getSession（）

//获取SessionID
String sessionId = session.getSessionId();

// 打印sessionId
reponse.getWriter().writer(sessionId);
