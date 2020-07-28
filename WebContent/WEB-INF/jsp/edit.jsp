<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>电影信息修改页面</title>
    <style type="text/css">
        .Content-Main{
            max-width: 500px;
            margin: auto;
            border: none;
            border-radius: 5px; 
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            font: 12px "Helvetica Neue", Helvetica, Arial, sans-serif;
            text-shadow: 1px 1px 1px #444;
            color: #D3D3D3;
            background: #555;
        }
        .Content-Main h1{
            padding: 8px 0px 40px 10px;
            display: block;
            border-bottom: 1px solid #444;
        }
        .text1{
            margin-left: 3px;
        }
        .Content-Main label{
            margin: 0px 0px 5px;
            display: block;
        }
        .fileInputContainer{
            height: 99px;
            width: 99px;
            margin: 20px 20px 20px 20px ;
            border: none;
            background: url("img/Example.jpg");
            overflow: hidden; 
            position: relative; 
        }
        .fileInput{
            height: 106px;
            border: none;
            font-size: 300px;
            opacity: 0;  
            filter:alpha(opacity=0);
            cursor: pointer;
            position: absolute;
        }
        .Content-Main label>span{
            width: 20%;
            float: left;
            text-align: right;
            padding-right: 10px;
            margin-top: 10px;
            font-weight: bold;
        }
        .Main-sex{
            padding-right: 13px;
            padding-bottom: 13px;
            font-weight: bold;
            line-height: 4px; 
        }
        .Main-sex input[type=checkbox]{
            margin-top:6px;
            vertical-align:middle; 
        }
        .Content-Main input[type="text"],.Content-Main input[type="email"],.Content-Main textarea{
            height: 25px;
            width: 70%;
            line-height: 15px;
            padding: 5px 0px 5px 5px; 
            margin-bottom: 16px;
            margin-right: 6px;
            margin-top: 2px;
            border: none;
            border-radius:2px;
            -webkit-border-radius:2px;
            -moz-border-radius:2px;
            outline: 0 none; 
            background:  #DFDFDF;
            color: #525252;
        }
        .Content-Main textarea{
            height: 100px;
            width: 70%;
            padding: 5px 0px 0px 5px;
        }
        .Content-Main .button{
            padding: 8px 24px 8px 24px;
            margin-bottom: 8px;
            border: none;
            border-radius: 4px;
            -moz-border-radius: 4px;
            -webkit-border-radius: 4px;
            font-weight: bold;
            text-shadow: 1px 1px 1px #FFE477;
            box-shadow: 1px 1px 1px  #3D3D3D;
            -moz-box-shadow: 1px 1px 1px  #3D3D3D;
            -webkit-box-shadow: 1px 1px 1px  #3D3D3D;
            color: #585858;
            background: #f6ff0a;
        }
        .Content-Main .button:hover{
            color:  #333;
            background-color:  #EBEBEB ;
        }
    </style>
</head>
<body>
        <div class="Content-Main">
            <form  action="${pageContext.request.contextPath}/film/updateFilm.action" 
            method="post" class="form-userInfo" enctype="multipart/form-data"><!-- enctype是编码类型的意思。默认情况下，enctype的值是application/x-www-form-urlencoded，不能用于文件上传，只有使用了multipart/form-data，才能完整的传递文件数据。 -->
                <h1>电影信息-修改</h1>
               	<input type="hidden"  name="filmInfo.id" value="${film.id}">
                <p>
                <label>
                    <span>电影名称:</span>
                    <input type="text"  name="filmInfo.fName" value="${film.fName}">
                </label>
                <label class="Main-sex">
                    <span>电影类型:</span>
                      <input type="text" name="filmInfo.fType" value="${film.fType}" >
                </label>
                <label>
                    <span>电影评分（分）:</span>
                    <input type="text" name="filmInfo.fScore"  value="${film.fScore}" >
                </label>
                <label>
                    <span>上映年份（年）:</span>
                    <input type="text" name="filmInfo.fPlayYear"  value="${film.fPlayYear}" >
                </label>
                <label>
                    <span>国籍:</span>
                    <input type="text" name="filmInfo.fOrigin"  value="${film.fOrigin}" >
                </label>
                <label>
                    <span>电影海报:</span>
	                	<c:if test="${film.fPic != null }">
	                		<img alt="海报" src="/fpic/${film.fPic}" width="100" height="100"><!-- src="/虚拟目录path的值/图片名称" -->
	                	</c:if>
                    <input type="file" name="fileImg"  >
                </label>
                <label style="text-align:center;">
                    <input type="submit" class="button" value="提交">
                </label>
            </form>
        </div>
</body>
</html>
