<%@ include file="../base.jsp"%>

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

.panel-primary { /* está sendo usado dentro dos includes da página */
	border-color: #ddd;
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
				</div>
			</div>
		</div>
	</center>
