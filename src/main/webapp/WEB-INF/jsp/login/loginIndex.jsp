<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/3/2
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登陆界面</title>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
</head>
<script type="application/javascript">
    function loginIn() {
        $.ajax({
            url:'ssm/login/toLogin',
            type:'POST',
            async:true,    //或false,是否异步
            data:{
                username:'yang',password:'222'
            },
            timeout:5000,    //超时时间
            dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
            beforeSend:function(xhr){
                console.log(xhr)
                console.log('发送前')
            },
            success:function(data,textStatus,jqXHR){
                console.log(data)
                console.log(textStatus)
                console.log(jqXHR)
            },
            error:function(xhr,textStatus){
                console.log('错误')
                console.log(xhr)
                console.log(textStatus)
            },
            complete:function(){
                console.log('结束')
            }
        })

    }

</script>
<body>



    <div style="child-align: auto;">
        <div>
            <label>用户名:</label>
            <input type="text" name="username"/>
        </div>
        <div>
            <label>密码：</label>
            <input type="password" name="password"/>
        </div>
        <div>
            <label>验证码:</label>
            <input type="text" name="validationCode"/>
           <%-- <img id="validationCode_img" src="validateCode">--%>
        </div>

        <div>
            <span></span>
            <input type="button" onclick="loginIn()" value="登录"/>
        </div>
    </div>



</body>
</html>
