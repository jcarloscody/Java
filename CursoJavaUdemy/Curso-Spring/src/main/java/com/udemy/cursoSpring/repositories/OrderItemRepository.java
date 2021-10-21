package com.udemy.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursoSpring.entities.Order;
import com.udemy.cursoSpring.entities.OrderItem;



/*UserRepository tem que ser uma interface pq o JpaRepository é interface
 * essa interface será a responsavel por fazer operacoes com a entidade User*/
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	/*<tipo da entidade, tipo do id>
	 * precisa criar a implementacao da interface? neste caso nao, pq o spring
	 * do JPA ja tem uma implementacao padrao para essa interface. só precisa dessa definicao
	 */
	 


}
