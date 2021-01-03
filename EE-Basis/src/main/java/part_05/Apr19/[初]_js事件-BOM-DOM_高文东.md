# 知识点

javascript事件、BOM、DOM

## 题目1（加强训练）

题干：请认真阅读下列代码，使用js代码， 分别求出平均成绩、最高成绩、最低成绩、总分，并在控制台打印

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        //数组中保存了多个成绩
        var arr = new Array(80,70,86,58,90,35,89,67,50,99);
        /*
        分别求出平均成绩、最高成绩、最低成绩、总分
        */
		


    </script>
</head>
<body>
    
</body>
</html>
```

运行结果：

> 最大值为：99
> 最小值为：35
> 总分为：724
> 平均分为：72.4

### 训练目标

掌握数组对象Array的使用

### 训练提示

1. 如何遍历Array数组？
2. 如何获取数组长度？
3. 如何输出数据到控制台？

### 操作步骤

1.分别定义变量max、min、sum，用来保存最大值，最小值，总分；

2.遍历数组

​	1.如果最大值小于arr[i],则修改max的值为arr[i]

​	2.如果最小值大于arr[i],则修改min的值为arr[i]

​	3.把每一个值叠加到求和变量上

3.求出平均值

4.使用console对象把数据打印到控制台

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        //数组中保存了多个成绩
        var arr = new Array(80,70,86,58,90,35,89,67,50,99);
        /*
        分别求出平均成绩、最高成绩、最低成绩、总分
        */
        //定义一个变量，记录最高成绩；
        var max=arr[0];
        //定义一个变量，记录最低成绩；
        var min = arr[0];
        //定义一个变量，记录总分；
        var sum = 0;

        //遍历数组
        for(let i=0;i<arr.length;i++){
            //如果最大值小于arr[i],则修改max的值为arr[i]；
            if (max<arr[i]){
                max=arr[i];
            }

            //如果最小值大于arr[i],则修改min的值为arr[i]
            if(min>arr[i]){
                min = arr[i];
            }

            //把每一个值叠加到求和变量上
            sum+=arr[i]
        }

        //求出平均值
        var avg = sum/arr.length;

        //打印数据到控制台
        console.log("最大值为："+max);
        console.log("最小值为："+min);
        console.log("总分为："+sum);
        console.log("平均分为："+avg);


    </script>
</head>
<body>

</body>
</html>

```



## 题目2（加强训练）

题干：请认真阅读下列代码，完成如下效果：

![](G:/%E9%A2%98%E7%9B%AE/java_web%E4%BD%9C%E4%B8%9A%E9%A2%98%E7%9B%AE%E8%A7%84%E8%8C%83/picture/%E4%BF%AE%E6%94%B9%E5%85%83%E7%B4%A0%E6%A0%B7%E5%BC%8F.png)

 请使用js代码把所有div的背景颜色改为绿色，文字内容改为黄色。效果如下：

​	

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*请使用js代码把所有div的背景颜色改为绿色，文字内容改为黄色*/
    </script>
</head>
<body>
    <div>君不见，黄河之水天上来，奔流到海不复回</div>
    <hr/>
    <div>君不见，高堂明镜悲白发，朝如青丝暮成雪</div>
    <hr/>
    <div>人生得意须尽欢，莫使金樽空对月</div>
    <hr/>
    <div>天生我材必有用，千金散尽还复来</div>
    <hr/>
