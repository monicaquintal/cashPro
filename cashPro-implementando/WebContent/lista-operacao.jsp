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
		<h3 class="m-3 p-2 text-center" style="color: #94056e;">Operações</h3>
		
		<c:if test="${not empty msg }">
			<div class="alert alert-success">${msg}</div>
		</c:if>
		<c:if test="${not empty erro }">
			<div class="alert alert-danger">${erro}</div>
		</c:if>
		
		<table class="table table-striped">
			<tr>
				<th>Valor</th>
				<th>Data</th>
				<th>Tipo</th>
				<th>Categoria</th>
				<th></th>
			</tr>
			<c:forEach items="${operacao}" var="o">
				<tr>
					<td><fmt:formatDate value="${o.data.time }" pattern="dd/MM/yyyy"/></td>
					<td>${o.valor}</td>
					<td>${o.tipo}</td>
					<td>${o.categoria}</td>
					<td>
						<c:url value="operacao" var="link">
							<c:param name="acao" value="abrir-form-edicao"/>
							<c:param name="id_operacao" value="${o.IDOperacao }"/>
						</c:url>
						<a href="${link}"><button type="button" class="btn btn-success btn-xs" style="width: 100px; margin-right: 20px;">Editar</button></a>
						<button type="button" style="width: 100px;" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#excluirModal" onclick="codigoExcluir.value = ${o.IDOperacao}">Excluir</button>
					</td>	
				</tr>
			</c:forEach>
		</table>
	</div>	
 

  <footer class="text-center"> 
    <div class="pb-5">
      <a href="https://github.com/monicaquintal" target="_blank"><i class="bi bi-github"></i> Mônica Zungalo Quintal - 2023</a>
    </div>
  </footer>

<!-- Modal -->
<div class="modal fade" id="excluirModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        		Deseja realmente excluir a operação?
      </div>
      <div class="modal-footer">
      	<form action="operacao" method="post">
      		<input type="hidden" name="acao" value="excluir">
      		<input type="hidden" name="id_operacao" id="codigoExcluir">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
	        <button type="submit" class="btn btn-danger">Excluir</button>
        </form>
      </div>
    </div>
  </div>
</div>
  
</body>
</html>