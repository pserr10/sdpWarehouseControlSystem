package warehouse.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import warehouse.models.Delivery;

public interface DeliveryDao<T> {
	
	@Autowired(required = true)
	public int registerDelivery(Delivery delivery);
	public int updateAddress(Delivery delivery);
	public List<T> getDeliveries();
	
	
}