</body>
</html>
```

### 训练目标

掌握元素对象的获取，元素样式的设置，数组的遍历

### 训练提示

1. 如何获取到所有的div元素对象？
2. 如何修改div元素的背景色？
3. 如何修改div元素的内容颜色？

### 操作步骤

1.通过document.getElementsByTagName()获取所有的div元素对象数组；

2.变量div元素对象数组

3.通过 元素对象.style.backgroundColor = 值 修改元素的背景色

4.通过 元素对象.style.color= 值 修改元素的字体内容颜色

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*请使用js代码把所有div的背景颜色改为绿色，文字内容改为黄色*/
        window.onload=function (ev) {
            //获取所有的div元素对象
            var eles_div = document.getElementsByTagName("div");
            //遍历所有的div元素对象
            for(let i=0;i<eles_div.length;i++){
                //修改div元素的背景色为绿色
                eles_div[i].style.backgroundColor="green";
                //修改div元素的文字内容为黄色
                eles_div[i].style.color="yellow";
            }
        }
    </script>
</head>
<body>
    <div>君不见，黄河之水天上来，奔流到海不复回</div>
    <hr/>
    <div>君不见，高堂明镜悲白发，朝如青丝暮成雪</div>
    <hr/>
    <div>人生得意须尽欢，莫使金樽空对月</div>
    <hr/>
    <div>天生我材必有用，千金散尽还复来</div>
    <hr/>
</body>
</html>

```



## 题目3（加强训练）

题干：请认真阅读下列代码，完成下列需求：

​		1.鼠标移入div范围，修改div的背景色为绿色；

​		2.鼠标移出div范围，修改div的背景色为灰色；	

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        #div{
            width: 200px;
            height: 100px;
            background-color: gray;
        }
    </style>
    <script type="text/javascript">
        /*
            鼠标移入div范围，修改div的背景色为绿色；
            鼠标移出div范围，修改div的背景色为灰色；

        */

    </script>
</head>
<body>
    <div id="div">
    </div>
</body>
</html>
```

### 训练目标

掌握鼠标事件、DOM修改元素样式

### 训练提示

1. 如何绑定鼠标移入和移出事件？
2. 如何修改div元素的背景色？

### 操作步骤

1.通过document.getElementsById()获取div元素对象；

2.使用 元素对象.onmouseover 绑定鼠标移入事件，通过 元素对象.sytle.backgroundColor 修改元素背景色为绿色

3.使用 元素对象.onmouseout 绑定鼠标移出事件，通过 元素对象.sytle.backgroundColor 修改元素背景色为灰色

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        #div{
            width: 200px;
            height: 100px;
            background-color: gray;
        }
    </style>
    <script type="text/javascript">
        /*
            鼠标移入div范围，修改div的背景色为绿色；
            鼠标移出div范围，修改div的背景色为灰色；

        */
        window.onload=function (ev) {
            //获取div元素对象
            var ele_div = document.getElementById("div");
            //绑定鼠标移入事件
            ele_div.onmouseover=function (ev2) {
                //修改div元素的背景色为绿色
                this.style.backgroundColor="green";
            }
            //绑定鼠标移出事件
            ele_div.onmouseout=function (ev2) {
                //修改div元素的背景色为灰色
                this.style.backgroundColor="gray";
            }
        }

    </script>
</head>
<body>
    <div id="div">
    </div>
</body>
</html>

```





## 题目4（综合案例）

题干：请认真阅读下列代码，完成以下如下效果：

​	![](../_0414_practise/练习题目/picture/进度条.png)

​	当点击“begin” 按钮后，红色的进度条宽度会不断增长，进度百分比也要以每秒1%的速度增长；

​	当进度达到100%后，停止增长。

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">
        .back_box{
            width: 300px;
            height: 30px;
            border: 3px solid #000;
        }
        #schedule_bar{
            background-color: red;
            float: left;
            height: 100%;
            text-align: center;
            line-height: 150%;
        }
    </style>

    <script type="text/javascript">
        /*
        当点击“begin” 按钮后，红色的进度条宽度会不断增长，进度百分比也要以每秒1%的速度增长；

	    当进度达到100%后，停止增长。

        */

    </script>

</head>
<body>
    <button id="begin">begin</button>
    <!--进度条的背景框-->
    <div class="back_box">
        <!--红色进度条-->
        <div id="schedule_bar" style="width: 0%;" ></div>
    </div>
    <!--当前进度百分比-->
    <p id="schedule">0%</p>

