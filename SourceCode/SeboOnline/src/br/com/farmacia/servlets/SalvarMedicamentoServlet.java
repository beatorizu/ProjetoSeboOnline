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

@WebServlet("/salvarMedicamento")
public class SalvarMedicamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalvarMedicamentoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String laboratorio = request.getParameter("laboratorio");
	 	int registro = Integer.parseInt(request.getParameter("registro"));
		
		Medicamento medicamento = new Medicamento();
		medicamento.setNome(nome);
		medicamento.setLaboratorio(laboratorio);
		medicamento.setRegistro(registro);
		
		MedicamentoDao medDao = new MedicamentoDao();
		medDao.salvar(medicamento);
		
		request.setAttribute("mensagem", String.format(Medicamento.MSG_INSERIR, medicamento.getNome()));
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
