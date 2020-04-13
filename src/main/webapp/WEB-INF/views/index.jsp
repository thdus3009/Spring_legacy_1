<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="./template/boot.jsp"></c:import>
<c:import url="./template/header.jsp"></c:import>


 
  <div class="container">
  <h2>Carousel Example</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="${pageContext.request.contextPath}/resources/images/la.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/images/chicago.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/images/ny.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


<!-- Nav -->	
<div class="container">
  <h3>This Page is Index Page,</h3>
  <p>The .navbar-right class is used to right-align navigation bar buttons.</p>
</div>


<div class="container">
  <div class="jumbotron">
    <h1>Main Page</h1>      
    <p>Bootstrap is the most popular HTML, CSS, and JS framework for developing responsive, mobile-first projects on the web.</p>
  </div>
     
</div>