</body>
</html>
```

### 训练目标

灵活使用js加载事件、点击事件、定时器、DOM操作

### 训练提示

1. 如何给begin按钮绑定点击事件？
2. 如何达到每秒钟执行一次修改操作的效果？
3. 如何动态修改进度条的宽度？
4. 如何动态修改进度百分比？
5. 如何停止每秒一次修改操作？

### 操作步骤

1.定义修改进度条宽度和当前百分比的函数；

​	1. 通过 元素对象.style.width = 值  动态修改进度条宽度；

​	2. 通过 元素对象.innerHTML = 值 动态修改当前进度百分比

​	3. 判断当前进度有没有达到100%

​		如果达到100%，清除定时器，结束方法运行；

​		如果没有 达到100%，继续设置下一个定时器，1秒后执行当前函数；

2.在onload事件函数中获取进度条元素对象、进度百分比元素对象、获取begin元素对象，给begin元素对象绑定onclick事件；



### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">
        .back_box{
            width: 300px;
            height: 30px;
            border: 3px solid #000;
        }
        #schedule_bar{
            background-color: red;
            float: left;
            height: 100%;
            text-align: center;
            line-height: 150%;
        }
    </style>

    <script type="text/javascript">
        /*
        当点击“begin” 按钮后，红色的进度条会宽度会不断增长，进度百分比也要以每秒1%的速度增长；

	    当进度达到100%后，停止增长。

        */

        //定义一个变量，用来保存红色进度条元素对象
        var schedule_bar;
        //定义一个变量，用来保存进度百分比元素对象
        var schedule;
        //定义一个方法，用来动态修改红色进度条的宽度和当前进度百分比
        function run(){
            //修改红色进度条元素的宽度，每次增长1%；
            schedule_bar.style.width = parseInt(schedule_bar.style.width) + 1 + '%';
            //修改当前进度百分比，当前进度百分比和红色进度条的宽度百分比是一致的
            schedule.innerHTML = schedule_bar.style.width;
            //判断当前进度有没有达到100%
            if(schedule_bar.style.width == "100%"){
                //进度达到100%，清除定时器
                window.clearTimeout(timeout);
                return;
            }
            //设置定时器，1秒后执行run方法
            var timeout=window.setTimeout("run()",1000);
        }

        window.onload=function (ev) {
            //获取进度条元素对象
            schedule_bar = document.getElementById('schedule_bar');
            //获取进度百分比元素对象
            schedule = document.getElementById('schedule');
            //获取 begin 按钮元素对象
            var btn_begin = document.getElementById("begin");
            //给按钮绑定点击事件，点击后执行run方法
            btn_begin.onclick=run;
        }

    </script>

</head>
<body>
    <button id="begin">begin</button>
    <!--进度条的背景框-->
    <div class="back_box">
        <!--红色进度条-->
        <div id="schedule_bar" style="width: 0%;" ></div>
    </div>
    <!--当前进度百分比-->
    <p id="schedule">0%</p>

</body>
</html>
```



## 题目5（综合案例）

题干：请认真阅读下列代码，完成如下效果：

​	![](../_0414_practise/练习题目/picture/动态时间.png)

​	在id为date_time的元素上显示时间，每秒钟更新一次。

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
        在id为date_time的元素上显示时间，每秒钟更新一次
        */
    </script>
</head>
<body>
<div id="date_time"></div>

</body>
</html>
```

### 训练目标

灵活使用js加载事件、定时器、DOM操作

### 训练提示

1. 如何动态修改div元素的内容？
2. 如何实现每秒钟更新div元素的内容？
3. 如何获取当前日期时间？

### 操作步骤

1.定义一个函数，完成在div元素上显示日期时间的功能

​	1.获取div元素对象；

​	2.创建Date对象，获取本地时间格式字符串；

​	3. 通过  元素对象.innerHTML = 值   把本地时间字符串设置为div元素的内容；

2.设置循环定时器；



### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
        在id为date_time的元素上显示时间，每秒钟更新一次
        */

        //定义一个函数，完成在div元素上显示日期时间的功能
        function updateTime(){
            //获取div元素对象
            var ele_date_time = document.getElementById("date_time");
            //创建Date对象
            var date = new Date();
            //获取本地日期时间字符串
            var str = date.toLocaleString();
            //设置div元素内容为本地日期时间字符串
            ele_date_time.innerHTML=str;
        }

        //设置循环定时器，每秒钟执行一次uodateTime函数
        window.setInterval("updateTime()",1000);
    </script>
</head>
<body>
<div id="date_time"></div>

</body>
</html>
```



