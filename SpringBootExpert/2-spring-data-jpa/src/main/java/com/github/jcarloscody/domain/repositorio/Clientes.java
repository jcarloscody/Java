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
    public Cliente salvar(Cliente cliente){
        entityManager.persist(cliente);
        return cliente;
    }

    @Transactional
    public Cliente atualizar (Cliente cliente){
        entityManager.merge(cliente);
        return cliente;
    }

    @Transactional
    public void deletar (Cliente cliente){
        Cliente cliente1=entityManager.find(Cliente.class, cliente.getId()); //
        entityManager.remove(cliente1);
    }

    @Transactional
    public void deletar (Integer id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        deletar(cliente);
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscaNome(String nome){
        String jpql = "SELECT c FROM Cliente c WHERE c.nome like :nome";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class); //TypeQuery é uma query tipada
        query.setParameter("nome", "%" + nome + "%");
        return  query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return entityManager.createQuery("FROM Cliente", Cliente.class).getResultList();
    }
}
