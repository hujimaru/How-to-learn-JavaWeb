# 监听器概述
### 监听器是什么  
在Java Web中监听器指的是对这个Web环境的监听，当被监听的对象发生变化时，可以执行相应的方法进行处理。

监听器在开发中常见的场景：手机编程，前端编程  
监听器的相关概念：  
事件源：用于监听与事件源就行绑定  
注册监听器：将监听器与事件源进行绑定  
效应行为：监听器监听到事件源的状态变化时，所涉及的功能代码  

# 监听器分类
第一类：按照被监听的对象划分：ServletContext域,ServletRequest域，HttpSession域
# 上述指的域还是不理解，找个地方好好看看，解决这个问题，这个问题很大肯定涉及很多地方，我需要做的就是逐个击破解决。  

第二类：监听的内容划分：监听域对象的创建与销毁的 监听域对象的属性变化的  

额外两个监听器
HttpSessionActivationListCner
HttpSessionBindingListener
