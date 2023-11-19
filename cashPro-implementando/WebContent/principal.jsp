<%@ include file="header.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  <link rel="stylesheet" href="./resources/css/style.css">
  <link rel="stylesheet" href="./resources/css/principal.css">
</head>
<body style="background-image: none;">
  
    <div class="fixed-top d-flex flex-row-reverse p-4 m-2">
      <a href="index.jsp" class="btn btn-lg btn-light rounded-circle">
        <i class="fa-solid fa-chevron-left" style="color: var(--neon-pink);"></i>
      </a>
    </div>

  <header style="background-image: none;" class="topo-principal"> <!-- In�cio cabe�alho -->
    <div class="p-3">
      <div class="row">
        <div class="col-md-6 col-lg-4 text-light mb-4"> <!-- in�cio textos da se��o -->
          <div class="d-flex flex-row justify-content-center gap-3">
            <img src="./resources/images/profile.svg" alt="" width="80px">
            <div class="d-flex flex-column mb-2">
              <p class="fs-5 mb-1">Bem vinda,</p>
              <h2> M�nica Quintal</h2>
            </div>
          </div>
          <div class="d-flex flex-row justify-content-center">
            <p>Mar�o <span>Abril </span>Maio</p>
          </div>
        </div>
      </div>
    </div>
  </header>

  <main class="container row mx-auto">

    <aside class="container col-lg-6 mb-3 caixa-esquerda">
      <div class="row rounded col-12 mx-auto">
        <div class="bg-light p-4 rounded-3 shadow-lg">
          <div class="container d-flex justify-content-between align-items-end">
            <div class="d-flex gap-3">
              <img src="./resources/images/line-green.svg" alt="" height="100px">
              <div>
                <p class="fs-4">Saldo atual</p>
                <strong><p class="fs-1">R$ 1.234,56 </p></strong>
              </div>
            </div>
            <div class="text-end">
              <a href="#"><p class="fs-5">Detalhes <i class="fa-solid fa-angle-right"></i></p></a>
            </div>
          </div> 
        </div>
      </div>

      <div class="row col-12 mx-auto mt-2 receitas-despesas">
        <div class="row mx-auto p-1 d-flex justify-content-around gap-4">
          <div class="col rounded-3 bg-light shadow-lg p-2 d-flex align-items-center justify-content-center gap-4">
          <a href="#">
          <i class="fa-solid fa-circle-up" style="color: green"></i>
          <div class="mt-2 text-center d-flex align-items-center justify-content-center">
            <p class="fs-4">Receitas</p>
            <p class="fs-5">R$ 3.000,00</p></a>          
          </div>
        </div>  
        <div class="col rounded-3 bg-light shadow-lg p-2 d-flex align-items-center justify-content-center gap-4">
          <a href="#">
          <i class="fa-solid fa-circle-down" style="color: darkred"></i>
          <div class="mt-2 text-center d-flex align-items-center justify-content-center">
            <p class="fs-4">Despesas</p>
            <p class="fs-5">R$ 1.765,44</p></a>
        </div>
      </div>
      <div class="rounded-3 bg-light shadow-lg p-1 pt-3 d-flex align-items-center justify-content-center gap-4">
        <a href="cadastro-operacao.jsp"><p class="fs-4">Verificar ou incluir transa��es!</p></a>
      </div>
    </aside>

      <aside class="container col-lg-6 mb-5">
        <div class="caixa-direita">
          <div class="my-1 bg-light p-4 rounded-3 shadow-lg">
            <div class="mx-auto d-flex justify-content-between align-items-center">
              <div class="row">
                <h3 class="display-5 fw-bold mb-4">�ltimas transa��es</h3>
                <div class="d-flex align-items-center justify-content-around mb-2">
                  <i class="fa-solid fa-utensils"></i>
                  <div class="">
                    <h3 class="mb-2">Refei��o</h3>
                    <p class="mb-2">Alimenta��o</p>
                    <p>Cr�dito</p>
                  </div>
                  <div class="text-center">
                    <p class="mb-2" style="color: darkred;">R$ 31,90</p>
                    <p class="mb-2">05/04</p>
                    <a href=""><i class="fa-solid fa-angle-right fs-6"></i></a>
                  </div>
                </div>
                <hr>
                <div class="d-flex align-items-center justify-content-around mb-2">
                  <i class="fa-solid fa-bus"></i>
                  <div class="">
                    <h3 class="mb-2">Bilhete</h3>
                    <p class="mb-2">Transporte</p>
                    <p>Cr�dito</p>
                  </div>
                  <div class="text-center">
                    <p class="mb-2" style="color: darkred;">R$ 80,00</p>
                    <p class="mb-2">05/04</p>
                    <a href=""><i class="fa-solid fa-angle-right fs-6"></i></a>
                  </div>
                </div>
                <hr>
                <div class="d-flex align-items-center justify-content-around mb-2">
                  <i class="fa-solid fa-money-bill"></i>
                  <div class="">
                    <h3 class="mb-2">Sal�rio</h3>
                    <p class="mb-2">Sal�rio</p>
                    <p>D�bito</p>
                  </div>
                  <div class="text-center">
                    <p class="mb-2" style="color: green;">R$ 3.000,00</p>
                    <p class="mb-2">01/04</p>
                    <a href=""><i class="fa-solid fa-angle-right fs-6"></i></a>
                  </div>
                </div>
              </div>
            </div> 
          </div>
        </div>
      </aside>
  </main>

  <footer class="text-center"> 
    <div class="pb-5">
      <a href="https://github.com/monicaquintal" target="_blank"><i class="bi bi-github"></i> M�nica Zungalo Quintal - 2023</a>
    </div>
  </footer>

</body>
</html>