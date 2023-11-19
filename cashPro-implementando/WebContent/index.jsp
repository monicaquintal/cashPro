<%@ include file="header.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
  <header> <!-- In�cio cabe�alho -->
    <nav class="navbar navbar-expand-md navbar-light bg-barra-superior">
      <div class="container">
        <!-- Logo -->
        <a href="./index.jsp" class="navbar-brand">
          <img src="./resources/images/logo.svg" width="200">
        </a>
        <!-- menu -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-principal" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <!-- barra de navega��o superior -->
        <div class="collapse navbar-collapse" id="nav-principal">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a href="./index.jsp" class="nav-link">Home</a>
            </li>
            <li class="nav-item">
              <a href="#vantagens" class="nav-link">Vantagens</a>
            </li>
            <li class="nav-item">
              <a href="#funcionalidades" class="nav-link">Funcionalidades</a>
            </li>
            <li class="nav-item">
              <a href="#sobre-nos" class="nav-link">Sobre N�s </a>
            </li>
            <li class="nav-item">
              <a href="login.jsp" class="btn btn-outline-light ml-4">Entrar</a>
            </li>
          </ul>
        </div><!-- fim barra de navega��o -->
      </div><!-- fim container -->
    </nav>

    <section id="home"> <!-- In�cio da Se��o Home -->
      <div class="container">
        <div class="row">
          <div class="col-md-6 d-flex"> <!-- in�cio textos da se��o -->
            <div class="align-self-center">
              <h1 class="display-4 mt-1">Transforme suas finan�as com inova��o e simplicidade!</h1>
              <p>
                Revolucione suas finan�as. Solu��es adaptadas �s suas necessidades, seja para economizar ou gerenciar seu dinheiro. Junte-se a n�s e transforme suas finan�as com facilidade e efici�ncia!
              </p>
              <form class="mt-4 mb-4">
                <div class="input-group input-group-sm mb-3">
                  <input type="text" placeholder="Seu e-mail" class="form-control">
                  <div class="input-group-append">
                    <a href="login.jsp">
                    <button type="button" class="btn btn-sm botao" style="height: 100%;">Cadastre-se</button>
                    </a>
                  </div>
                </div>
              </form>
            </div>
          </div> <!-- fim textos da se��o -->
          <div class="col-md-6 d-none d-md-block align-self-md-end">
            <img src="./resources/images/pessoa.png" height="400px">
          </div>
        </div>
      </div>
    </section> <!-- Fim da se��o Home -->
  </header> <!-- Fim cabe�alho -->

  <section class="caixa"> <!-- in�cio se��o Vantagens -->
    <div class="container" id="vantagens">
      <div class="row">
        <div class="col-md-6 d-flex">
          <div class="align-self-center">
            <h2>Saiba para onde vai o seu dinheiro!</h2>
            <p>
              Com o CashPro, voc� identifica, categoriza e monitora suas receitas e despesas.
              <br>
              Com gr�ficos simples, voc� sabe o destino de seu dinheiro.
            </p>
            <a href="" class="btn botao">Veja mais</a>
          </div>
        </div>
        <div class="col-md-6">
          <img src="./resources/images/fintech1.jpg" class="img-fluid imagem">
        </div>
      </div>
    </div>
  </section> <!-- fim se��o Vantagens -->

  <section class="caixa"> <!-- in�cio se��o Funcionalidades -->
    <div class="container" id="funcionalidades">
      <div class="row">
        <div class="col-md-6">
          <img src="./resources/images/fintech2.jpg" class="img-fluid imagem">
        </div>
        <div class="col-md-6 d-flex">
          <div class="align-self-center">
            <h2>E como � poss�vel auxiliar no controle financeiro?</h2>
            <p>Possibilidade de:</p>
            <ul>
              <li>Identificar, cadastrar e excluir receitas e despesas.</li>
              <li>Categorizar os registros.</li>
              <li>Monitorar saldo.</li>
              <li>Acompanhar extrato.</li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section> <!-- fim se��o Funcionalidades -->

  <footer class="mt-4 mb-4" id="sobre-nos"> <!-- in�cio Rodap� -->
    <div class="container">
      <div class="row">
        <div class="text-center"> 
          <a href="https://github.com/monicaquintal" target="_blank"><i class="fa-brands fa-github"></i> M�nica Zungalo Quintal - 2023</a>
        </div> 
      </div>
    </div>
  </footer> <!-- fim Rodap� -->

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<%@ include file="footer.jsp" %>