<%@ include file="header.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/login.css">
</head>
<body>
  <header>
    <div class="fixed-top d-flex flex-row-reverse p-4 m-2">
      <a href="index.jsp" class="btn btn-lg botao botao-voltar">
        <i class="fa-solid fa-chevron-left"></i>
        <span class="fs-4 texto-voltar"> Voltar</span>
      </a>
    </div>
  </header>

  <main class="container m-5 col-md-6 col-xl-4">
    <h1 class="display-3 mt-3 text-center titulo-principal">Entrar</h1>
    <form action="" id="cadastro" name="cadastro" method="post">
        <div class="row rounded p-3">
            <div class="col-12 col-md-6 my-2 box-input">
              <i class="fa-solid fa-info"></i>
              <label for="login" class="form-label">login</label>
              <input type="text" class="form-control" id="login">
            </div>
            <div class="col-12 col-md-6 my-2 box-input">
              <i class="fa-solid fa-lock"></i>
              <label for="senha" class="form-label">senha</label>
              <input type="password" class="form-control" id="senha">
            </div>
            <div class="col-12 my-2 d-flex justify-content-between">
              <div class="d-flex flex-row-reverse">
                <label for="lembrar">&#160;Lembre de mim</label>
                <input type="radio" name="lembrar" id="lembrar">
              </div>
              <div class="d-flex flex-row-reverse">
                <label for="recuperar">&#160;Esqueci a senha</label>
                <input type="radio" name="recuperar" id="recuperar">
              </div> 
            </div>
          </div>
        </form>
        <div class="d-flex justify-content-center mt-4">
          <a href="principal.jsp">
            <button class="btn btn-md botao">Login</button>
          </a>
        </div>
        <div class="col-12 my-2 mt-3 mb-3 text-center">
          <p>Não possui uma conta? <a href="principal.jsp"><span>Clique aqui!</span></a></p>
          <hr>
          <p>Ou faça login utilizando Redes Sociais:</p>
        </div>
        <div class="d-flex justify-content-center gap-5 col-12 redes">
          <a href="#"><i class="fa-brands fa-google"></i></a>
          <a href="#"><i class="fa-brands fa-facebook"></i></a>
          <a href="#"><i class="fa-brands fa-instagram"></i></a>
        </div>
        <div class="col-12 mt-3 mb-2 text-center logo">
          <img src="./resources/images/logo.svg" alt="Logo">
        </div>

  </main>

  <div class="col-md-6 d-none d-md-block align-self-md-end">
    <img src="./resources/images/pessoa.png" height="500px">
  </div>

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<%@ include file="footer.jsp" %>