# 知识点

javascript基础语法

## 题目1（加强训练）

题干：请认真阅读下列代码，分别使用内部js和外部js在浏览器弹出 "javascript是一门脚本语言" 这句话

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
</head>
<body>
    
</body>
</html>
```

### 训练目标

掌握js的引入方式

### 训练提示

1. 如何在浏览器弹出一个字符串？
2. 内部js和外部js的使用格式？

### 操作步骤

1. 通过js语句 alert("提示内容") 可以在浏览器弹出一个提示框，并显示提示内容；

2. js的两种引入方式：

   1. 内部js：

      在html文档中定义<script>标签，在标签体内书写js代码

   2. 外部js：

      在html文档外部创建.js文件，并书写js代码，然后在html文档中通过<script src="js文件位置"/>引入外部js

      

### 参考答案

内部js：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
        alert("javascript是一门脚本语言");
    </script>
</head>
<body>

</body>
</html>

```

外部js：在当前html文档所在目录下创建 temp.js 文件，并在文件中书写js代码 alert("javascript是一门脚本语言"),然后在当前html文档中通过 <script src="./temp.js"></script> 引入temp.js

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script src="./temp.js"></script>
</head>
<body>

</body>
</html>
```



## 题目2（加强训练）

题干：请认真阅读下列代码，完成以下需求：

​	1.分析出有问题的代码，并说出原因；

​	2.注释掉有问题的代码，让整个js代码可以执行完毕

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
        {
            var a = 1;
            a=2;
            console.log("第一次输出a："+a);

            let b = 3;
            b=4;
            console.log("第一次输出b："+b);

            const c = 5;
            // c = 6;
            console.log("第一次输出c："+c);
            d=6;
            console.log("第一次输出d："+d);

        }

        console.log("第二次输出a："+a);
        console.log("第二次输出b："+b);
        console.log("第二次输出c："+c);
        console.log("第二次输出d："+d);
    </script>
</head>
<body>

</body>
</html>
```

运行结果：

> 第一次输出a：2
> 第一次输出b：4
> 第一次输出c：5
> 第一次输出d：6
> 第二次输出a：2
> 第二次输出d：6

### 训练目标

掌握定义变量使用的关键字

### 训练提示

var、let、const定义变量有什么区别？他们的作用域范围？

### 操作步骤

const定义的变量不可以修改，而且必须初始化，该变量受全局作用域、函数作用域及块级作用域的限制。 

let定义的变量可以修改，该变量受全局作用域、函数作用域及块级作用域的限制。

var定义的变量可以修改，该变量只受全局作用域和函数作用域的限制，并不受块级作用域的限制。

### 参考答案

`c=6;` 这行代码会报错，原因是const定义的变量，不能再修改值；

`console.log("第二次输出b："+b);` 这行代码会报错，原因是let定义的变量，受块级作用域限制，出了定义变量所在的大括号，就失效了；

`console.log("第二次输出c："+c); ` 这行代码会报错，原因是const定义的变量，受块级作用域限制，出了定义变量所在的大括号，就失效了；

因此，将以上3行代码注释后的结果如下列代码：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
        {
            var a = 1;
            a=2;
            console.log("第一次输出a："+a);

            let b = 3;
            b=4;
            console.log("第一次输出b："+b);

            const c = 5;
            // c = 6;
            console.log("第一次输出c："+c);

            d=6;
            console.log("第一次输出d："+d);

        }

        console.log("第二次输出a："+a);
        // console.log("第二次输出b："+b);
        // console.log("第二次输出c："+c);
        console.log("第二次输出d："+d);
    </script>
</head>
<body>

</body>
</html>
```



## 题目3（加强训练）

题干：请认真阅读下列代码，完成以下需求：        

​	遍历1~100之间的数字，分别求出以下结果并打印到控制台

​		 1.所有2的倍数的和；

​		 2.所有3的倍数的和；

​		 3.所有5的倍数的和；

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
       /*
       遍历1~100之间的数字，分别求出以下结果并打印到控制台：
                1.所有2的倍数的和；
                2.所有3的倍数的和；
                3.所有5的倍数的和；
       */
    </script>
</head>
<body>

</body>
</html>
```

运行结果：

> sum2=2550
>
> sum3=867
>
> sum5=365

### 训练目标

掌握流程控制语句

### 训练提示

1.如何分别保存2的倍数的和、3的倍数的和、5的倍数的和？

2.如何得到1~100之间的每一个数？

3.如何判断一个数字是不是某个数的倍数？

4.如何打印数据到控制台？

### 操作步骤

1.分别定义3个变量保存2的倍数的和、3的倍数的和、5的倍数的和。

2.通过for循环遍历1~100之间的数字；

3.通过if语句进行判断，例如：

​	数字%2==0

4.通过console.log("要输出的内容")语句，完成控制台的输出。

### 参考答案

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
       /*
       遍历1~100之间的数字，分别求出以下结果并打印到控制台：
                1.所有2的倍数的和；
                2.所有3的倍数的和；
                3.所有5的倍数的和；
       */

       //定义sum2保存2的倍数的和
       var sum2=0;
       //定义sum3保存3的倍数的和
       var sum3=0;
       //定义sum5保存5的倍数的和
       var sum5=0;
       //遍历1~100之间的所有数字
        for(let i = 1;i<=100;i++){
            if(i%2==0){
                sum2+=i;
            }
            if(i%3==0){
                sum3+=i;
            }
            if(i%5==0){
                sum5+=i;
            }
        }
        console.log("sum2="+sum2);
        console.log("sum3="+sum3);
        console.log("sum5="+sum5);

    </script>
