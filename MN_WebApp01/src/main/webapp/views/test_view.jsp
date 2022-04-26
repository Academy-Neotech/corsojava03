<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/test.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li id="elemento_da_nascondere"><a class="dropdown-item" href="#">Elemento1</a></li>
            <li id="elemento02"><a class="dropdown-item" href="#">Elemento2</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Elemento3</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
</nav>



<form:form id="form_submit" action="registrazione_dati" method="get" modelAttribute="registrazione">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1"></span>
  <form:input  id="username" path="username"  class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1"/>
  <form:input  id="password" path="password"  class="form-control" placeholder="Password" aria-label="Username" aria-describedby="basic-addon1"/>
  <form:input  id="password" path="password"  class="form-control" placeholder="Password" aria-label="Username" aria-describedby="basic-addon1"/>
   <form:select path="sesso">
       <form:option value="maschio" label="maschio"/>
       <form:option value="femmina" label="femmina"/>
       <form:option value="altro" label="altro"/>  
   </form:select>
</div>
 <button type="submit" id="bth-search" class="btn btn-primary btn-lg">Registrati</button>
</form:form>



<script src="static/js/test.js"></script>
</body>
</html>