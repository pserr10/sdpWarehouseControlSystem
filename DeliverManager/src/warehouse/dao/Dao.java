package warehouse.dao;
import java.util.*;

import warehouse.models.Delivery;
import warehouse.models.Deposit;
import warehouse.models.Item;



public interface Dao<T> {
    
	//items methods
	public int registerItem(Item item);
	public int updateDescription(Item item);
	public Item get(Integer id);
    public int delete(Integer id);
    public List<Item> getAll();
    
    //deposits methods
    
    public int depositItem(Deposit deposit);
    public List <Deposit> depositItems();
    
    
    //deliveries methods
    
    public int registerDelivery(Delivery delivery);
    public int updateDeliveryAddress (Delivery delivery);
    public List <Delivery> getDeliveries();
}
    
    
    
    