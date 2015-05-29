package br.com.item.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.banco.dao.Dao;
import br.com.banco.dao.ItemDaoJpa;
import br.com.sebo.model.Item;


public class ServletsUtil {
	public static final String CONSULTA_JSP = "perfil.jsp";
	public static final String CONSULTA_SERVLET = "consultarItens";

	public static void saveOrUpdateItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idItem = 0;
		if (request.getParameter("idItem") != null) {
			idItem = Integer.parseInt(request.getParameter("idItem"));
		}
		 
		 double item_preco =  Double.parseDouble(request.getParameter("preco"));		 
		 String item_titulo = request.getParameter("titulo");		 
		 String item_descricao = request.getParameter("descricao");
		
		Dao itemDao = new ItemDaoJpa();//new MedicamentoDaoJdbc();
		Item item = null;

		if (idItem != 0) {
			item = itemDao.find(idItem);
		} else {
			item = new Item();
		}
		
		item.setItem_preco(item_preco);		
		item.setItem_titulo(item_titulo);
		item.setItem_descricao(item_descricao);
	
		RequestDispatcher rd;
		String mensagem = "";
		String redirecionamento = "";
		if (idItem != 0) {
			itemDao.editar(item);
			mensagem = String.format(Item.MSG_ATUALIZAR, item.getItem_titulo());
			redirecionamento = ServletsUtil.CONSULTA_SERVLET;
		} else {
			itemDao.salvar(item);
			 mensagem = String.format(Item.MSG_INSERIR, item.getItem_titulo());
			 redirecionamento = "perfil.jsp";
		}
		request.setAttribute("mensagem", mensagem);
		rd = request.getRequestDispatcher(redirecionamento);
		rd.forward(request, response);
	}

}





