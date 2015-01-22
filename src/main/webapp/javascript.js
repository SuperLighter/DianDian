
var xmlRequest;

function loadXML()
{
		try{
			xmlRequest = new XMLHttpRequest(); 
		}catch(e){
			try{
				xmlRequest = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
				xmlRequest = new ActiveXObject("Microsoft.XMLHTTP");
			}
			}
	return xmlRequest;
	
	
}


function statechange(){		
	if(xmlRequest.readyState==4 ){		
		if(xmlRequest.status==200){
		document.getElementById("center").innerHTML = xmlRequest.responseText;
        }else{
            alert("您所请求的页面有异常!");
            alert(xmlRequest.status);
        }
	}
}

function loginXML(userid_Str,userpassword_Str)
{
	if(userid_Str==""||userid_Str==null||userid_Str=="请输入账号!")
	{
	document.getElementById("idTXT").value="请输入账号!";
	return;
	}
	if(userpassword_Str==""||userpassword_Str==null||userpassword_Str=="请输入密码!")
	{
	document.getElementById("pwdTXT").value="请输入密码!";
	return;
	}
	xmlRequest=loadXML();
	if(xmlRequest==null)
	{
	  alert("您的浏览器不支持AJAX!");
	  return;
	}
	
	xmlRequest.onreadystatechange = statechange;
	xmlRequest.open("POST","src/main/resources/LoginCheck.action", true);
	xmlRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
	xmlRequest.send("userid="+userid_Str+"&userpassword="+userpassword_Str); 
}


function loginApp(userid_Str,userpassword_Str)
{
	if(userid_Str==""||userid_Str==null||userid_Str=="请输入账号!")
	{
	document.getElementById("idTXT").value="请输入账号!";
	return;
	}
	if(userpassword_Str==""||userpassword_Str==null||userpassword_Str=="请输入密码!")
	{
	document.getElementById("pwdTXT").value="请输入密码!";
	return;
	}
	xmlRequest=loadXML();
	if(xmlRequest==null)
	{
	  alert("您的浏览器不支持AJAX!");
	  return;
	}
	
	xmlRequest.onreadystatechange = statechange;
	xmlRequest.open("POST","src/main/resources/LoginApp_action.action", true);
	xmlRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
	xmlRequest.send("userid="+userid_Str+"&userpassword="+userpassword_Str); 
}


function keydown(e){
	var ev =window.event||e; //这样写是为了兼容FireFox和IE，因为IE的onkeydown在FF中不起作用
	if (ev.keyCode==13) {
		   ev.returnValue=false;
		   ev.cancel = true;    
		   var sub =  document.getElementById("input");
		  sub.click();
		  } 
}

function loadCallback() {  
    alert("-------3---------");  
    //alert(xmlHttpReq.readyState);  
    if (xmlHttpReq.readyState == 4) {  
       alert("aa");  
        //if(xmlHttpReq.status==200){  
        document.getElementById("contentDiv").innerHTML=xmlHttpReq.responseText;  
        //}  
    }  
} 
