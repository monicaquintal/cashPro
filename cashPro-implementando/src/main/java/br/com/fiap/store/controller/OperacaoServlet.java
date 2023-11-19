package br.com.fiap.store.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.store.bean.Operacao;
import br.com.fiap.store.dao.OperacaoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.factory.DAOFactory;

@WebServlet("/operacao")
public class OperacaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private OperacaoDAO dao;
	private Operacao operacao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getOperacaoDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		switch(acao) {
			case "cadastrar":
				cadastrar(request, response);
				break;
			case "editar":
				editar(request, response);
				break;
			case "excluir":
				excluir(request, response);
				break;
		}
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String tipo = request.getParameter("tipo-operacao");
			String categoria = request.getParameter("categoria-operacao");
			double valor = Double.parseDouble(request.getParameter("valor-operacao"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar data_operacao = Calendar.getInstance();
			data_operacao.setTime(format.parse(request.getParameter("data-operacao")));
			
			Operacao operacao = new Operacao (1, valor, data_operacao, tipo, categoria, 1, 1);
			dao.cadastrar(operacao);
			
			request.setAttribute("msg", "Operação cadastrada!");
		}catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("cadastro-operacao.jsp").forward(request, response);
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id_operacao = Integer.parseInt(request.getParameter("id_operacao"));
			String tipo = request.getParameter("tipo-operacao");
			String categoria = request.getParameter("categoria-operacao");
			double valor = Double.parseDouble(request.getParameter("valor-operacao"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar data_operacao = Calendar.getInstance();
			data_operacao.setTime(format.parse(request.getParameter("data-operacao")));
			/* int id_conta = Integer.parseInt(request.getParameter("id-conta"));
			int id_cliente = Integer.parseInt(request.getParameter("id-cliente")); */

			operacao = new Operacao(id_operacao, valor, data_operacao, tipo, categoria, 1, 1);
			
			dao.atualizar(operacao);

			request.setAttribute("msg", "Operação atualizada!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		listar(request,response);
	}
	
	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id_operacao = Integer.parseInt(request.getParameter("id_operacao"));
		try {
			dao.remover(id_operacao);
			request.setAttribute("msg", "Operação removida!");
		} catch (DBException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar!");
		}
		listar(request,response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "listar":	
			listar(request, response);	
			break;
		case "abrir-form-edicao":
			int id_operacao = Integer.parseInt(request.getParameter("id_operacao"));
			Operacao operacao = dao.buscar(id_operacao);
			request.setAttribute("operacao", operacao);
			request.getRequestDispatcher("edicao-operacao.jsp").forward(request, response);
		}	
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Operacao> lista = dao.listar();
			request.setAttribute("operacao", lista);
			request.getRequestDispatcher("lista-operacao.jsp").forward(request, response);
	}	
}