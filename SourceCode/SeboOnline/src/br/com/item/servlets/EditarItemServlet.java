package br.com.item.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editarItem")
public class EditarItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditarItemServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletsUtil.saveOrUpdateItem(request, response);
	}

}
