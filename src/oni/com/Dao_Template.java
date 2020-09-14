package oni.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao_Template {

	String url = "", username = "", pass = "";

	String query = "SELECT email, pass FROM application.templates WHERE n=? AND pass=?";

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

	public ArrayList<String> getInformation(String na, String ce_Safie) throws SQLException, ClassNotFoundException {

		ArrayList<String> a = new ArrayList<>();

		String ce_afost;

		Class.forName("com.mysql.cj.jdbc.Driver");

		String quer = "SELECT " + ce_Safie + " FROM application.templates where sender = '" + na + "' OR reciever = '"
				+ na + "'";

		Connection connection = DriverManager.getConnection(url, username, pass);

		PreparedStatement statement = connection.prepareStatement(quer);

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			ce_afost = resultSet.getString(ce_Safie);
			a.add(ce_afost);

		}

		statement.close();
		connection.close();

		return a;

	}

	public void insert_information(String sender, float val, String reciever)
			throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, pass);
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO application.templates (sender, val, reciever) VALUES('" + sender + "', '"
						+ val + "', '" + reciever + "')");
		preparedStatement.executeUpdate();

	}

}
