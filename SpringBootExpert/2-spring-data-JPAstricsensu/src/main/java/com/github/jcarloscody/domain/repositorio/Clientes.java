package com.github.jcarloscody.domain.repositorio;

import com.github.jcarloscody.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class Clientes {

    @Autowired
    private EntityManager entityManager; //a interface entitymanager vai fazer toda as operacoes da base com aas entidades. temos as entidades mapeadas, e em cima disso faz as operacoes.

    @Transactional  //precisamos anotar os metodos com isto, ele precisa de uma transacao para fazer as operacoes
    public Cliente salvar(Cliente cliente){//aqui tratamos com objeto transiente:
        entityManager.persist(cliente);//aqui, quando persistimos o objeto entra no estado manager(gerenciado): fica lá no cache
        return cliente;
    }

    @Transactional
    public Cliente atualizar (Cliente cliente){
        entityManager.merge(cliente);//aqui deve passar um objeto no estado manager, gerenciado pelo entityManager, entao antes de passar deve fazer uma busca antes
        return cliente;
    }

    @Transactional
    public void deletar (Cliente cliente){
        //Cliente cliente1=entityManager.find(Cliente.class, cliente.getId()); //
        if (!entityManager.contains(cliente)){
            entityManager.merge(cliente);
        }
        entityManager.remove(cliente);
    }


    @Transactional(readOnly = true)//transacao apenas leitura, o jpa nao vai cachear nada
    public List<Cliente> buscaNome(String nome){
        String jpql = "SELECT c FROM Cliente c WHERE c.nome like :nome"; //os : indicam o parametro no jpa
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class); //TypeQuery é uma query tipada
        query.setParameter("nome", "%" + nome + "%"); //indicar os parametros de consulta da pesquisa
        return  query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return entityManager.createQuery("FROM Cliente", Cliente.class).getResultList();
    }
}
