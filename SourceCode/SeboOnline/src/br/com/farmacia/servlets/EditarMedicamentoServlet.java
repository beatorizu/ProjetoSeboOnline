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

@WebServlet("/editarMedicamento")
public class EditarMedicamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditarMedicamentoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idMedicamento = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String laboratorio = request.getParameter("laboratorio");
	 	int registro = Integer.parseInt(request.getParameter("registro"));
		
	 	MedicamentoDao medDao = new MedicamentoDao();
	 	
		Medicamento medicamento = medDao.find(idMedicamento);
		medicamento.setNome(nome);
		medicamento.setLaboratorio(laboratorio);
		medicamento.setRegistro(registro);
		
		medDao.editar(medicamento);
		
		request.setAttribute("mensagem", String.format(Medicamento.MSG_ATUALIZAR, medicamento.getNome()));
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_SERVLET);
		rd.forward(request, response);
	}

}
