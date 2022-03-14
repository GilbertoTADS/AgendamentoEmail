package br.com.app.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.app.entidade.AgendamentoEmail;

@Stateless
public class AgendamentoEmailDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	 
	
	public List<AgendamentoEmail> listar(){
		return entityManager.createQuery("SELECT ae FROM AgendamenoEmail ae",
				AgendamentoEmail.class).getResultList();
		
	}


	public void inserir(AgendamentoEmail agendamentoEmail) {
		entityManager.persist(agendamentoEmail);
	}
	
}
