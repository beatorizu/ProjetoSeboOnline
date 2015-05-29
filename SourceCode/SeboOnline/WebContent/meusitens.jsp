<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<div class="col-xs-5 col-sm-5 col-md-9" id="content">
	<script>
		$('#myTab a').click(function(e) {
			e.preventDefault()
			$(this).tab('show')
		})
	</script>

	<div class="panel panel-primary" style="margin: 10px;"
		id="div-meusitens-meuperfil">
		<div class="panel-heading">
			<h3 class="panel-title">Meus Itens</h3>
		</div>
		<div class="panel-body">
			<ul class="nav nav-tabs" role="tablist" id="myTab">
				<li role="presentation" class="active"><a href="#meusitens"
					aria-controls="meusitens" role="tab" data-toggle="tab"> Meus
						Itens </a></li>
				<li role="presentation"><a href="#cadastraritens"
					aria-controls="cadastraritens" role="tab" data-toggle="tab">
						Cadastrar Itens </a></li>
				<li role="presentation"><a href="#outros"
					aria-controls="outros" role="tab" data-toggle="tab"> Outros </a></li>
			</ul>

			<div class="tab-content" style="margin: 20px 0px;">
			
			
			
			
				<div role="tabpanel" class="tab-pane active" id="meusitens">
					
					

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
			
								
					
			

				</div>
		
				
				
				
				
				<div role="tabpanel" class="tab-pane" id="cadastraritens">
				
				<form method="post" action="salvarItem">
					<div>
						<label>Titulo do Objeto</label></br> <input type="text" name="titulo"><br>
					</div>
					<div>
						<label>Preço do Objeto </label></br> <input type="text" name="preco"><br>
					</div>
					<div>
						<label>Descrição do Objeto</label></br>
						<textarea name="descricao" rows="4" cols="50"></textarea>
						<br>
						<input type="submit" value="Salvar" /> 
					</div>					
				</form>
				</div>
				<div role="tabpanel" class="tab-pane" id="outros">Pagina em Contrução</div>
			
			</div>
	</div>
</div>

</div>
