### 创建Session




#### 如何获取Session对象
//获取Session对象，通过request请求
HttpSession session = request.getSession（）

//获取SessionID
String sessionId = session.getSessionId();

// 打印sessionId
reponse.getWriter().writer(sessionId);
