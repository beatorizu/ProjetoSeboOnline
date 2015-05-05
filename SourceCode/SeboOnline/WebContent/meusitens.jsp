
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
				Itens Cadastrados

				</div>
				<div role="tabpanel" class="tab-pane" id="cadastraritens">
					<div>
						<label>Tipo de Objeto</label> <select class="form-control">
							<option>Livros, Mangás e HQs</option>
							<option>CDs, DVDs e BLU-RAYs</option>
							<option>Vestuario</option>
							<option>Informática</option>
							<option>Brinquedos e Games</option>
							<option>Móveis</option>
							<option>Outros</option>
						</select>
					</div>
					<div>
						<label>Estado do Objeto</label> <select class="form-control">
							<option>Usado</option>
							<option>Novo</option>
						</select>
					</div>
					<div>
						<label>Forma de Negociaçao</label> </br>
						<input type="checkbox"
							name="venda" value="venda">Venda<br> <input
							type="checkbox" name="troca" value="troca">Troca
					</div>
					<div>
					<label>Titulo do Objeto</label></br> <input type="text" name="titulo"><br>
					</div>
					<div>
					<label>Preço do Objeto </label></br> <input type="text" name="preco"><br>
					</div>
					<div>
					<label>Descrição do Objeto</label></br>
					<textarea rows="4" cols="50"></textarea>
					</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="outros">Pagina em Contrução</div>
			
			</div>
	</div>
</div>

</div>
