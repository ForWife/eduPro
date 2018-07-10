/**********************login页面的js****************************/ 


            function toVaild(){
                var val = document.getElementById("name").value;
                var vcl = document.getElementById("password").value;
                if(val!="")
                { 
                	if (vcl!="")
                	{               
                        return true;
                	}
                	else{
                	alert("密码为空，提交失败！");
                    return false;
                   }
                	}
                else{
                	 alert("用户名为空，提交失败！");
                    return false;
                }
                
           }
     
     
     function Vaild()
     {
        	alert("你无法以超级管理员的身份登录！");
        	return false;       
     }
