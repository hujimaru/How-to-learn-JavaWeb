- Filter生命周期  
- Filter何时创建：服务器启动时就创建该Filter对象  
- Filter何时销毁：服务器关闭时Filter销毁  


- servletContext对象很类似
###### 服务器会优先启动servletContext对象，在其后创建Filter。  
###### 服务器在运行的时候就会自动创建Filter，同时启动init方法。  
###### 当某个资源都配置到Filter后就会执行doFilter方法，访问jsp或servlet时就会启动doFilter方法。  
###### 当服务器关闭就会执行destory方法，销毁对象。

- 流程  
servletContext -  Filter   

- init
 filterConfig对象
  filterConfig.getFilterName()  // 拿到过滤器的名字  
  filterConfig.getInitParameterNames(String s)  // 拿到过滤器的名字  
  filterConfig.getInitParameter()  // 拿到所有配置信息的名字  
  
- FilterChain  
过滤器链对象，通过该对象的doFilter方法可以放行该请求--经常使用，当多个过滤器的时候doFilter方法会将请求发送给下一个过滤器，直至发送给对应的servlet后者jsp处理
