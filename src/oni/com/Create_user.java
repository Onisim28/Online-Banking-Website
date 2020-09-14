package oni.com;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create_user")

public class Create_user extends HttpServlet {

	DAO dao = new DAO();
	boolean insert = false;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {

			dao.insert_information(name, email, password);
			insert = true;

		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			insert = false;
		}

		if (insert == true) {
			response.sendRedirect("signin.jsp");
		}

	}

	// protected void doPost(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	// doGet(request, response);
	// }

}
