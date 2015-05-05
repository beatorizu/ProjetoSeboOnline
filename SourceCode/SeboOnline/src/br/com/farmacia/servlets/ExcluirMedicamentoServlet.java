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

@WebServlet("/excluirMedicamento")
public class ExcluirMedicamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirMedicamentoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idMedicamento = Integer.parseInt(request.getParameter("medicamento"));
		
		MedicamentoDao medDao = new MedicamentoDao();
		Medicamento medicamento = medDao.find(idMedicamento);
		
		medDao.excluir(medicamento);
		
		request.setAttribute("mensagem", String.format(Medicamento.MSG_EXCLUIR, medicamento.getNome()));
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_SERVLET);
		rd.forward(request, response);
	}

}
