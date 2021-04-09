package br.com.zup.editora;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NovoAutor
 */
@WebServlet("/novoAutor")
public class NovoAutor extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		Autores autores = new Autores();
		autores.setNome(nome);
		autores.setEmail(email);
		
		Banco banco = new Banco();
		banco.add(autores);
		
		request.setAttribute("autores", autores.getNome());
		
		response.sendRedirect("listaNovosAutores");
		
	}

}
