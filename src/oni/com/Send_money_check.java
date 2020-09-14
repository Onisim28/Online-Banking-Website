package oni.com;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/send_money_check")
public class Send_money_check extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean goOn = false;

		DAO dao = new DAO();
		Dao_Template dao_Template = new Dao_Template();

		HttpSession session = request.getSession();

		String n = request.getParameter("user");
		String p = request.getParameter("pass");

		String sender = session.getAttribute("name").toString();
		float value = Float.parseFloat(request.getParameter("val"));

		try {
			if (dao.login(n, p)) {
				goOn = true;

			}

			else {
				goOn = false;
				response.sendRedirect("transfer_money.jsp");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		if (goOn) {

			try {

				dao.make_transfer(value, n, sender);

				dao_Template.insert_information(sender, value, n);

				response.sendRedirect("welcome.jsp");

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
