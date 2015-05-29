package br.com.item.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.banco.dao.Dao;
import br.com.banco.dao.ItemDaoJpa;
import br.com.sebo.model.Item;


@WebServlet("/excluirItem")
public class ExcluirItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirItemServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idItem = Integer.parseInt(request.getParameter("item"));
		
		Dao itemDao = new ItemDaoJpa();//new MedicamentoDaoJdbc();
		Item item = itemDao.find(idItem);
		
		itemDao.excluir(item);
		
		request.setAttribute("mensagem", String.format(Item.MSG_EXCLUIR, item.getItem_titulo()));
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_SERVLET);
		rd.forward(request, response);
	}

}
