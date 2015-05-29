package br.com.item.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.banco.dao.Dao;
import br.com.banco.dao.ItemDaoJpa;
import br.com.sebo.model.Item;

@WebServlet("/consultarItens")
public class ConsultarItensServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarItensServlet() {
        super();
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String nome = request.getParameter("nomeConsulta");
    	
    	Dao itemDao = new ItemDaoJpa();//new MedicamentoDaoJdbc();
    	List<Item> listaItens = itemDao.pesquisar(nome);
    	
		request.setAttribute("listaItens", listaItens);
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_JSP);
		rd.forward(request, response);
    }

}
