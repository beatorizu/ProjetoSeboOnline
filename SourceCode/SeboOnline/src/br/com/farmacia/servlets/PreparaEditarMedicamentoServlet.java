package br.com.farmacia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.farmacia.dao.MedicamentoDao;
import br.com.farmacia.model.Medicamento;

@WebServlet("/preparaEditarMedicamento")
public class PreparaEditarMedicamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PreparaEditarMedicamentoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idMedicamento = Integer.parseInt(request.getParameter("medicamento"));
		
		MedicamentoDao medDao = new MedicamentoDao();
		Medicamento medicamento = medDao.find(idMedicamento);
		
		request.setAttribute("medicamento", medicamento);
		
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

}