</head>
<body>

</body>
</html>
```



## 题目4（加强训练）

题干：认真阅读下列代码，请定义一个函数，接收一个参数，求出0到该参数之间的和，并调用函数完成测试，输出结果到控制台

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
      /*请定义一个函数，接收一个参数，求出0到该参数之间的和*/

      //调用函数，输出结果到控制台

    </script>
</head>
<body>

</body>
</html>
```

### 训练目标

掌握函数的定义及使用

### 训练提示

1.如何定义一个函数？

2.如何求出0到某个数之间的和？

### 操作步骤

1.定一个函数：

​	function 函数名(参数){

​		//代码逻辑

​	}

2.使用for循环，得到0到参数之间每个数字，并把每个数字叠加到求和变量上

3.调用函数测试；

### 参考答案

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
      /*请定义一个函数，接收一个参数，求出0到该参数之间的和*/
      function sum(n){
          //定义一个变量，用来保存和
          let sum=0;
          for(let i=0;i<=n;i++){
              sum+=i;
          }
          //返回结果
          return sum;

      }
      //调用函数
        var sum = sum(100);
        //输出结果到控制台
      console.log("sum="+sum);

    </script>
</head>
<body>

</body>
</html>
```



## 题目5（综合案例）

题干：认真阅读下列代码，请定义一个函数，求出调用方法时传递的所有参数中的最大值，并返回，
传递的参数可以是任意多个整数，调用函数测试，并在控制台打印输出最大值。

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
      /*请定义一个函数，求出调用方法时传递的所有参数中的最大值，并返回，传递的参数可以是任意多个整数*/

      //调用函数,在控制台打印输出最大值

    </script>
</head>
<body>

</body>
</html>
```

### 训练目标

掌握函数的内置对象arguments

### 训练提示

1.如何定义一个函数？

2.如何获取调用函数时传递的任意个参数？

### 操作步骤

1.定一个函数：

​	function 函数名(){

​		//代码逻辑

​	}

2.遍历函数的内置对象arguments，可以得到每一个传递的参数，求出最大值并返回；

3.调用函数测试；

### 参考答案

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
      /*请定义一个函数，求出调用方法时传递的所有参数中的最大值，并返回，传递的参数可以是任意多个整数*/
      function max(){
          //安全性判断，如果没有传递参数，则不做任何操作
          if(arguments.length==0){
              return;
          }
          //定义一个变量记录最大值
          let max=arguments[0];
          //遍历arguments对象
          for(let i=1;i<arguments.length;i++){
              if(arguments[i]>max){
                  max=arguments[i];
              }
          }
          //返回最大值
          return max;
      }
     //调用函数,在控制台打印输出最大值
      var maxValue = max(20,30,15,26,88,77,99,5,7);
      console.log("maxValue="+maxValue);
    </script>
</head>
<body>

</body>
</html>
```



## 题目6（综合案例）

题干：开发一款软件，根据公式（身高-108）\*2=体重，对比公式得出的标准体重和用户的实际体重，给用户不同的提示：

​		1.  10<实际体重-标准体重：

​			提示用户，您的体重偏重，需要适当运动减肥；

​		2.   -10<实际体重-标准体重<10

​			提示用户，您的体重正常，继续保持哟；

​		3.   -10>实际体重-标准体重；

​			提示用户，您的体重偏瘦，需要适当增加营养；

### 训练目标

掌握函数定义和流程控制语句的使用

### 训练提示

1.如何定义一个函数？

2.如何根据不同的结果，给出不同的提示？

### 操作步骤

1.定一个函数：

​	function 函数名(身高，体重){

​		//代码逻辑

​	}

2.计算出标准体重；

3.使用if...else...if语句判断标准体重和实际体重的情况，给出不同的提示

4.调用函数测试

### 参考答案

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
      //定义一个方法，接收身高和体重两个参数
        function testWeight(height,weight){
            //计算出标准体重
            let standardWeight = (height-128)*2;
            //使用if...else...if语句判断实际体重和标准体重的不同情况
            if(weight-standardWeight>=-10 && weight-standardWeight<=10){
                alert("您的体重正常，继续保持哟");
            }else if(weight-standardWeight<-10){
                alert("您的体重偏瘦，需要适当增加营养");
            }else if(weight-standardWeight>10){
                alert("您的体重偏重，需要适当运动减肥");
            }
        }
        //调用函数测试
        testWeight(158,90);
    </script>
</head>
<body>

</body>
</html>
```



## 题目7（综合案例）

题干：根据输入月份，输出当月有多少天

### 训练目标

掌握函数定义和流程控制语句的使用

### 训练提示

1.如何定义一个函数，接收月份？

2.如何根据不同的月份，提示不同的天数？

### 操作步骤

1.定一个函数：

​	function 函数名(月份){

​		//代码逻辑

​	}

2.使用switch语句，灵活使用switch穿透，根据不同的结果，给出不同的天数

3.调用函数测试

### 参考答案

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>js基础语法</title>
    <script>
        //定义一个函数，接收一个月份
        function account_day(month) {
            //定义一个变量，记录当前月份的天数
            let days;
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days=31;
                    break;
                case 2:
                    days=28;
                    break;
                default:
                    days=30;
                    break;
            }
            return days;
        }
        //调用函数测试
        var accountDay = account_day(2);
        //弹出提示框
        alert(accountDay);
    </script>
</head>
<body>

</body>
</html>
```

















