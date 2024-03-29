<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso Java WEB Treinar</title>

<style type="text/css">

/* CSS Document */ 

.offscreen { 
  position: absolute; 
  top: -30em; 
  left: -300em; 
} 

div#hmenu { 
   margin: 0; 
   padding: .3em 0 .3em 0; 
   background: #ddeebb; 
   width: 100%; 
   text-align: center; 
} 

div#hmenu ul { 
   list-style: none; 
   margin: 0; 
   padding: 0; 
} 

div#hmenu ul li { 
   margin: 0; 
   padding: 0; 
   display: inline; 
} 

div#hmenu ul a:link{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #004415; 
} 

div#hmenu ul a:visited{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #227755; 
} 

div#hmenu ul a:active{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #227755; 
} 

div#hmenu ul a:hover{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #f6f0cc; 
   background-color: #227755; 
}

</style>

</head>
<body>
	<h1>Curso Java WEB Treinar</h1>
	<h1>${mensagem}</h1>
	<!--h1>< %= request.getAttribute("mensagem")%></h1-->
	
	<div id="hmenu">
		<ul>
			<li><a href="/agenda/pages/listaContato.controle?comando=ListaContato">Listar Contato</a></li>
			<li><a href="/agenda/pages/cadastroContato.jsp">Cadastrar Contato</a></li>
		</ul>
	</div>

</body>
</html>