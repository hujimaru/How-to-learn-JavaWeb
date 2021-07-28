# 与Session中的绑定的对象相关的监听器（对象感知监听器）  
HttpSessionBindingListener　　
・绑定状态：就是一个对象被放到session域中setAttribute（）。
・解绑状态：就是这个对象从session域中移除了-removeAttribute（）

# HttpSessionActivationListener
・钝化状态：是将session内存中的对象持久化（序列化）到磁盘
・活化状态：就是将磁盘上的对象再次恢复到session内存中
