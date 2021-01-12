package warehouse.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import warehouse.models.Deposit;


public abstract class DepositDao implements Dao<Deposit> {

	private JdbcTemplate jdbcTemplate;

	public DepositDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public int depositItem(Deposit d) { // if item_id 
		String sql = "UPDATE\r\n"
				+ "    deposits\r\n"
				+ "INSERT INTO\r\n"
				+ "   deposits(quantity)\" + \"VALUES( ?,)\"\r\n"
				+ "FROM\r\n"
				+ "    Items i\r\n"
				+ "INNER JOIN\r\n"
				+ "    Deposits d\r\n"
				+ "WHERE\r\n"
				+ "    i.item_id = d.item_id;";
		
		return jdbcTemplate.update(sql, d.getItem_id(), d.getQuantity()) ;
	};
	
	@Override
    public List <Deposit> depositItems(){
		return null;
    	
    };

}

	

