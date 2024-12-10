package DAO;

import java.util.List;

import model.OrderDetail;

public interface OrderDetailDAO {
	
	public interface CostumerDAO {
		void save(OrderDetail orderdetail);
		public List<OrderDetail> show();
		public void delete (String id);
		public void update (OrderDetail orderdetail);
	}
}
