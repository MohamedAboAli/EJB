package ejbServlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Application.ApplicationBusinessFacadeLocal;
import aboali.AboAliRemote;
import model.Book;

/**
 * Servlet implementation class EJBServlet
 */
@WebServlet("/EJBServlet")
public class EJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	ApplicationBusinessFacadeLocal mySessionBean;

	@EJB
	AboAliRemote aboali;
    /**
     * Default constructor. 
     */
    public EJBServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
          int result = mySessionBean.add(2, 3);
          System.out.println("Result: " + result);
          List<Book> books=aboali.getAllBooks();
          response.getWriter().append(" EJB Result: ").append(result+""+"ABOALI");
	for(int i=0;i<books.size();i++) {
        response.getWriter().append("Book id : ").append(books.get(i).getId()+" ,Book Name: "+books.get(i).getName());		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
