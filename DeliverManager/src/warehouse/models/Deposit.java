package warehouse.models;

public class Deposit  {
	
	private Integer deposit_id;
	private Item item_id;
	private Integer quantity;
	
	
	
	public Deposit(Integer deposit_id, Item item_id, Integer quantity) {
		this.deposit_id = deposit_id;
		this.item_id = item_id;
		this.quantity = quantity;
	}
	
	
	public int getDeposit_id() {
		return deposit_id;
	}
	public void setDeposit_id(int deposit_id) {
		this.deposit_id = deposit_id;
	}
	public Item getItem_id() {
		return item_id;
	}
	public void setItem_id(Item item_id) {
		this.item_id = item_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