## 题目6（综合案例）

题干：请认真阅读下列代码，完成如下效果：

​	![](../_0414_practise/练习题目/picture/动态生成表格.png)

​	获取行和列输入的数字，点击生成按钮，在id为table的div中生成对应行数和列数的表格，
每个单元格的内容都是：表格内容

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
    /*
        获取行和列输入的数字，点击生成按钮，在id为table的div中生成对应行数和列数的表格，每个单元格的内容都是：表格内容
     */
    

    </script>
</head>
<body>
    行：<input type="text" name="row" id="row"/>
    列：<input type="text" name="column" id="column"/>
    <br>

    <input type="button" value="生成" id="btn"/>
    <div id="table"></div>

</body>
</html>
```

### 训练目标

灵活使用js加载事件、DOM操作

### 训练提示

1. 如何给按钮绑定点击事件？
2. 如何获取input输入框的值？
3. 如何动态生成行数和列数？
4. 如何给div设置内容？

### 操作步骤

1.定义一个函数，完成在div中生成动态表格的功能

​	1.获取用户输入的行数和列数；

​	2.定义一个字符串table，用于拼接table的html内容；

​	3.使用for循环，动态生成tr；

​	4.使用for循环，动态生成td；

​	5.把字符串设置为div的元素内容；

2.在加载完成事件函数中，获取生成按钮元素对象，绑定点击事件；



### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
            获取行和列输入的数字，点击生成按钮，在id为table的div中生成对应行数和列数的表格，每个单元格的内容都是：表格内容
         */
        //定义一个函数，动态生成表格
        function createTable() {
            //获取用户输入的行数
            var row = document.getElementById("row").value;
            //获取用户输入的列数
            var column = document.getElementById("column").value;

            //定义一个字符串table，用于拼接table的html内容
            var table = "<table border='1px' cellpadding='0' cellspacing='0' bordercolor='blue'>";

            //生成指定的行数
            for(let i=0;i<row;i++){
                table+="<tr>"
                //生成每行中的单元格
                for(let j=0;j<column;j++){
                    table+="<td>表格内容</td>"
                }
                table+="</tr>"
            }

            table+="</table>"

            //把table设置为div的内容
            document.getElementById("table").innerHTML=table;

        }
        window.onload = function (ev) {
            //获取生成按钮元素对象
            var ele_button = document.getElementById("btn");
            //绑定点击事件
            ele_button.onclick = createTable;
        }

    </script>
</head>
<body>
    行：<input type="text" name="row" id="row"/>
    列：<input type="text" name="column" id="column"/>
    <br>

    <input type="button" value="生成" id="btn"/>
    <div id="table"></div>

</body>
</html>
```



## 题目7（综合案例）

题干：请认真阅读下列代码，完成如下效果：

​	![](../_0414_practise/练习题目/picture/点击清空.png)

​	请使用js代码实现：    

​		点击清空按钮，在浏览器弹出确认框        

​			如果用户点击取消按钮，则不做任何操作        

​			如果用户点击确认按钮，则清空textarea中用户输入的内容

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
            请使用js代码实现：
                点击清空按钮，在浏览器弹出确认框
                    如果用户点击取消按钮，则不做任何操作
                    如果用户点击确认按钮，则清空textarea中用户输入的内容
        */
       
    </script>
</head>
<body>
    意见或建议:<br>
    <!--评论框-->
    <textarea id="comment" cols="50" rows="10" placeholder="相信您的建议，一定会一针见血(不支持富文本)"></textarea>
    <!--清空评论框的按钮-->
    <input id="clear" type="button" value="清空">
