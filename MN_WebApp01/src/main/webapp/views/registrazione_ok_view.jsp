<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione OK</title>
</head>
<body>
Registrazione Ok per l'utente: <c:out value="${utente}"></c:out>
</br>

Lista Aerei
<table style="border:1">
<!-- TH intestazione 
     TR righe
     TD i campi in orrizontale
-->
<th>Id Aereo</th>
<th>Nome Aereo</th>
<th>Num Passeggeri Aereo</th>
<th>img</th>

<c:forEach var="aereo" items="${listaAerei}">
    <tr style="text-align:center">
    <td> <c:out value="${aereo.id}"/></td>
    <td> <c:out value="${aereo.nome}"/></td>
    <td> <c:out value="${aereo.numPasseggeri}"/></td>
    <td> <img src="<c:out value="${aereo.url_immagine}"/>"/></td>
    <td>
        <c:if test="${aereo.numStelline==1}"><img style="height:20px" src="static/images/1s.jpg"/></c:if>
        <c:if test="${aereo.numStelline==2}"><img style="height:20px" src="static/images/2s.jpg"/></c:if>
        <c:if test="${aereo.numStelline==3}"><img style="height:20px" src="static/images/3s.jpg"/></c:if>
        <c:if test="${aereo.numStelline==4}"><img style="height:20px" src="static/images/4s.jpg"/></c:if>
        <c:if test="${aereo.numStelline==5}"><img style="height:20px" src="static/images/5s.jpg"/></c:if>
    </td>
   </tr>     
   </c:forEach>
</table>

</body>



</html>