md的格式都忘记了， 真的是三天不写或不弄的都会忘记的。

# 创建cookie
## 两步走计划
### 1.创建cookie对象，添加cookie对象的名称和值
### 2.将创建的cookie对象，添加到response响应头中

Cookie cookie = new Cookie("name","xiaoming");  
response.add(cookie);  

# 单单上述还不能够有以下两个功能
 ### 3.持久显示，关闭浏览器也可以显示。
 ### 4.设定仅在某处显示。