</body>
</html>
```

### 训练目标

灵活使用js加载事件、确认提示框、DOM操作

### 训练提示

1. 如何给按钮绑定点击事件？
2. 如何弹出确认框？
3. 如何获取用户操作确认框的结果？
4. 如何清空textarea中用户输入的内容？

### 操作步骤

1.定义一个函数，实现用户确认清空操作

​	1.弹出确认框，等待用户选择

​	2.判断用户选择的结果(用户操作确认框后，会有一个布尔类型的返回值)

​		选择了确定,清空评论框的用户输入内容

​		选择了取消，不需要做任何操作

2.在加载完成事件函数中，获取清空按钮元素对象，绑定点击事件；

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
            请使用js代码实现：
                点击清空按钮，在浏览器弹出确认框
                    如果用户点击取消按钮，则不做任何操作
                    如果用户点击确认按钮，则清空textarea中用户输入的内容
        */
        //定义一个函数，实现用户确认清空操作
        function clearContent(){
            //弹出确认框，等待用户选择
            var flag = confirm("确认清空评论内容吗？");
            //判断用户选择的结果
            if (flag){
                //选择了确定,清空评论框的用户输入内容
                document.getElementById("comment").value="";
            }else{
                    //选择了取消，不需要做任何操作
            }
        }
        window.onload=function (ev) {
            //获取清空按钮元素对象
            var btn_clear = document.getElementById("clear");
            //绑定点击事件
            btn_clear.onclick=clearContent;
        }
    </script>
</head>
<body>
    意见或建议:<br>
    <!--评论框-->
    <textarea id="comment" cols="50" rows="10" placeholder="相信您的建议，一定会一针见血(不支持富文本)"></textarea>
    <!--清空评论框的按钮-->
    <input id="clear" type="button" value="清空">
</body>
</html>
```



## 题目8（综合案例）

题干：请认真阅读下列代码，完成以下如下效果：

​	![](../_0414_practise/练习题目/picture/创建对象.png)

​	请使用js代码实现：    

​		点击“通过构造器方式生成对象，并在提示框中弹出对象信息”按钮，获取输入框中的内容
        通过构造器的方式生成对象，并在浏览器中弹出提示框，显示对象的内容；

​		点击"通过字面量方式生成对象，并在提示框中弹出对象信息"按钮，获取输入框中的内容
        通过字面量的方式生成对象，并在浏览器中弹出提示框，显示对象的内容；

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
            定义函数，获取输入框中的内容，通过构造器的方式生成对象，并在浏览器中弹出提示框，显示对象的内容
        */

        /*
           定义函数，获取输入框中的内容，通过字面量的方式生成对象，并在浏览器中弹出提示框，显示对象的内容
       */
    </script>
</head>
<body>
    姓名：<input type="text" name="username" id="username"><br>
    年龄：<input type="text" name="birthday" id="birthday"><br/>
    住址: <input type="text" name="address" id="address"><br>
    <input id="btn1" type="button" value="通过构造器方式生成对象，并在提示框中弹出对象信息">
    <input id="btn2" type="button" value="通过字面量方式生成对象，并在提示框中弹出对象信息">
