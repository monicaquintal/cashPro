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
  
<div class="container">
	<h3 class="m-3 p-2 text-center" style="color: #94056e;">Edição de Operação</h3>
	<form action="operacao" method="post">
		<input type="hidden" value="editar" name="acao">
		<input type="hidden" value="${operacao.IDOperacao}" name="id_operacao">
		
		<div class="form-group">
          <label for="tipo-operacao">Tipo de operação: </label>
          <input type="text" name="tipo-operacao" id="tipo-operacao" class="form-control" value="${operacao.tipo}">
        </div>
        
        <div class="form-group">
          <label for="categoria-operacao">Categoria: </label>
          <input type="text" name="categoria-operacao" id="categoria-operacao" class="form-control" value="${operacao.categoria}">
        </div>
		
		<div class="form-group">
			<label for="valor-operacao">Valor</label>
			<input type="text" name="valor-operacao" id="valor-operacao" class="form-control" value="${operacao.valor}">
		</div>
		
		<div class="form-group">
			<label for="data-operacao">Data</label>
			<input type="text" name="data-operacao" id="data-operacao" class="form-control" 
				value='<fmt:formatDate value="${operacao.data.time }" pattern="dd/MM/yyyy"/>'>
		</div>
		<div class="mt-3 d-flex gap-3 justify-content-center">
			<input type="submit" value="Salvar" class="btn btn-primary" style="width: 200px;">
			<a href="operacao?acao=listar" class="btn btn-danger" style="width: 200px;">Cancelar</a>
		</div>
	</form>
</div>

</body>
</html>