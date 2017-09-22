package da2.jgao.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da2.jgao.u1.Process;

/**
 * Servlet implementation class UseServlet
 */
@WebServlet("/UseServlet")
public class UseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double number1 = Double.parseDouble(request.getParameter("number1"));
		double number2 = Double.parseDouble(request.getParameter("number2"));
		
		
		
		
		Process process = new Process();
		process.setNumber1(number1);
		process.setNumber2(number2);
		//operation.getResult();
		request.setAttribute("pro", process);
		RequestDispatcher dispatcher = request.getRequestDispatcher("solution.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