</body>
</html>
```

### 训练目标

灵活使用js加载事件、js自定义对象，弹出框

### 训练提示

1. 如何给按钮绑定点击事件？
2. 如何通过构造器方式创建对象？
3. 如何通过字面量方式创建对象？
4. 如何弹出提示框？

### 操作步骤

1.定义一个函数，完成构造器方式创建对象，并弹出提示框

​	1.获取用户输入的姓名、年龄、住址等信息；

​	2.定义构造器

​	3.通过new关键字调用构造器，传递用户输入的信息，创建对象

​	4.弹出提示框

2.定义一个函数，完成字面量方式创建对象，并弹出提示框

​	1.获取用户输入的姓名、年龄、住址等信息；

​	2.通过字面量方式创建对象

​	3.弹出提示框

3.在加载完成事件函数中，获取按钮元素对象，绑定点击事件；

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
        /*
            定义函数，获取输入框中的内容，通过构造器的方式生成对象，并在浏览器中弹出提示框，显示对象的内容
        */
        function fun1(){
            //获取用户输入的姓名、年龄、住址等信息
            var username = document.getElementById("username").value;
            var birthday = document.getElementById("birthday").value;
            var address = document.getElementById("address").value;

            //定义构造器
            function User(username,birthday,address){
                this.username=username;
                this.birthday=birthday;
                this.address=address;
            }
            //调用构造器，传递用户输入的信息，创建对象
            var user = new User(username,birthday,address);
            //弹出提示框
            alert("姓名："+user.username+", 年龄："+birthday+", 住址："+address);
        }
        /*
           定义函数，获取输入框中的内容，通过字面量的方式生成对象，并在浏览器中弹出提示框，显示对象的内容
       */
        function fun2(){
            //获取用户输入的姓名、年龄、住址等信息
            var username = document.getElementById("username").value;
            var birthday = document.getElementById("birthday").value;
            var address = document.getElementById("address").value;

            //通过字面量方式创建对象
            var user ={username:username,birthday:birthday,address:address};
            //弹出提示框
            alert("姓名："+user.username+", 年龄："+birthday+", 住址："+address);
        }

        window.onload=function (ev) {
            //获取按钮元素对象，绑定点击事件
            document.getElementById("btn1").onclick=fun1;
            document.getElementById("btn2").onclick=fun2;
        }
    </script>
</head>
<body>
    姓名：<input type="text" name="username" id="username"><br>
    年龄：<input type="text" name="birthday" id="birthday"><br/>
    住址: <input type="text" name="address" id="address"><br>
    <input id="btn1" type="button" value="通过构造器方式生成对象，并在提示框中弹出对象信息"><br>
    <input id="btn2" type="button" value="通过字面量方式生成对象，并在提示框中弹出对象信息">
</body>
</html>
```



## 题目9（综合案例）

题干：请认真阅读下列代码，使用js代码，完成5秒后跳转到百度首页功能；每过一秒，需要刷新剩余时间

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
            /*请使用js代码，完成5秒后跳转到百度首页功能；每过一秒，需要刷新剩余时间*/
    </script>
</head>
<body>
    <div>
        <span id="remainder_time">5</span>秒后跳转到百度页面
    </div>
</body>
</html>
```

### 训练目标

灵活使用定时器、location对象、DOM操作

### 训练提示

1. 如何修改页面的剩余时间？
2. 如何实现页面跳转？
3. 如何每秒钟循环执行？

### 操作步骤

1.定义一个函数，完成页面剩余时间刷新及页面跳转功能

​	1.获取显示剩余时间的元素对象

​	2.获取当前剩余时间

​	3.计算出下一次应该显示的剩余时间

​	4.判断剩余时间是否小于等于0

​		小于等于0：

​			通过location对象跳转到百度首页

​		不满足：

​			继续设置定时任务

2.设置定时任务

### 参考答案

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
            /*请使用js代码，完成5秒后跳转到百度首页功能；每过一秒，需要刷新剩余时间*/
            function refreshTime() {
                //获取显示剩余时间的元素对象
                var ele_remainder_time = document.getElementById("remainder_time");
                //获取当前剩余时间
                var time  = window.parseInt(ele_remainder_time.innerHTML);
                //计算出下一次应该显示的剩余时间
                time--;
                //判断剩余时间是否小于等于0
                if(time<=0){
                    //跳转到百度首页
                    location.href="https://www.baidu.com";
                }else{
                    //刷新当前页面剩余时间
                    ele_remainder_time.innerHTML=time+"";
                    //设置定时任务
                    setTimeout("refreshTime()",1000);
                }
            }
            //设置定时任务
            setTimeout("refreshTime()",1000);

    </script>
</head>
<body>
    <div>
        <span id="remainder_time">5</span>秒后跳转到百度页面
    </div>
</body>
</html>
```



