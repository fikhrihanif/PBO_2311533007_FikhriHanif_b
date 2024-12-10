package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import confg.Database;
import model.Service;


public class ServiceRepo implements ServiceDAO{
	private Connection connection;
	final String insert = "INSERT INTO service (jenis_service, status_service, harga_service) VALUES (?,?,?);";
	final String select = "SELECT * FROM service;" ;
	final String delete = "DELETE FROM service WHERE id_service = ?;";
	final String update = "UPDATE service SET jenis_service = ?, status_service = ?, harga_service = ? WHERE id_service = ?;";
	
	public ServiceRepo() {
		connection = Database.koneksi();
		}

	@Override
	public void save(Service service) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString(1, service.getJenis_service());
			st.setString(2, service.getStatus_service());
			st.setInt(3, service.getHarga_service());
			st.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public List<Service> show() {
		// TODO Auto-generated method stub
		List<Service> ls = null;
		try {
			ls = new ArrayList<Service>();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				Service service = new Service();
				service.setId_service(rs.getString("id_service"));
				service.setJenis_service(rs.getString("jenis_service"));
				service.setStatus_service(rs.getString("status_service"));
				service.setHarga_service(rs.getInt("harga_service"));
				ls.add(service);
			}
		}catch(SQLException e) {
			Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, e);
		}
		return ls;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(delete);
			st.setString(1, id);
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Service service) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(update);
			st.setString(1, service.getJenis_service());
			st.setString(2, service.getStatus_service());
			st.setInt(3, service.getHarga_service());
			st.setString(4, service.getId_service());
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
}
