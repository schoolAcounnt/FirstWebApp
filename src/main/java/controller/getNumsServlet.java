package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoinConverter;
import model.multiplyClass;


@WebServlet("/getNumsServlet")
public class getNumsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumberOne = request.getParameter("userNumOne");
		String userNumberTwo = request.getParameter("userNumTwo");
		multiplyClass userProblom = new multiplyClass(Double.parseDouble(userNumberOne),Double.parseDouble(userNumberTwo));
		request.setAttribute("userAnswer", userProblom);
		getServletContext().getRequestDispatcher("/multiplyTotal.jsp").forward(request, response);
	}

}
