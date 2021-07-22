### 创建Session

#### 当客户端访问服务器时会自动创建一个Session，并且携带SessionID，当它访问其他网页时也会携带Session  
#### 简单来说当客户访问网页上的商品添加到购物车，服务器自动会创建一个只属于该客户的Session，包含SessionID
#### 当客户要进入另一个界面购物车页面，服务器会通过SessionID来识别



#### 如何获取Session对象
//获取Session对象，通过request请求
HttpSession session = request.getSession（）

上述方法会获得专属于当前会话的session对象，如果服务器端没有该会话的Session对象
会创建一个新的Session返回，如果已经有了属于该会话的session直接将已有的session返回
实质就是根据JESSIONID判断该客户是否在服务器上已经存在session了

//获取SessionID
String sessionId = session.getSessionId();

// 打印sessionId
reponse.getWriter().writer(sessionId);  


