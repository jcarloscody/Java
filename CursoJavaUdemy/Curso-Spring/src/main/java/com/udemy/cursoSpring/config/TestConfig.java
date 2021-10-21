package com.udemy.cursoSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemy.cursoSpring.entities.Category;
import com.udemy.cursoSpring.entities.Order;
import com.udemy.cursoSpring.entities.OrderItem;
import com.udemy.cursoSpring.entities.Payment;
import com.udemy.cursoSpring.entities.Product;
import com.udemy.cursoSpring.entities.User;
import com.udemy.cursoSpring.entities.enums.OrderStatus;
import com.udemy.cursoSpring.repositories.CategoryRepository;
import com.udemy.cursoSpring.repositories.OrderRepository;
import com.udemy.cursoSpring.repositories.UserRepository;
import com.udemy.cursoSpring.repositories.*;

/* esta é um classe de configuracao, ou seja, uma classe auxiliar que vai fazer
 * algumas configuracoes na minha aplicacao.
 * 
 * */
@Configuration //indica que é classe de config
@Profile("test") //indica que é para teste
public class TestConfig implements CommandLineRunner{
	//esta implementacao vai servir para executar este script quando o programa for iniciado
	
	/*quando um serviço depende de outro essa dependencia deve ser fraca, deve serr
	 * desaclopada.
	 * */
	//fazendo um obj depender de outro
	@Autowired //essa anotacao vai indicar ao spribng que associe esta instancia ao testconfig
	private UserRepository userRepository;
	//na hora que estiver rodando a aplicacao o spring vai resolver esta dependencia e 
	//associacar esta instancia 
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// tudo que colocar dentro deste metodo será executado quando a aplicacao iniciar
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		//null pq o pk é gerado automaticamente
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED ,u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		
		//para salvar
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
		p1.getCategories().add(cat3);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat2);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat2);
		p5.getCategories().add(cat1);
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
		
		
		Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPayment(pay1);
		orderRepository.save(o1);
		
	}
	
	
	
	

}
