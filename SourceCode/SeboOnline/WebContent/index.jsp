<%@ include file="base.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="container text-center">
        <div class="row">
            <div class="col-md-12">
                <h1>Sebo Online </h1>
                <h4>O seu site de trocas</h4>
            </div>
        </div>

        <div class="linha"></div>

        <div id = "buscar-por" class="container text-center">
            <div class="row">
                <div class="col-md-2">
                    <p> Buscar por: </p>
                </div>
        <form method="post" action="consultarItens">
		<span>Titulo</span> <input type="text" name="nomeConsulta" /> 
		<input type="submit" value="Pesquisar" />
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
				<td><b>Preco</b></td>
				<td><b>Descricao</b></td>
			</tr>
			<c:forEach var="item" items="${listaItens}">
				<tr>
					<td>${item.item_id}</td>
					<td>${item.item_titulo}</td>
					<td>${item.item_preco}</td>
					<td>${item.item_descricao}</td>
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



	<br />

	<a href="index.jsp">Voltar</a>
	
	
	
            </div>
        </div>

        <div class="linha"></div>

        <div id="anunciosRecentes">
            <div class="pull-left">
                <h4> Anúncios recentes: </h4>
            </div>
            <br/>
            <div id="anuncios" style="margin-top: 40px;">
                <div class="row">
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/HPTalismasdaMorte.jpg">
                            <h4> Harry Potter e os Talismãs da Morte </h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/OcachorroEnlameado.jpg">
                            <h4> O Cachorro Enlameado </h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/planeta.jpg">
                            <h4> Cuidando da vida no planeta </h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/manga.jpg">
                            <h4> O grande livro dos Mangás</h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/sonic_pelucia.jpg">
                            <h4> Pelucia Sonic </h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="well">
                            <img class="img-rounded tam-img" src="static/img/eletronica.jpg">
                            <h4> Livro Curso completo de Eletrônica </h4>
                            <p><a href="https://pagseguro.uol.com.br/#rmcl" class="btn btn-danger"> <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar</a></p>
                        </div>
                    </div>
                </div> <!-- .row -->
            </div> <!-- id="anuncios" -->
        </div> <!-- id="anunciosRecentes" -->

        <div class="linha"></div>
    </div> <!-- class="container text-center" -->


