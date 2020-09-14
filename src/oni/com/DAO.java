package oni.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	String url = "", username = "", pass = "";

	String query = "SELECT email, pass FROM application.ones WHERE n=? AND pass=?";

	public boolean login(String name, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, pass);

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, name);
		statement.setString(2, password);

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {

			return true;

		}

		statement.close();
		connection.close();

		return false;

	}

	public String getMoney(String na) throws SQLException, ClassNotFoundException {

		float money;
		String m = "wioq";

		Class.forName("com.mysql.cj.jdbc.Driver");

		String quer = "SELECT * FROM application.ones WHERE n=?";

		Connection connection = DriverManager.getConnection(url, username, pass);

		PreparedStatement statement = connection.prepareStatement(quer);
		statement.setString(1, na);

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {

			m = resultSet.getString("amount");
		}

		statement.close();
		connection.close();

		return m;

	}

	public void insert_information(String name, String email, String passs)
			throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, pass);
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO application.ones (n, email, pass, amount) VALUES('" + name + "', '"
						+ email + "', '" + passs + "', 900)");
		preparedStatement.executeUpdate();

	}

	public void make_transfer(float value, String user, String sender) throws ClassNotFoundException, SQLException {

		String initial_money = getMoney(user);
		String initial_sender_money = getMoney(sender);

		float initialM = Float.parseFloat(initial_money);
		float initialM_sender = Float.parseFloat(initial_sender_money);

		float curent_money = initialM + value;
		float curent_money_sender = initialM_sender - value;

		String curentMo = Float.toString(curent_money);
		String curentMo_sender = Float.toString(curent_money_sender);

		Class.forName("com.mysql.cj.jdbc.Driver");

		String quer = "UPDATE application.ones SET amount=? WHERE n=?";
		String quer_sender = "UPDATE application.ones SET amount=? WHERE n=?";

		Connection connection = DriverManager.getConnection(url, username, pass);

		PreparedStatement statement = connection.prepareStatement(quer),
				statement_sender = connection.prepareStatement(quer_sender);

		statement.setString(1, curentMo);
		statement.setString(2, user);

		statement_sender.setString(1, curentMo_sender);
		statement_sender.setString(2, sender);

		int i = statement.executeUpdate();
		int j = statement_sender.executeUpdate();

		if (i > 0) {

		}

		if (j > 0) {

		}

		statement.close();
		connection.close();

	}

}
