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
import model.Costumer;
import model.CostumerBuilder;


public class CostumerRepo implements CostumerDAO{
	private Connection connection;
	final String insert = "INSERT INTO costumer (nama, alamat, nohp) VALUES (?,?,?);";
	final String select = "SELECT * FROM costumer;" ;
	final String delete = "DELETE FROM costumer WHERE id = ?;";
	final String update = "UPDATE costumer SET nama=?, alamat=?, nohp=? WHERE id=?;";
	
	public CostumerRepo() {
		connection = Database.koneksi();
		}

	@Override
	public void save(Costumer costumer) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString(1, costumer.getNama_costumer());
			st.setString(2, costumer.getAlamat_costumer());
			st.setString(3, costumer.getNohp_costumer());
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
	public List<Costumer> show() {
		// TODO Auto-generated method stub
		List<Costumer> ls = null;
		try {
			ls = new ArrayList<Costumer>();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				Costumer cs = new CostumerBuilder()
						.setId(rs.getString("id"))
						.setNama(rs.getString("nama"))
						.setAlamat(rs.getString("alamat"))
						.setNohp(rs.getString("nohp"))
						.build();
				
				/*Costumer costumer = new Costumer();
				costumer.setId_costumer(rs.getString("id"));
				costumer.setNama_costumer(rs.getString("nama_costumer"));
				costumer.setAlamat_costumer(rs.getString("alamat_costumer"));
				costumer.setNohp_costumer(rs.getString("nohp_costumer"));*/
				ls.add(cs);
			}
		}catch(SQLException e) {
			Logger.getLogger(CostumerDAO.class.getName()).log(Level.SEVERE, null, e);
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
	public void update(Costumer costumer) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(update);
			st.setString(1, costumer.getNama_costumer());
			st.setString(2, costumer.getAlamat_costumer());
			st.setString(3, costumer.getNohp_costumer());
			st.setString(4, costumer.getId_costumer());
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
	
	

