<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>电影表信息</title>
		<style>
		 table {
		    border-collapse: collapse;
		    border-spacing: 0;
		  }
		  .cloudTableAuto{
		    width:1200px;
		    margin:20px auto;
		  }
		  .cloudTable{
		    border: 1px solid #e0e6ed;
		    font-size: 16px;
		    width:100%;
		  }
		  .cloudTableTitle{
		    padding:10px 20px;
		  }
		  .cloudTable td {
		    height: 40px;
		    min-width: 0px;
		    box-sizing: border-box;
		    vertical-align: middle;
		    position: relative;
		    border-bottom: 1px solid #e0e6ed;
		  }
		  /*  表头 */
		  .cloudTable_header tr {
		    background-color: #efeff1;
		  }
		  .cloudTable_header th {
		    min-width: 0;
		    box-sizing: border-box;
		    text-overflow: ellipsis;
		    vertical-align: middle;
		    position: relative;
		    border-bottom: 1px solid #e0e6ed;
		    border-right: 1px solid #e0e6ed;
		    padding: 10px 0px;
		    white-space: nowrap;
		    overflow: hidden;
		    font-weight: bold;
		    text-align: -internal-center;
		  }
		
		  /* 表身体 */
		  .cloudTable_body tr td {
		    height: 40px;
		    text-align: center;
		    white-space: nowrap;
		    overflow: hidden;
		    text-overflow: ellipsis;
		    text-align: center;
		    box-sizing: border-box;
		    -webkit-box-sizing: border-box;
		    font-family: 'Lato', 'Helvetica Neue', Arial, Helvetica, sans-serif;
		  }
		  .cloudTable_body tr td {
		    box-sizing: border-box;
		    white-space: nowrap;
		    overflow: hidden;
		    text-overflow: ellipsis;
		    text-align: center;
		    border-right: 1px solid #e0e6ed;
		  }
		  .cloudMtxTable_body{
		    /*height:102px;*/
		    height:402px;
		    width:100%;
		    overflow-y: auto;
		    border-bottom: 1px solid #e0e6ed;
		  }
		
		  /* 公用样式 */
		  .data-cell {
		    padding-left: 15px;
		    padding-right: 15px;
		    font-family: 'Lato', 'Helvetica Neue', Arial, Helvetica, sans-serif;
		  }
		  .cloudTable_body tr:hover {
		    background-color: #c5e8fe;
		  }
		</style>
	</head>
<body> 
<div class="cloudTableAuto">
    <!-- 第一个table -->
    <table class="cloudTable cloudMtxTableHead">
      <colgroup>
        <col width="60">
        <col width="220px">
        <col width="230px">
        <col width="90px">
        <col width="90px">
        <col width="160px">
        <col width="150px">
        <col width="">
        <col width="16px">
      </colgroup>
      <thead class="cloudTable_header">
        <tr>
          <th>序号</th>
          <th>电影名称</th>
          <th>电影类别</th>
          <th>评分</th>
          <th>上映时间</th>
          <th>国籍</th>
          <th>操作1</th>
          <th>操作2</th>
          <th style="width: 16px;"></th>
        </tr>
      </thead>
    </table >
    <!-- 第二个table 外层包裹div并设置高度，超出出现滚动条 -->
    <form action="${basePath}/film/deleteByIds.action" method="post"><!-- 批量删除 -->
    <div class="cloudMtxTable_body">
      <table class="cloudTable"  style="table-layout:fixed">
        <colgroup >
          <col width="60">
          <col width="60">
          <col width="220px">
          <col width="230px">
          <col width="90px">
          <col width="90px">
          <col width="160px">
          <col width="150px">
          <col width="">
        </colgroup>
        <tbody class="cloudTable_body ">
        <!-- ${status.index}输出行号，从0开始。${status.count}输出行号，从1开始。${status.current}当前这次迭代的（集合中的）项${status.first}判断当前项是否为集合中的第一项，返回值为true或false；${status.last}判断当前项是否为集合中的最后一项，返回值为true或false -->
        <c:forEach items="${filmList}" var="film" varStatus="status">
	        <tr>
	            <td><input type="checkbox" name="filmIds" value="${film.id}"/></td><!-- 复选框，批量删除，name值是一个int数组 -->
	            <td>${status.count}</td><!-- 序号 -->
	            <td class="data-cell"><span>${film.fName}</span></td>
	            <td class="data-cell">${film.fType}</td>
	            <td>${film.fScore}</td>
	            <td>${film.fPlayYear}</td>
	            <td>${film.fOrigin}</td>
	            <td><a href="${pageContext.request.contextPath}/film/deleteById.action?filmId=${film.id}">删除</a></td>
	            <td><a href="${pageContext.request.contextPath}/film/selectById.action?filmId=${film.id}">修改</a></td>
	          </tr>
        </c:forEach>

        </tbody>

      </table>
    </div>
    <input type="submit" value="删除当前所选">
    </form>
  </div>
</html>