<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PdvApplication</title>
</head>
<body>
  <div class="container mt-3">
   <h2>Cadastramento de NCM</h2>
   <form action="/Ncm/incluir" method="post">
     <div class="mb-3 mt-3">
     <label>Descrição:</label>
     <input type="text" class="from-control" placeholder="descrição do NCM" name="descrição">
     </div>
     <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
  </div>
  
</body>
</html>