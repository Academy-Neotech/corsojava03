<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Aerei</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/test.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<table style="text-align:center" border=1>
<tr>
   <th>id</th>
   <th>UUID</th>
   <th>nome</th>
   <th>numPasseggeri</th>
</tr>
<c:set var = "numAerei"  value = "0"/>
<c:forEach var="aereo" items="${responseAerei.listaAereiRestituiti}">
<c:set var = "numAerei"  value = "${numAerei+1}"/>
<tr border=1>
    <td border=1><c:out value="${numAerei}"/></td>
    <td border=1><c:out value="${aereo.id}"/></td>
    <td border=1><c:out value="${aereo.nome}"/></td>
    <td border=1><c:out value="${aereo.numPasseggeri}"/></td>
    <td border=1><a href="elimina-aereo?id=<c:out value="${aereo.id}"/>"><img width="20px" src="https://img.myloview.it/adesivi/red-cross-mark-icon-template-color-editable-symbol-no-or-x-button-for-correct-vote-check-not-approved-error-wrong-and-failed-decision-vector-sign-isolated-on-white-background-700-177725513.jpg"/></a></td>
</tr>
</c:forEach>
</table>
</body>
</html>