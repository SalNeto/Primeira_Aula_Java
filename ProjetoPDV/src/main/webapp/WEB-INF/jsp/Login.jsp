<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppPDV</title>
</head>	

<body>
<div class="container mt-3">
  <h2>Autenticação</h2> 
  
  
  <c:if test="${not empty mensagem}">
      	    <div class="alert alert-danger">
	      <strong>Atenção Problema!</strong> ${mensagem}
  </div>
  </c:if>
  <form action="/login" method="post">
  
    <div class="mb-3 mt-3">
      <label>Email:</label>
      <input type="email" class="form-control"  placeholder="Informe email" name="email">
    </div>
    
    <div class="mb-3">
      <label>Password:</label>
      <input type="password" class="form-control" placeholder="Informe senha" name="pswd">
    </div>
    
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    
    <button type="submit" class="btn btn-primary">Acessar</button>
  </form>
</div>

</body>
</html>