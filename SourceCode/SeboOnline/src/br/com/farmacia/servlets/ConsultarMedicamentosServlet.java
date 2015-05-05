package br.com.farmacia.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.farmacia.dao.MedicamentoDao;
import br.com.farmacia.model.Medicamento;

@WebServlet("/consultarMedicamentos")
public class ConsultarMedicamentosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarMedicamentosServlet() {
        super();
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String nome = request.getParameter("nomeConsulta");
    	
    	MedicamentoDao medDao = new MedicamentoDao();
    	List<Medicamento> listaMedicamentos = medDao.pesquisar(nome);
    	
		request.setAttribute("listaMedicamentos", listaMedicamentos);
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_JSP);
		rd.forward(request, response);
    }

}
