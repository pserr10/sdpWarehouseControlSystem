package warehouse.models;

public class Delivery{
	
	private Integer delivery_id;
	private String delivery_address;
	private Item item_id;
	
	
	public Delivery(Integer delivery_id, String delivery_address) {
		this.delivery_id = delivery_id;
		this.delivery_address = delivery_address;
	}
	
	
	public Integer getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public Item getItem_id() {
		return item_id;
	}
	public void setItem_id(Item item_id) {
		this.item_id = item_id;
	}
	
}
