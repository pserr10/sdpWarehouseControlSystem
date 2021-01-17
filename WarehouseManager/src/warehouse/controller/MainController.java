package warehouse.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import warehouse.dao.DeliveryDao;
import warehouse.dao.DepositDao;
import warehouse.dao.ItemDao;
import warehouse.models.Delivery;
import warehouse.models.Deposit;
import warehouse.models.Item;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;;


@RestController
public class MainController {
	
	
	
	@Autowired
	ItemDao<Item> itemRepository;
	
	//register new item
	@RequestMapping(value="/items", method=RequestMethod.POST)
	public int registerItem (Item item) {
		return itemRepository.registerItem(item);
	}
	
	//get Item by id
	@RequestMapping(value="/items/{id}", method=RequestMethod.GET)
	public Item getItem(@PathVariable("id")int id) {
		return itemRepository.get(id);
	}
	
	//get items
	@GetMapping("/items")
	public List<Item> getItems( ) {
		System.out.println("entrou");
		return itemRepository.getAll();
	}
	
	//update Description
	@RequestMapping(value="/items", method=RequestMethod.PUT)
	public int updateDescription(Item item) {
		return itemRepository.updateDescription(item);
	}
	
	//delete items
	@RequestMapping(value="/items/{id}", method=RequestMethod.DELETE)
	public void deleteItem (@PathVariable("id")int id) {
		
		itemRepository.delete((int) id);
	}
	
	@Autowired
	DepositDao<Deposit> depositRepository;
	
	// register deposit
	@RequestMapping(value="/deposits", method=RequestMethod.POST)
	public int depositItems (Deposit deposit) {
		return depositRepository.depositItem(deposit);
	}
	
	//list deposits
	@RequestMapping(value="/deposits", method=RequestMethod.GET)
	public List<Deposit> getDeposits() {
		return depositRepository.listDeposits();
	}
	
	@Autowired
	DeliveryDao<Delivery> deliveryRepository;
	
	//registerDelivery
	@RequestMapping(value="/deliveries", method=RequestMethod.POST)
	public int registerDeliveries (Delivery delivery) {
		
		return deliveryRepository.registerDelivery(delivery);
	}
	
	//update address
	@RequestMapping(value="/deliveries", method=RequestMethod.PUT)
	public int updateAddress (Delivery delivery) {
		return deliveryRepository.updateAddress(delivery);
	}
	//list deliveries
	
	@RequestMapping(value="/deliveries", method=RequestMethod.GET)
	public List<Delivery> getDeliveries(){
		return deliveryRepository.getDeliveries();
	}
	
}
