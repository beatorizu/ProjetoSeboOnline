<%@ include file="base.jsp"%>
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
                <div class="col-md-4">
                    <select class="form-control">
                        <option> Livros, Mangás e HQs</option>
                        <option> CDs, DVDs e BLU-RAYs </option>
                        <option> Vestuario </option>
                        <option> Informática </option>
                        <option> Brinquedos e Games </option>
                        <option> Móveis </option>
                        <option> Outros </option>
                    </select>
                </div>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="inTituloProduto" placeholder="Título do produto">
                </div>
                <div class="col-md-2">
                    <button type="submit" class="btn btn-danger"> Buscar </button>
                </div>
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


