package DAO;

import java.sql.Connection;

import confg.Database;

public class OrderDetailRepo implements OrderDetailDAO{
	private Connection connection;
	final String insert = "INSERT INTO orderdetail (jenis_service, status_service, harga_service) VALUES (?,?,?);";
	final String select = "SELECT * FROM orderdetail;" ;
	final String delete = "DELETE FROM orderdetail WHERE id_service = ?;";
	final String update = "UPDATE orderdetail SET jenis_service = ?, status_service = ?, harga_service = ? WHERE id_service = ?;";
	
	public OrderDetailRepo() {
		connection = Database.koneksi();
	}
}