<%@ include file="header.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/principal.css">
</head>
<body>

</head>
<body style="background-image: none;">
  
    <div class="fixed-top d-flex flex-row-reverse p-4 m-2">
      <a href="principal.jsp" class="btn btn-lg btn-light rounded-circle">
        <i class="fa-solid fa-chevron-left" style="color: var(--neon-pink);"></i>
      </a>
    </div>

  <header style="background-image: none;" class="topo-principal"> <!-- Início cabeçalho -->
    <div class="p-3">
      <div class="row">
        <div class="col-md-6 col-lg-4 text-light mb-4"> <!-- início textos da seção -->
          <div class="d-flex flex-row justify-content-center gap-3">
            <img src="./resources/images/profile.svg" alt="" width="80px">
            <div class="d-flex flex-column mb-2">
              <p class="fs-5 mb-1">Bem vinda,</p>
              <h2> Mônica Quintal</h2>
            </div>
          </div>
          <div class="d-flex flex-row justify-content-center">
            <p>Março <span>Abril </span>Maio</p>
          </div>
        </div>
      </div>
    </div>
  </header>

  <main class="container row mx-auto">

    <div class="container m-3 p-4" style="border: 1px solid #000; border-radius: 12px;">
      <h3 class="text-center" style="color: #94056e;">Incluir transação</h3>
      <form action="operacao" method="post">
      	<input type="hidden" value="cadastrar" name="acao">
        <div class="form-group">
          <label for="tipo-operacao">Tipo de operação: </label>
          <input type="text" name="tipo-operacao" id="tipo-operacao" class="form-control">
        </div>
        <div class="form-group">
          <label for="categoria-operacao">Categoria: </label>
          <input type="text" name="categoria-operacao" id="categoria-operacao" class="form-control">
        </div>
        <div class="form-group">
          <label for="valor-operacao">Valor: </label>
          <input type="text" name="valor-operacao" id="valor-operacao" class="form-control">
        </div>
        <div class="form-group">
          <label for="data-operacao">Data: </label>
          <input type="text" name="data-operacao" id="data-operacao" class="form-control">
        </div>
        <div class="d-flex justify-content-end">
          <input type="submit" value="Salvar" class="btn btn-success btn-lg m-3 p-2" style="width: 200px;">
        </div>
      </form>
      
      <c:if test="${ not empty msg }">
		<div class="alert alert-success">${msg}</div>
	  </c:if>
	  <c:if test="${ not empty erro }">
		<div class="alert alert-danger">${erro}</div>
	  </c:if>
    </div>
    
    <div class="d-flex justify-content-center mt-4">
	      <a href="operacao?acao=listar">
	        <button class="btn btn-md botao btn-lg">Verificar Operações</button>
	      </a>
    </div>
  </main>

  <footer class="text-center"> 
    <div class="pb-5">
      <a href="https://github.com/monicaquintal" target="_blank"><i class="bi bi-github"></i> Mônica Zungalo Quintal - 2023</a>
    </div>
  </footer>
  
</body>
</html>