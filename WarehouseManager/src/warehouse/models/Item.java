package warehouse.models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer item_id;
	private String typeName;
	private String description;
	
	
	public Item( Integer item_id, String typeName, String description) {
		this(typeName, description);
		this.item_id = item_id;

	}
	
	public Item(String typeName, String description) {
		this.description = description;
		this.typeName = typeName;
	}

	public Item(int item_id, String description) {
		this.item_id = item_id;
		this.description = description;
	}


	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", typeName=" + typeName + ", description=" + description + "]";
	}	
	
	
}
