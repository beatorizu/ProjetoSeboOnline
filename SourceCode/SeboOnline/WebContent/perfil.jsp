<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ include file="base.jsp"%>

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#menu a").click(function(e) {
			e.preventDefault();
			var href = $(this).attr('href');
			$("#content").load(href + " #content");
		});
	});
</script>


<style>
#div-menu-meuperfil {
	max-width: 230px;
}

#div-container-meuperfil {
	max-width: 740px;
}

.row {
	max-width: 1000px;
}

label {
	font-weight: 900;
}

.panel-primary {
 border-color: #CA4C42;
 
}
 .panel-primary>.panel-heading {
  color: #fff;
  background-color: #CA4C42;
}
a.list-group-item.active, a.list-group-item.active:hover, a.list-group-item.active:focus {
  z-index: 2;
  color: #fff;
  background-color: #CA4C42;
  border-color: #CA4C42;
  }
</style>
<center>
		<div>
			<div class="container-fluid">
				<div class="row">
					<div class="col-xs-5 col-sm-5 col-md-3" id="div-menu-meuperfil">
						<div class="list-group" style="text-align: left; margin: 10px;">
							<center>
								<div class="media-middle">
									<a href="perfil.jsp" class="list-group-item"> <img
										data-src="holder.js/80%x150" alt="80%x50%"
										src="static/img/cebola.jpg" data-holder-rendered="true"
										style="width: 80%; height: 50%; display: block;">
									</a>
								</div>
								<a href="perfil.jsp" class="list-group-item active"> Cebola
								</a>
								<ul id="menu">
									<a href="editarmeuperfil.jsp" class="list-group-item"
										style="margin-left: -40px"> Editar meu Perfil </a>
									<a href="meusitens.jsp" class="list-group-item"
										style="margin-left: -40px"> Meus Itens </a>
									<a href="minhastrocas.jsp" class="list-group-item"
										style="margin-left: -40px"> Minhas Trocas </a>
									<a href="minhasdoacoes.jsp" class="list-group-item"
										style="margin-left: -40px"> Minhas Doações </a>
										</ul>
						</div>
					</div>
					<div class="col-xs-5 col-sm-5 col-md-9" id="content">
						<%@ include file="minhastrocas.jsp"%>
						<%@ include file="minhasdoacoes.jsp"%>
	
					</div>
					
					
					
					
					
					
					
									<form method="post" action="consultarItens">
					<span>Nome</span> <input type="text" name="nomeConsulta" /> <input
						type="submit" value="Pesquisar" />
				</form>
			
				<br />
				<br />
			
				<div style="color: green">${mensagem}</div>
			
				<br />
			
				<c:if test="${not empty listaItens}">
					<br />
					Resultados encontrado(s): <b>${fn:length(listaItens)}</b>
					<br />
					<br />
			
					<table>
						<tr>
							<td><b>Id</b></td>
							<td><b>Titulo</b></td>
							<td><b>Descricao</b></td>
							<td><b>Preco</b></td>
						</tr>
						<c:forEach var="item" items="${listaItens}">
							<tr>
								<td>${item.item_id}</td>
								<td>${item.item_titulo}</td>
								<td>${item.item_descricao}</td>
								<td>${item.item_preco}</td>
								<td>
									<form method="post" action="preparaEditarItem">
										<input type="submit" value="Editar" /> <input type="hidden"
											value="${item.item_id}" name="item" />
									</form>
			
									<form method="post" action="excluirItem">
										<input type="submit" value="Excluir" /> 
										<input type="hidden"
											value="${item.item_id}" name="item" />
									</form>
								</td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
					
					
					
					
					
					
					
					
					
						<h1>Editar Item</h1>

	<form method="post" action="editarItem">
		<table>
			<tr>
				<td><span>Titulo</span></td>
				<td><input type="text" name="titulo" value="${item.item_titulo}"/></td>
			</tr>
			<tr>
				<td><span>Descricao</span></td>
				<td><input type="text" name="descricao" value="${item.item_descricao}"/></td>
			</tr>
			<tr>
				<td><span>Preco</span></td>
				<td><input type="text" name="preco" value="${item.item_preco}"/></td>
			</tr>
		</table>
		<input type="hidden" name="idItem" value="${item.item_id}"/>
		<input type="submit" value="Salvar" />
	</form>
					
					
					
					
					
					
				</div>
			</div>
		</div>
	</center>
