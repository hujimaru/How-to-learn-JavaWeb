# 验证码切换案例分析  

* ###### 所有的内容拆开了揉碎了都很简单,不要害怕主动出击。

首先我们要明白这是一个怎样的原理，原理都不清楚的话，无从下手。  


### 1.背景知识：  

用户在注册或者登陆的过程中经常会遇到必须输入验证码的情况  


验证码主要是为了防止恶意程序访问服务器而设置的。  


### 2.实现原理：  

浏览器显示文档和图片，是由服务器回送给浏览器的响应完成的，  

而一个响应要封装成一个HttpServletResponse对象，所以  

我们只需要将验证码的图片封装到HttpServletResponse对象  

返回给浏览器即可。  


### 3.四步骤解析逐步实现验证码功能

 - #### 第一步 生成一张验证码的图片

 - #### 第二步 验证码图片改为灰色背景  

 - #### 第三步 在验证码图片上绘制字母

 - #### 第四步 验证码图片随机生成字母

#### 3.1 生成一张验证码图片  

- BufferedImage image = new BufferedImage(宽，高，图片类型); //生成验证码图片，BufferedImage是什么？
 
 - // 根据ImageIO的write方法去获得一个OutPutStream输出流，
 - 根据右方链接了解ImageIO https://blog.csdn.net/weixin_36279318/article/details/77446605
 - ImageIo.write(image, "jpg", request.getOutputStream());

#### 3.2 处理验证码图片为灰色

 - // 获得验证码图片的绘图对象
 - Graphics graphics = image.getGraphics();
 - graphics.setColor(Color.gray);
 - // 绘制矩形的方法 绘制出灰色的矩形覆盖掉默认黑色
 - graphics.filRect(0,0,width,height);

#### 3.3 在验证码图片上绘制字母
 
 - // 通过Graphics的drawString方法，在图片上绘制四个字符 https://www.apiref.com/java11-zh/java.desktop/java/awt/Graphics2D.html#drawString(java.text.AttributedCharacterIterator,float,float)
 - graphics.setColor(Color.gray);
 - for(int i=0;i<5;i++){
 - graphics.drawString("A",width/4*(i+1)，15);
 -}
 
#### 3.4 验证码图片随机生成字母

- // 生成字符串的数据集
- String data = "abcdefghigklmnopqrstuvwxvz0123456789";

- // 随机生成字符串 即 Random这个类相关
- // 肯定要将drawString中的参数“A”替换掉。
- Random random = new  Random();

- // 只要取得了字符串的位置，就可以取得随机的字符串
- int position = random.nextInt(data.length)
- // 将随机的位置分割出来，通过subString方法
- String randomStr = data.subString(position,position+1) 
- graphics.drawString(randomStr,width/4*(i+1)，15);

##### 涉及两个常用的知识点，Random随机生成字符串和subString方法切割
![image](https://user-images.githubusercontent.com/86137350/122731686-80b29480-d2b6-11eb-9e71-935abf1a1099.png)




