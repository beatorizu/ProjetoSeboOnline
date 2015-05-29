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


@WebServlet("/preparaEditarItem")
public class PreparaEditarItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PreparaEditarItemServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idItem = Integer.parseInt(request.getParameter("item"));
		
		Dao medDao = new ItemDaoJpa();//new MedicamentoDaoJdbc();
		Item item = medDao.find(idItem);
		
		request.setAttribute("item", item);
		
		RequestDispatcher rd = request.getRequestDispatcher("perfil.jsp");
		rd.forward(request, response);
	}

}
