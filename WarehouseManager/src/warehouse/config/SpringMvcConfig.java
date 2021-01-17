package warehouse.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import warehouse.dao.DeliveryDao;
import warehouse.dao.DeliveryDaoImpl;
import warehouse.dao.DepositDao;
import warehouse.dao.DepositDaoImpl;
import warehouse.dao.ItemDao;
import warehouse.dao.ItemDaoImpl;
import warehouse.models.Delivery;
import warehouse.models.Deposit;
import warehouse.models.Item;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "warehouse")
public class SpringMvcConfig  implements WebMvcConfigurer{
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/warehouse?&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("raszx452");
		
		return dataSource;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	@Bean
	public ItemDao<Item> getItemDao() {
		return new ItemDaoImpl(getDataSource());
	}
	
	@Bean
	public DepositDao<Deposit> getDepositDao() {
		return new DepositDaoImpl(getDataSource());
	}
	
	@Bean
	public DeliveryDao<Delivery> getDeliveryDao() {
		return new DeliveryDaoImpl(getDataSource());
	}

}
